package org.example;

import java.time.Duration;
import java.time.LocalTime;
import java.time.Period;

import static java.time.Duration.*;

/*
3*. Запустите в 3 потока просчет количества всех простых чисел в интервале от 2 до 1000000.
Через 5 секунд завершите принудительно выполнение 1-го потока командой из главного.
Через 10 секунд завершите и 2-й поток.
Через 15 секунд - 3-й поток.
Время подкорректируйте под скорость своего компьютера.
 */
public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.println(" -- Main Start -- ");

        Runnable counting1 = () -> {
            int count = 0;
            for (int i = 2; i < 333334; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    if  ((System.currentTimeMillis() - startTime) == 5000) {
                        System.out.println(Thread.currentThread().getName() + " Прервался через 5 сек");
                        return;
                    }
                }
                if (isPrime) {
                    count++;
                    System.out.println(i);
                }
            }
            System.out.println(Thread.currentThread().getName() + " -> " + count);
        };

        Runnable counting2 = () -> {
            int count = 0;
            for (int i = 333335; i < 666667; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    if  ((System.currentTimeMillis() - startTime) == 15000) {
                        System.out.println(Thread.currentThread().getName() + " Прервался через 15 сек");
                        return;
                    }
                }
                if (isPrime) {
                    count++;
                    System.out.println(i);
                }
            }
            System.out.println(Thread.currentThread().getName() + " -> " + count);
        };

        Runnable counting3 = () -> {
            int count = 0;
            for (int i = 666667; i < 1000001; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                    if  ((System.currentTimeMillis() - startTime) == 10000) {
                        System.out.println(Thread.currentThread().getName() + " Прервался через 10 сек");
                        return;
                    }
                }
                if (isPrime) {
                    count++;
                    System.out.println(i);
                }
            }
            System.out.println(Thread.currentThread().getName() + " -> " + count);
        };




        Thread stream1 = new Thread(counting1);
        Thread stream2 = new Thread(counting2);
        Thread stream3 = new Thread(counting3);
        stream1.start();
        stream2.start();
        stream3.start();
        stream1.join();
        stream2.join();
        stream3.join();


        System.out.println("Time of processing " + (System.currentTimeMillis() - startTime));

        System.out.println(" -- Main Finish -- ");

    }
}

