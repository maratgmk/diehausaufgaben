package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
3) Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
 */
public class Task3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1","b5","c1","a2","b4","c1","a1");
        List<String> listResult = list.stream()
                .sorted(Comparator.reverseOrder())
                .distinct()
                .toList();
        System.out.println(listResult);

    }
}

