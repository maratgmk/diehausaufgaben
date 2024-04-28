package org.example;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*
3*. Для подъема на смотровую площадку работает лифт, в который одновременно может сесть не более 5 человек.
 Создайте группу людей.
Создайте программу-симулятор работы лифта, при разном количестве людей в группе(можно вводить с клавиатуры).
 */
public class Lift {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Elevator());

        int[] persons = {1, 2, 3, 4};
        for (int i = 0; i < persons.length; i++) {
            new Thread(
                    new Person(cyclicBarrier, persons[i])).start();
        }
    }
}


class Person implements Runnable {
    private int number;

    private CyclicBarrier cyclicBarrier;
    private Elevator elevator;

    public Person(CyclicBarrier cyclicBarrier, int number) {
        this.number = number;
        this.cyclicBarrier = cyclicBarrier;

    }


    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "  Входит в лифт и получает порядковый номер  " + number);
            cyclicBarrier.await(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | BrokenBarrierException ignore) {
        } catch (TimeoutException e) {
            System.out.println("В лифте достаточно места ");
            elevator.run();  //??? не вызывается метод 

        }
    }
}

class Elevator implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(" Лифт начал движение ");

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
