package org.example;

import java.util.Random;
import java.util.concurrent.Exchanger;

/*
1 уровень сложности: 1. Кассир в магазине. К нему подходят клиенты с товаром отдают ему деньги и получают сдачу.
По окончанию работы кассир подсчитывает сумму в кассе и сдает выручку.
Кассир и каждый покупатель - это отдельные потоки. Сымитируйте данный процесс работы. Сумма оплаты и
сумма сдачи может быть сгенерирована случайным образом, чтобы сдача была всегда меньше чем оплата.
Какой синхронизатор с библиотеки concurrent Вы бы использовали для данного процесса?
 */
public class Shop {
    public static void main(String[] args) {
        Random random = new Random();
        Exchanger<Integer> exchanger = new Exchanger<>();
        int back = random.nextInt(1,100);
        Cashier cashier = new Cashier(exchanger,back);
        int payment = random.nextInt(1,1000);
        Consumer consumer = new Consumer(payment,exchanger);
        Thread buy = new Thread(consumer);
        Thread sell = new Thread(cashier);
        sell.start();
        buy.start();

    }
}

class Cashier implements Runnable {
    private final Exchanger<Integer> exchanger;
    private int back;

    Cashier(Exchanger<Integer> exchanger, int back) {
        this.exchanger = exchanger;
        this.back = back;
    }

    @Override
    public void run() {
        System.out.println(" Кассир ждет оплату ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            int payment = exchanger.exchange(back);
            System.out.printf(" Кассир получил оплату %d и отдал сдачу %d\n", payment, back);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Consumer implements Runnable {
    private final Exchanger<Integer> exchanger;
    private int payment;

    public Consumer(int payment, Exchanger<Integer> exchanger) {
        this.payment = payment;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        System.out.println(" Покупатель передаёт деньги кассиру и ожидает сдачу");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            int back = exchanger.exchange(payment);
            System.out.printf("Покупатель отдал деньги %d и получил сдачу %d\n", payment, back);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

