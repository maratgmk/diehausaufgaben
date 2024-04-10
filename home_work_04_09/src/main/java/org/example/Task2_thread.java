package org.example;

import java.util.Scanner;

public class Task2_thread {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        long initiate = System.nanoTime();
        System.out.println(" --- Начало --- ");

        TaskThread task1 = new TaskThread(Integer.MIN_VALUE,-1500000,number);
        TaskThread task2 = new TaskThread(-1499999,-1000000,number);
        TaskThread task3 = new TaskThread(-999999,-500000,number);
        TaskThread task4 = new TaskThread(-499999,0,number);
        TaskThread task5 = new TaskThread(1,500000,number);
        TaskThread task6 = new TaskThread(501000,1000000,number);
        TaskThread task7 = new TaskThread(1000001,1500000,number);
        TaskThread task8 = new TaskThread(1500001,Integer.MAX_VALUE,number);
        task1.start();
        task2.start();
        task3.start();
        task4.start();
        task5.start();
        task6.start();
        task7.start();
        task8.start();

        task1.join();
        task2.join();
        task3.join();
        task4.join();
        task5.join();
        task6.join();
        task7.join();
        task8.join();

        System.out.println(Thread.currentThread().getName() + " Процесс шёл в течении времени " + (System.nanoTime() - initiate));
        System.out.println(" --- Конец --- ");



    }
}

class TaskThread extends Thread {
    int start;
    int end;
    int number;

    public TaskThread(int start, int end, int number) {
        this.start = start;
        this.end = end;
        this.number = number;
    }

    public void run() {
        long startTime = System.nanoTime();
        int count = 0;
        for (int i = start; i < end; i++) {
            if (i % number == 0) {
                count++;
            }
        }
        System.out.println(Thread.currentThread().getName() + "Количество делителей на число " + number + " равно " + count + " в диапазоне " + start + " ... " + end);
        System.out.println(Thread.currentThread().getName() + " Time of thread : " + (System.nanoTime() - startTime));
    }
}
