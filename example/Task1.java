package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;

/*1) Написать функциональный интерфейс Printable, который содержит один метод void print(String text).
Используя этот интерфейс, напишите lambda выражения для печати переданного текста большими буквами,
и маленькими буквами.
Возможно ли данный интерфейс заменить одним из стандартных функциональных интерфейсов?
Если да, приведите пример.
 */
public class Task1 {
    public static void main(String[] args) {
        Printable printable = (String string) -> System.out.println(string.toUpperCase(Locale.ROOT));
        printable.print("В лесу раздавался топор дровосека...");
        Printable1 printable1 = () -> {
            System.out.println("Nothing to print".toLowerCase(Locale.ROOT));
            System.out.println("Print again...".toUpperCase(Locale.ROOT));
            return;
        };
        printable1.print();

        Consumer<String> stringConsumer = (x)-> System.out.println(x);
        stringConsumer.accept("String is immutable");
        stringConsumer = (x)->{
            System.out.println("Print " +x);
            System.out.println("Print twice " +x+" " +x);
            return;
        };

        int[] arr = {1,3,5,7,6,4,2};
        stringConsumer.accept(Arrays.toString(arr));



    }
    @FunctionalInterface
    interface Printable{
        void print(String string);
    }
    @FunctionalInterface
    interface Printable1{
        void print();
    }
}
