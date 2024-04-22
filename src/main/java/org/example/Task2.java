package org.example;

import java.util.Scanner;

/*
2*. Создайте 2 потока (1 - Курица, 2 - Яйцо).
Первый будет постоянно выводить слово "Курица" и останавливаться на 1 сек.
Второй будет постоянно выводить слово "Яйцо" и тоже останавливаться на 1 сек.
Главный поток выводит на экран сообщение "Кто же первый?, и запускает оба дочерних потока.
Потом главный поток спрашивает у пользователя: "Кто же прав?"
Если пользователь вводит 1, главный поток выключает поток, который выводит "Яйцо".
Если вводит 2, главный поток выключает дочерний поток, который выводит "Курица".
Иначе выключает оба потока и возвращает фразу "Как же вы надоели!".
 */
public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getState());
        Scanner scanner = new Scanner(System.in);

        Thread hen = new Thread() {
            public void run() {
                while (!Thread.interrupted()) {
                    System.out.println(" Курица ");
                    try {
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        System.out.println(" Я, курица замолкаю, голос Яйцу!");
                        return;
                    }
                }
            }
        };

        Thread egg = new Thread(() -> {

            while (!Thread.interrupted()) {
                System.out.println(" Яйцо ");
                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    System.out.println("Я, яйцо замолкаю, голос Курице!");
                    return;
                }
            }
        });
        System.out.println(" Кто же первый? ");
        hen.start();
        egg.start();
      //  hen.join(); //????
     //   egg.join(); //?????
        Thread.sleep(5000);
        System.out.println(" Кто же прав? ");
        int number = scanner.nextByte();
        if(number == 1){
            hen.interrupt();
        }else if(number == 2){
            egg.interrupt();
        }else {
            egg.interrupt();
            hen.interrupt();
            System.out.println(" Как же вы надоели ");
        }

        System.out.println(Thread.currentThread().getName() + "  " + Thread.currentThread().getState());
    }
}
