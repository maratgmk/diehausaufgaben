package org.example;
/*
2*. Сосчитайте количество всех целых чисел в диапазоне от Integer.MINVALUE до Integer.MAXVALUE,
которые делятся на введенное пользователем число number без остатка.
Просчитайте время, которое необходимо для вычисления данного результата в одном потоке.
Просчитайте время, которое необходимо пользователю для выполнения этих задачи параллельно,
количество создаваемых потоков countThreads пользователь тоже должен ввести вручную.
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число в диапазоне от -2^31 до 2^31-1");
        int number = scanner.nextInt();
        countInteger(number);

    }
    public static void countInteger(int number){
        long start = System.nanoTime();
        int count = 0;
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE ; i++) {
            if(i % number == 0){
              //  System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
        System.out.println("Time of process :" + (System.nanoTime() - start));
    }
}
