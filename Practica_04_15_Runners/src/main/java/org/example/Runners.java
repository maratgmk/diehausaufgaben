package org.example;

import java.util.Random;

public class Runners {
    public static void main(String[] args) {

            System.out.println("Start Main");
            Runner runner1 = new Runner();
            Runner runner2 = new Runner();
            Runner runner3 = new Runner();

            Thread thread1 = new Thread(runner1);
            Thread thread2 = new Thread(runner2);
            Thread thread3 = new Thread(runner3);

            thread1.start();
            thread2.start();
            thread3.start();

            try {
                thread1.join();
                thread2.join();
                thread3.join();
                System.out.println(runner1.duration);
                System.out.println(runner2.duration);
                System.out.println(runner3.duration);


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            System.out.println("Finish Main");
        }

        static class Runner implements Runnable{
            private long duration;
            Random random = new Random();

            @Override
            public void run() {
                try {
                    long start = System.currentTimeMillis();
                    System.out.println(Thread.currentThread().getName() + "   Start");
                    Thread.sleep(10000 + random.nextInt(10000));
                    System.out.println(Thread.currentThread().getName() + "   Finish");
                    long end = System.currentTimeMillis();
                    duration = end - start;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }

    }

