package org.example;

import java.util.List;

/*
 1 уровень сложности: 1) Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
Сколько раз объект «Big» встречается в коллекции?
 */
public class Task1 {
    public static void main(String[] args) {
        List<String> list = List.of("BigBen","BigBob","Big","Ben","Big Bob");
        long n = list.stream()
                .filter(p-> p.equals("Big"))
                .count();
        System.out.println("Объект Big встречается " + n);


    }
}
