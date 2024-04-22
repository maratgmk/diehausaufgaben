package org.example;

/*
 1 уровень сложности: 1. Запустите в 3 потока подсчета суммы всех чисел, который без остатка делятся на 17, в интервале от 0 до 10 млн.
  Показывайте на экран, как будет накапливаться сумма по каждому потоку.
После запуска подсчета, главный поток остановите на 1 секунду и завершите его. Все дочерние потоки должны автоматически закрыться.
 */
public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Начало Main");
        System.out.println("Состояние потока Main  " + Thread.currentThread().getState());

        Count counting1 = new Count(0, 3300000);
        Count counting2 = new Count(3300001, 6600000);
        Count counting3 = new Count(6600001, 10000000);
        Thread thread1 = new Thread(counting1);
        Thread thread2 = new Thread(counting2);
        Thread thread3 = new Thread(counting3);


        thread1.setDaemon(true);
        thread2.setDaemon(true);
        thread3.setDaemon(true);

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Состояние потока " + thread1.getName() + "  " + thread1.getState());
        System.out.println("Состояние потока " + thread2.getName() + "  " + thread2.getState());
        System.out.println("Состояние потока " + thread3.getName() + "  " + thread3.getState());

        Thread.sleep(7000);
        System.out.println("Состояние потока Main  " + Thread.currentThread().getState());

        System.out.println(Thread.currentThread().getName() + "  ->  " + thread1.isInterrupted());
        System.out.println(Thread.currentThread().getName() + "  ->  " + thread2.isInterrupted());
        System.out.println(Thread.currentThread().getName() + "  ->  " + thread3.isInterrupted());


        System.out.println("Состояние потока Main  " + Thread.currentThread().getState());


        System.out.println("Конец Main");
        System.out.println("Состояние потока Main  " + Thread.currentThread().getState());
        System.out.println("Состояние потока " + thread1.getName() + "  " + thread1.getState());
        System.out.println("Состояние потока " + thread2.getName() + "  " + thread2.getState());
        System.out.println("Состояние потока " + thread3.getName() + "  " + thread3.getState());

    }

    static class Count implements Runnable {
        private long start;
        private long end;

        public Count(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            long sum = 0;
            for (long i = start; i < end; i++) {
                if (i % 17 == 0) {
                    sum = sum + i;
                    System.out.println(Thread.currentThread().getName() + " -->  " + sum);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}
