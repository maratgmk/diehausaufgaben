package org.example;

import java.util.*;

/*4)* Сгруппируйте слова с одинаковым набором символов, желательно используя Map.
Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
вход: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
Выход:
student, students,
cat, act,
dog, god,
flow, wolf4
 */
public class Task4 {
    public static void main(String[] args) {
        String[] words = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};

        System.out.println(Arrays.toString(words));
        findWords(words);

    }

    private static void findWords(String[] words) {
        Map<String, char[]> stringChar = new HashMap<>();
        List<char[]> charList = new ArrayList<>();

        for (String word : words) {
            stringChar.put(word, word.toCharArray());
        }
        for (Map.Entry<String, char[]> entry : stringChar.entrySet()) {
            System.out.println(entry.getKey() + " ," + Arrays.toString(entry.getValue()));
            System.out.println(charList.add(entry.getValue()));
        }
        for (int i = 0; i < charList.size(); i++) {
            System.out.println(charList.get(i));
        }
    }
}
