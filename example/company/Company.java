package org.example.company;

import java.util.concurrent.atomic.AtomicInteger;

/*
2*. Одна компания решила заработать миллион. Для этого они решили создать курсы, где за 1000
можно обучиться чему-то очень интересному и полезному:
они наняли преподавателей, которые получают 10% от суммы оплаты каждого студента.
Напишите программу, которая даст возможность набирать студентов на курс до тех пор,
пока компания не заработает миллион:) Используйте AtomicInteger для накопления.
 */
public class Company {
    public static void main(String[] args) {
        AtomicInteger million = new AtomicInteger(0);

        while (million.get() < 1000000){
           Student student =  new Student(1000,10,million);
           million.addAndGet(1000*10/100);
           student.start();
        }
        System.out.println("Прибыль достигла " + million);
    }
}
