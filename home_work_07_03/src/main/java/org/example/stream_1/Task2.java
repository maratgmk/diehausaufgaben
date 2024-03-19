package org.example.stream_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Task2 {
    public static void main(String[] args) {
        // Задача 1: Фильтрация четных чисел и умножение на 2.
       List<Integer> integers = List.of(1, 3, 5, 7, 9, 2, 4, 6, 12, 24, 11);
        System.out.println(integers.stream().filter(i -> i % 2 == 0).map(i -> i * 2).toList());

        // Задача 2: Удаление дубликатов из списка строк
        System.out.println(List.of("One", "Two", "Five", "One", "Two", "Seven", "One").stream().distinct().toList());

        // Задача 3: Сортировка списка чисел в порядке убывания и выбор первых трех элементов.
        System.out.println(List.of(1, 4, 6, 9, 24, 3, 56, 7, 11).stream().sorted(Comparator.reverseOrder()).limit(3).toList());

        // Задача 4: Фильтрация строк, начинающихся на "A" и преобразование в верхний регистр.
        System.out.println(List.of("Baaa", "Abbb", "accc", "Accc", "Daaa", "Aggg").stream().filter(s -> s.startsWith("A"))
                .map(s -> s.toUpperCase()).toList());

        // Задача 5: Пропуск первых двух элементов и вывод оставшихся.
        System.out.println(List.of("One", "Two", "Five", "One", "Two", "Seven", "One").stream().skip(2).toList());

        // Задача 6: Фильтрация чисел больше 50 и вывод их квадратов.
        System.out.println(List.of(1, 4, 6, 9, 24, 3, 56, 7, 11, 64).stream().filter(i -> i > 50).map(i -> i * i).toList());

        // Задача 7: Оставить только слова, содержащие букву "o" и вывести их в обратном порядке.
        System.out.println(List.of("One", "Two", "Five", "One", "Two", "Seven", "One", "Four").stream().filter(s -> s.contains("o"))
                .sorted(Comparator.reverseOrder()).toList());

        // Задача 8: Фильтрация чисел, оставить только нечетные и вывести их в порядке возрастания.
        System.out.println(List.of(1, 4, 6, 9, 24, 3, 56, 7, 11, 64, 55).stream().filter(i -> i % 2 == 1).sorted().toList());

        // Задача 9: Получить среднее значение чисел в списке.
         int sum = List.of(1, 4, 6, 9, 24, 3, 56, 7, 11, 64, 55).stream().reduce(0,(i,j) -> (i + j));
         long num = List.of(1, 4, 6, 9, 24, 3, 56, 7, 11, 64, 55).stream().count();
        System.out.println("Среднее значение " + sum/num);

        // Задача 10: Получить строку, объединяющую элементы списка через запятую.
        String union = List.of("One", "Two", "Five", "One", "Two", "Seven", "One", "Four").stream()
                .reduce("",(s1,s2) -> s1 + ", " + s2);
        System.out.println(union);
     String unionU = union.replace(",", "").replace(" ","");
     System.out.println(Arrays.toString(unionU.toCharArray()));

     // Задача 11: Получить список квадратов чисел из другого списка.
     List<Integer> list1 = List.of(1, 4, 6, 9, 24, 3, 56, 7, 11, 64, 55);
     List<Integer> list2 = List.of(13, 41, 68, 91, 243);
     System.out.println(list1.stream().flatMap(i -> list2.stream().map(j -> j * j)).distinct().toList());

     // Задача 12: Получить список букв из списка слов и вывести их в алфавитном порядке. ??????
     List<String> stringList = List.of("One", "Two", "Five", "One", "Two", "Seven", "One", "Four");

     // Задача 13: Получить первые 3 строки из списка и вывести их в обратном порядке.
     List<Integer> list = List.of(1, 4, 6, 9, 24, 3, 56, 7, 11, 64, 55);
     System.out.println(list.stream().limit(3).sorted(Comparator.reverseOrder()).toList());

     // Задача 14: Пропустить первые 2 элемента и оставить только уникальные.
     System.out.println(List.of("One", "Two", "Five","Four", "One", "Two", "Seven", "One", "Four","Two").stream()
             .skip(2).distinct().collect(Collectors.toList()));

     // Задача 15: Фильтрация и сортировка пользователей по возрасту.
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

     System.out.println(users.stream().filter(user -> user.getAge() > 18).sorted((u1, u2) -> u2.getAge() - u1.getAge()).toList());


    }
}
