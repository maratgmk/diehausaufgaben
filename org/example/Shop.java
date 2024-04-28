package org.example;

import java.util.concurrent.Semaphore;

/*
 1. У вас в магазине распродажа. К вам набежало 10 000 клиентов, вы пытаетесь корректно всех обслужить с учетом того,
что одновременно у вас внутри магазина может находиться не более 10 покупателей(согласно карантинным нормам),
и время обслуживания одного покупателя занимает 30 секунд (это время можно менять, чтобы увидеть окончание работы). Сымитируйте данный процесс работы и
подсчитайте за какой период времени вы сможете обслужить данный объем покупателей?
Отдельный покупатель - отдельный поток. Какой синхронизатор с библиотеки concurrent Вы бы использовали?
 */
public class Shop {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("Магазин начал обслуживать покупателей ");
        Semaphore semaphore = new Semaphore(10, true);
        for (int i = 0; i < 1000; i++) {
            Consumer consumer = new Consumer(semaphore);
            new Thread(consumer).start();
            Thread.sleep(3);
        }
        long end = System.currentTimeMillis();
        System.out.println(" Магазин закончил обслуживать покупателей за время " + (end - start));
    }
}

class Consumer implements Runnable {
    private Semaphore semaphore;

    public Consumer(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {


        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " покупатель  вошёл в магазин ");
            Thread.sleep(30);
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " покупатель вышел довольный ");

    }
}