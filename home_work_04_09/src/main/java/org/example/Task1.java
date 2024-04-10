package org.example;

import java.util.Scanner;

/*
 1. Пользователь с клавиатуры вводит цифру. Вы создаете динамически нужное количество потоков равное
введенной цифре, нумеруете их и запускаете на выполнение.
Каждый поток должен выводить свой номер на экран 100 раз с интервалом 100 миллисекунд перед каждым выводом.
Сделайте так, чтобы главный поток выполнения программы не завершился до окончания работы всех дочерних потоков.
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
       // int number = scanner.nextInt();
        System.out.println(" --- Начало процесса --- ");


        StreamThread stream1 = new StreamThread();
        StreamThread stream2 = new StreamThread();
        StreamThread stream3 = new StreamThread();

        stream3.start();
        stream1.start();
        stream2.start();
        stream1.join();
        stream2.join();
        stream3.join();

        System.out.println(" --- Конец процесса --- ");
    }


}

class StreamThread extends Thread {

    public void run() {
        int count = 0;
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            count++;
            System.out.println(Thread.currentThread().getName() + " -> Вывод номер потока " + count + " раз");
        }
    }
}


