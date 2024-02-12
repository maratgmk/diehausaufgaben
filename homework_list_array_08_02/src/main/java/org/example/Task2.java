package org.example;

import java.util.ArrayList;
import java.util.List;

/*
Перебрать ArrayList<Integer> и найти наименьший элемент.
Перебрать ArrayList<String> и найти количество элементов, начинающихся с определенной буквы.
Создать ArrayList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.
 */
public class Task2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(23, -34, 28, 37, 4, 0, 8, -18, 47, -85);
        System.out.println(getMin(numbers));

        List<String> strings = List.of("Alfa", "Beta", "Blue", "Green", "Bob", "Red", "Grey", "Black", "Gans", "Ring");
        System.out.println(countString(strings,'B'));


        List<Cat> cats = new ArrayList<>();

          Cat cat1 = new Cat("Green",8);
          Cat cat2  = new Cat("Yellow",7);
          Cat cat3 = new Cat("Red",2);
          Cat cat4 = new Cat("Grey",12);
          Cat cat5 = new Cat("Black",3);
          cats.add(cat1);
          cats.add(cat2);
          cats.add(cat3);
          cats.add(cat4);
          cats.add(cat5);
        System.out.println(removeElement(cats, 7));
    }

    public static int getMin(List<Integer> numbers) {
        int min = numbers.getFirst();
        for (Integer number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    public static int countString(List<String> strings, char symbol) {
        int count = 0;
        for (String string : strings) {
            char ch = string.toCharArray()[0];
            if (ch == symbol) count++;

        }
        return count;
    }

    public static List<Cat> removeElement(List<Cat> cats,int age) {
        for (int i = cats.size() - 1; i >= 0; i--) {
            if(cats.get(i).getAge() < age) cats.remove(i);

        }
        return cats;
    }


}

