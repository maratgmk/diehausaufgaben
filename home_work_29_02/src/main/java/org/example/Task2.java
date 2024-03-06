package org.example;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*2*)  - Создать лямбда выражение, которое возвращает значение true,
   если строка не null, используя функциональный интерфейс Predicate.
  - Создать лямбда выражение, которое проверяет, что строка не пуста,
   используя функциональный интерфейс Predicate.
  - Написать программу проверяющую, что строка не null и не пуста,
    используя функциональный интерфейс Predicate.
  - Написать программу, которая проверяет, что строка начинается буквой “J”или “N”
    и заканчивается “A”. Используем функциональный интерфейс Predicate.
  - Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
    “Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
  - Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
    Используем функциональный интерфейс Supplier.
 */
public class Task2 {
    public static void main(String[] args) {
        Predicate<String> predicate = (string) -> {
            boolean pred = string != null;
            return pred;
        };
        System.out.println(predicate.test(null));
        System.out.println(predicate.test("A"));

        Predicate<String> predicate1 = (string -> string != null);
        System.out.println(predicate1.test(""));
        System.out.println();

        Predicate<String> predicate2 = string -> !string.isEmpty();
        System.out.println(predicate2.test(""));
        System.out.println(predicate2.test(" "));
        System.out.println();

        Predicate<String> predicate3 = string -> !(string == null || string.isEmpty());
        System.out.println(predicate3.test("A"));
        System.out.println(predicate3.test(""));
        System.out.println(predicate3.test(null));
        System.out.println();

        Predicate<String> predicate4 = string -> string.startsWith("J") && string.endsWith("A") || string.startsWith("N") && string.endsWith("A");
        System.out.println(predicate4.test("JenA"));
        System.out.println(predicate4.test("NinA"));
        System.out.println(predicate4.test("GinA"));
        System.out.println(predicate4.test("NinO"));
        System.out.println();

        Function<Double, String> function = (x) -> {
            if (x > 0) {
                System.out.println(String.valueOf(x) + " Число положительно ");
            } else if (x < 0) {
                System.out.println(String.valueOf(x) + " Число отрицательно ");
            } else {
                System.out.println(String.valueOf(x) + " Ноль");
            }
            return String.valueOf(x);
        };
        System.out.println(function.apply(4.56));
        System.out.println();

        Supplier supplier = ()-> ThreadLocalRandom.current().nextInt(10);
        System.out.println(supplier.get());
    }
}
