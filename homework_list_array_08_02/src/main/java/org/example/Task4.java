package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*Перебрать ArrayList<Integer> и найти сумму квадратов всех элементов.
Перебрать ArrayList<String> и найти самую короткую строку.
Перебрать ArrayList<String> и заменить все гласные буквы в каждой строке на символ '*'.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Double> numbers = List.of(2.56, 5.47, 8.9, 3.9, Math.E, Math.PI);
        System.out.println(findSquareOfElements(numbers));

        List<String> words = List.of("gagihhuh", "hdhaaadhhjooodjdjd", "uiuear", "2u2a", "yeue", "12");
        System.out.println(findShortest(words));
        System.out.println(getShortestBySorting(words));

//        System.out.println(words.get(2).toCharArray());
//        System.out.println(words.get(2).toCharArray()[3]);
//        System.out.println(words.get(2));
//
//        String s = new String(new char[] {'w','5','/','$','D'} );
//        System.out.println(s);
//        String t = new String(new char[] {'w','5','/','$','D','6','!',')','<','S','&'} );
//        String ts = new String(new char[] {'w','5','/','$','D','6','!',')','<','S','&'}, 2,8 );
//        System.out.println(t);
//        System.out.println(ts);
        System.out.println(replaceVowel(words));


    }

    public static int findSquareOfElements(List<Double> numbers) {
        int result = 0;
        for (Double number : numbers) {
            result = (int) (result + Math.pow(2, number));
        }
        return result;
    }

    public static String findShortest(List<String> strings) {
        String shortest = strings.getFirst();
        for (String s : strings) {
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }
        return shortest;
    }
    public static String getShortestBySorting(List<String> strings) {
        List<String> clone = new ArrayList<>(strings);
        clone.sort(Comparator.comparingInt(String::length));
        return clone.getFirst();
    }



    public static List<String> replaceVowel(List<String> strings) {
        List<String> words = new ArrayList<>();
        for (String string : strings) {
            String replaced = getWithAsterisk(string);
            words.add(replaced);
        }
        return words;
    }
    public static String getWithAsterisk(String string) {
        List<Character> toReplace = List.of('a','e','i','o','u');
            char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(toReplace.contains(chars[i])){
                chars[i] = '*';
            }
        }
        return String.valueOf(chars);

    }


}
