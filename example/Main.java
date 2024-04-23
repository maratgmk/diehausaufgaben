package org.example;

import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;


public class Main {
    public static void main(String[] args) throws InterruptedException {
/*
 1 уровень сложности: 1. На соревнованиях 5 спортсменов начинают одновременно стрелять в одну мишень.
Если кто-нибудь в нее попадает(сделать Random-но), то мишень разрушается и другие в нее уже попасть не могут,
но что-то пошло не так. Исправь программу, чтобы другие потоки "видели" изменения значения
переменной isHit и больше его не меняли. Как только мишень разрушена кем то из стрелков,
соревнования прекращаются. Воспользуйся классом AtomicBoolean и его методами.
 */
        System.out.println(" --- Competition Start --- ");
        AtomicInteger purpose = new AtomicInteger(56);
        AtomicBoolean isHeat = new AtomicBoolean(false);

        Shooter shooter1 = new Shooter("Bob",isHeat,purpose);
        Shooter shooter2 = new Shooter("Tom",isHeat,purpose);
        Shooter shooter3 = new Shooter("Ann",isHeat,purpose);
        Shooter shooter4 = new Shooter("Sam",isHeat,purpose);
        Shooter shooter5 = new Shooter("Kat",isHeat,purpose);
        Thread thread1 = new Thread(shooter1);
        Thread thread2 = new Thread(shooter2);
        Thread thread3 = new Thread(shooter3);
        Thread thread4 = new Thread(shooter4);
        Thread thread5 = new Thread(shooter5);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();
        thread5.join();


        System.out.println(" --- Competition Finish --- ");


    }

    static class Shooter implements Runnable {
        private String name;
       private  AtomicBoolean isHit;
        private  AtomicInteger purpose;

        public Shooter(String name, AtomicBoolean isHit, AtomicInteger purpose) {
            this.name = name;
            this.isHit = isHit;
            this.purpose = purpose;
        }

        Random random = new Random();


        @Override
        public void run() {
            while (!isHit.get()){

                if (purpose.get() == random.nextInt(100)) {
                    isHit.set(true);
                    System.out.println(name + " В яблочко!  isHeat " + isHit);
                    break;  // прерывает потоки не сразу = продолжают стрелять и поражать мишени
                } else  {
                    isHit = new AtomicBoolean(false);
                    System.out.println(name + " Молоко! ...  isHeat " + isHit);
                }

            }
        }
    }
}