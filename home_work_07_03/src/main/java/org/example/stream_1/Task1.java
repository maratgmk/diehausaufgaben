package org.example.stream_1;
//Задание 1: Фильтрация списка целых чисел на нечетные числа
//Задание 2: Преобразование списка строк в список чисел
//Задание 3: Суммирование списка чисел
//Задание 4: Определение максимального значения в списке
//Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
//Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
//Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
//Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
//Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
        public static void main(String[] args) {
            //Задание 1: Фильтрация списка целых чисел на нечетные числа
            List<Integer> list = Arrays.asList(3, 4, 7, 9, 11, 22, 21, 2, 8, 1, 10);
            List<Integer> listOdd = list.stream()
                    .filter(p -> p % 2 == 1)
                    .toList();
            System.out.println(listOdd);
            //Задание 2: Преобразование списка строк в список чисел
            List<String> stringList = Arrays.asList("23", "541", "1", "78", "298", "12", "5676473");
            List<Integer> integerList = stringList.stream()
                    .map(Integer::parseInt)
                    .toList();
            System.out.println(integerList);
            //Задание 3: Суммирование списка чисел
            int sum = list.stream()
                    .reduce(0, (acc, x) -> acc + x);
            System.out.println(sum);
            System.out.println();

            //Задание 4: Определение максимального значения в списке
            System.out.println("Максимальное число в списке " + list.stream().max((i1, i2) -> i1 - i2));
            System.out.println("Максимальное число в списке " + list.stream().sorted(Comparator.reverseOrder()).limit(1).toList());
            System.out.println();
            //Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
            List<String> strings = List.of("abs", "Bac", "caB", "ccc", "cDA");
            System.out.println(strings.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).toList());
            System.out.println();
            //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
            List<String> words = List.of("abcd", "abcde", "abcd", "abcde", "abcdef", "abcdefg", "abcde");
            System.out.println(words.stream().filter(s -> s.length() > 4).distinct().toList());
            System.out.println();
            //Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
            List<User> users = Arrays.asList(new User("user1", 32),
                    new User("user2", 65),
                    new User("user3", 23),
                    new User("user4", 43),
                    new User("user5", 10),
                    new User("user6", 42),
                    new User("user7", 23),
                    new User("user8", 13),
                    new User("user9", 7),
                    new User("user10", 16),
                    new User("user11", 15),
                    new User("user12", 93));
            System.out.println(users.stream().sorted((u1, u2) -> u2.getAge() - u1.getAge()).map(User::getName).toList());
            System.out.println(users.stream().sorted((u1, u2) -> u2.getAge() - u1.getAge()).map(User::getAge).toList());
            System.out.println();
            //Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
            List<Integer> integers = Arrays.asList(3, 4, 7, 9, 11, 22, 21, 2, 8, 1, 10,15,27,5,25,45,60);
            System.out.println(integers.stream().filter(n -> n % 3 == 0 && n % 5 == 0).reduce(0, (acc, n) -> acc + n));
            System.out.println();
            //Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк
            List<String> list1 = Arrays.asList("a","bac","cb","dgh","fkl","fakel");
           // System.out.println(Arrays.toString(list1.stream().flatMap(s -> Arrays.stream(s.split(" "))).toArray()));
          //  List<Character> characters = list1.stream().flatMap(str -> Arrays.stream(str.toCharArray())).collect(Collectors.toList());


        }
    }

