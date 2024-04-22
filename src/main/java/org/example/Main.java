package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(" -- Main Start -- ");
        Runnable counting1 = () -> {
            int count = 0;

            for (int i = 2; i < 330331; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime){
                    count++;
                    System.out.println(i);
                }

            }
            System.out.println(Thread.currentThread().getName() + " -> " + count);;
        };
        Thread stream1 = new Thread(counting1);
        stream1.setDaemon(true);
        stream1.start();
        Thread.sleep(10);
      //  stream1.join();


        System.out.println(" -- Main Finish -- ");
        System.out.println("Поток stream1 прервался после после завершения потока Main проработав  10 millisecond и по инерции ещё чуток " );

    }

}