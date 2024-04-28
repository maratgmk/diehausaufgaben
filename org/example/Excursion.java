package org.example;

import java.util.concurrent.CountDownLatch;

/*
2*. Вы едете на экскурсию. Каждый человек, при входе в автобус, называет свою фамилию.
Экскурсовод ставит у себя в блокноте птичку и если количество людей по списку совпадает,
автобус уезжает на экскурсию. Сымитируйте данный процесс работы.
Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?
 */
public class Excursion {
    public static void main(String[] args) throws InterruptedException {
        String[] lastNames = {"Green","Black","Brown","White","Yellow","Blue","Orange"};
        CountDownLatch countDownLatch = new CountDownLatch(lastNames.length);
        for (int i = 0; i < lastNames.length; i++) {
            new Thread(new Tourist(lastNames[i],countDownLatch)).start();
            Thread.sleep(2000);
        }

    }
}

class Tourist implements Runnable {
    private String lastName;
    private CountDownLatch countDownLatch;

    public Tourist(String lastName, CountDownLatch countDownLatch) {
        this.lastName = lastName;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getName() + " моя фамилия + " + lastName);
            System.out.println("Галочка поставлена");
            System.out.println(lastName + " сел в кресло и ожидает заполнения автобуса ");
            countDownLatch.await();
            System.out.println(lastName + " едет на экскурсию ");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
