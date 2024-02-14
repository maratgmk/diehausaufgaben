package org.example;

import java.util.*;

/* 2*. -  создать лист, наполнить его 10 млн.элементов
   -  внутри тела просто будем присваивать i-тый элемент в переменную temp
   -  перебрать весь список и замерять время выполнения:
      а) с помощью for-each loop
      b) классический for, с выполнением условия i<list.size()
      c) классический for, но проходим список с конца до начала (i--)
      d) используя Iterator
      e) используя ListIterator и перемещаясь от начала списка до конца
      e) используя ListIterator с перемещением от конца списка к началу
   Замер производительности делать для каждого из подпунктов отдельно,
   используя например сходный шаблон кода:  инструкцию java:
           long startTime = System.currentTimeMillis();
           //...... Ваша реализация перебора списка, например
           for (int i : list) {
               int temp = i;
           }
           long endTime = System.currentTimeMillis();
           System.out.println("for-each loop: " + (endTime - startTime));
   время выполнения каждого перебора вывести в консоль.
   Определите, какой вариант перебора списка работает быстрее всего.
 */
public class LinkedListTime {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < 10000000; i++) {
            integers.add(i, i);
        }
        System.out.println(integers.size());

        long startTime = System.currentTimeMillis();
        for (Integer n : integers) {
            int temp = n;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("for each loop: " + (endTime - startTime) + " LinkedList");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < integers.size(); i++) {
            int temp = i;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("for i loop: " + (endTime1 - startTime1) + " LinkedList");

        long startTime2 = System.currentTimeMillis();
        for (int i = integers.size(); i >= 0 ; i--) {
            int temp = i;
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("for i loop reverse: " + (endTime2 - startTime2) + " LinkedList");

        Iterator<Integer> iterator = integers.iterator();
        long startTime3 = System.currentTimeMillis();
        while (iterator.hasNext()){
            int temp = iterator.next();
        }
        long endTime3 = System.currentTimeMillis();
        System.out.println(" for iterator loop: " + (endTime3 - startTime3) + " LinkedList");

        ListIterator<Integer> listIterator = integers.listIterator();

        long startTime4 = System.currentTimeMillis();
        while (listIterator.hasNext()){
            int temp = listIterator.next();
        }
        long endTime4 = System.currentTimeMillis();
        System.out.println(" for listIterator loop: " + (endTime4 - startTime4) + " LinkedList");

        long startTime5 = System.currentTimeMillis();
        while (listIterator.hasPrevious()){
            int temp = listIterator.previous();
        }
        long endTime5 = System.currentTimeMillis();
        System.out.println(" for listIterator loop reverse: " + (endTime5 - startTime5) + " LinkedList"  );

    }
}