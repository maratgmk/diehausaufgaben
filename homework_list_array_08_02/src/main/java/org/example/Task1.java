package org.example;

import java.util.ArrayList;
import java.util.List;

/*1)
Найти сумму всех элементов ArrayList<Integer>.
Перебрать ArrayList<String> и вывести все элементы на экран.
Создать ArrayList с объектами вашего собственного класса и вывести их на экран.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        System.out.println(array.size());
        array = List.of(2,45,23,-1,-57,128,389,1);
        System.out.println(array.size());
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum = sum + array.get(i);
        }
        System.out.println(sum);
        for (Integer i : array) {
            System.out.println(i);
        }
        List<Cat> cats = List.of(
                new Cat("Green",8),
                new Cat("Yellow",7),
                new Cat("Blue",4),
                new Cat("Red",2),
                new Cat("Grey",12),
                new Cat("Black",3));
        for (Cat cat : cats) {
            System.out.println(cat);
            cat.makeSound();
        }





    }
}
