package org.example;

import java.util.ArrayList;
import java.util.List;

/*3*)
Перебрать ArrayList<Integer> и удалить все четные числа.
Перебрать ArrayList<String> и объединить все элементы в одну строку.
Создать ArrayList с объектами вашего собственного класса и вывести только те, которые удовлетворяют определенному условию.
 */
public class Task3 {
    public static void main(String[] args) {
        List<Integer> numbs = List.of(1,12,45,77,5,25,44,56,92,37);
        List<Integer> integers = new ArrayList<>(numbs);
        System.out.println(integers);
        System.out.println(removeEven(integers));

        List<String> text = List.of("One","two","Three","Four","five","six","seVEN");
        List<String> words = new ArrayList<>(text);
        System.out.println(words);
        System.out.println(joinToString(words));

        List<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Green",8);
        Cat cat2  = new Cat("Yellow",3);
        Cat cat3 = new Cat("Red",3);
        Cat cat4 = new Cat("Grey",12);
        Cat cat5 = new Cat("Black",3);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);
        System.out.println(checkAgeOfCat(cats, 3));

    }
    public static List<Integer> removeEven(List<Integer> integers) {
        for (int i = integers.size() - 1; i >= 0 ; i--) {
            if(integers.get(i)%2 == 0)integers.remove(i);
        }
        return integers;
    }
    public static String joinToString(List<String> words) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder = stringBuilder.append(word);
        }
        return stringBuilder.toString();
    }
    public static List<Cat> checkAgeOfCat(List<Cat> cats, int age) {
        List<Cat> pets = new ArrayList<>();
        for (Cat cat : cats) {
            if (cat.getAge() == age) {
                pets.add(cat);
            }
        }
        return pets;
    }
}
