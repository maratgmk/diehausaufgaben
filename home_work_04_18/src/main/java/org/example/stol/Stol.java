package org.example.stol;

import java.util.Arrays;

public class Stol {
   boolean isEmpty = false;
    public synchronized void putDetail(Detail detail){
        if(isEmpty){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Taker забери деталь со стола");
        System.out.println(detail);
        isEmpty = true;
        notify();
    }

    public synchronized void takeDetail(Detail detail){
        if(!isEmpty){
            try {
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(" Я Putter забрал деталь со стола");
        System.out.println(detail);
        isEmpty = false;
        notify();
    }
}
