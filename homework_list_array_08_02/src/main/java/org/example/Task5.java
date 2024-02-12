package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*5*)
Перебрать ArrayList<Integer> и найти второй по величине элемент.
Перебрать ArrayList<Integer> и вывести все элементы в обратном порядке.
Перебрать ArrayList<String> и вывести все строки, содержащие только буквы.
Перебрать ArrayList<String> и найти самую длинную строку, не содержащую пробелов.
Создать ArrayList с объектами вашего собственного класса и отфильтровать только уникальные элементы
 */
public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>(List.of(2, 3, 8, 8,9,10));
        System.out.println(elements);
        System.out.println(elements.reversed()); // обратный порядок

        System.out.println(getMax(elements, true));

        List<String> strings = new ArrayList<>(List.of("123ghhh","jdjdjdj12","5252525","bx!!!TFFG","Yes"," No"));
        System.out.println(getWithLetter(strings));

        List<String> words = new ArrayList<>(List.of("hdhdhdhdhd","  ksksk ","jsjsj","djd dhjd eee","sjjsjdjdjdjdjdj"));
        System.out.println(findLongestWithoutSpace(words));

        System.out.println(isOnlyLetter("3hdhd"));

        List<Cat> cats = new ArrayList<>();
        Cat cat1 = new Cat("Green",8);
        Cat cat12 = new Cat("Green",8);
        Cat cat2  = new Cat("Yellow",7);
        Cat cat3 = new Cat("Red",2);
        Cat cat31 = new Cat("Red",2);
        Cat cat32 = new Cat("Red",2);
        Cat cat4 = new Cat("Grey",12);
        Cat cat14 = new Cat("Grey",12);
        Cat cat5 = new Cat("Black",3);
        cats.add(cat1);
        cats.add(cat12);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat31);
        cats.add(cat32);
        cats.add(cat4);
        cats.add(cat14);
        cats.add(cat5);
        System.out.println(cats);

        Set<Cat> uniqueCat = new HashSet<>(cats);

        System.out.println(Set.of(uniqueCat));


    }

    public static int getMax(List<Integer> integers, boolean isFirstTime) {
        List<Integer> clone = new ArrayList<>(integers);
        int max = clone.getFirst();
        for (Integer integer : clone) {
            if (integer > max) {
                max = integer;
            }
        }
        if (!isFirstTime) return max;
        for (int i = clone.size() - 1; i >= 0; i--) {
            if (clone.get(i) == max) clone.remove(clone.get(i));
        }
        return getMax(clone, false);
    }

    public static boolean isOnlyLetter(String string) {
        char[] chars = string.toCharArray();
        for (char el : chars) {
            if (!Character.isLetter(el)) return false;
        }
        return true;
    }

    public static List<String> getWithLetter(List<String> strings) {
        List<String> letters = new ArrayList<>();
        for (int i = strings.size() - 1; i >= 0 ; i--) {
            if(isOnlyLetter(strings.get(i))) letters.add(strings.get(i));
        }
        return letters;
    }

    public static String findLongest(List<String> strings) {
        String longest = strings.getFirst();
        for (String s : strings) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        return longest;
    }

    public static String findLongestWithoutSpace(List<String> strings) {
        List<String> clone = new ArrayList<>(strings);
        clone.removeIf(str -> str.contains(" "));
             return findLongest(clone);
    }

}

