package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
2) Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")
 */
public class Task2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1","b5","a2","b4");
        List<String> listResult =  list.stream()
               .sorted(Comparator.naturalOrder())
               .limit(1)
               .toList();


        System.out.println(listResult);

    }
}
