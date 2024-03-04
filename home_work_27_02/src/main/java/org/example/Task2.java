package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*2) У вас есть приют для животных, в которых живут коты.
Есть объект Cat с данными: имя, возраст, вес, порода.
создайте Map, ключом которого будет имя, а значением объект Cat.
информация о котах должна храниться в упорядоченном виде по имени.
выведите имена котов, порода которых равна N (на ваше усмотрение).
выведите список всех котов, вес которых больше значения М (на ваше усмотрение).
найдите кота с самым большим весом и возрастом одновременно.
 */
public class Task2 {
    public static void main(String[] args) {

        Map<String, Cat> cats = getStringCatMap();
        System.out.println(cats);
        System.out.println();
        for (Map.Entry<String, Cat> catEntry : cats.entrySet()) {
            if(catEntry.getValue().getBreed().equals("Персидский")) System.out.println("Персидская порода " + catEntry.getKey());
            if(catEntry.getValue().getBreed().equals("Сиамский")) System.out.println("Сиамская порода " + catEntry.getKey());
        }
        System.out.println();
        for (Map.Entry<String, Cat> catEntry : cats.entrySet()) {
            if(catEntry.getValue().getWeight() > 5.0) System.out.println("Вес больше 5 кг " + cats.get(catEntry.getKey()));
        }
        double maxWeight = 0;
        int maxAge = 0;
        for (Map.Entry<String, Cat> catEntry : cats.entrySet()) {
            if(catEntry.getValue().getWeight() > maxWeight)
                maxWeight = catEntry.getValue().getWeight();
        }
        for (Map.Entry<String, Cat> catEntry : cats.entrySet()) {
            if(catEntry.getValue().getAge() > maxAge)
             maxAge = catEntry.getValue().getAge();
        }
        System.out.println("Самый большой вес " + maxWeight+", самый большой возраст "+maxAge);





    }

    private static Map<String, Cat> getStringCatMap() {
        Map<String,Cat> cats = new TreeMap<>();
        Cat cat1 = new Cat("Мурзик",3,5.2,"Сиамский");
        Cat cat2 = new Cat("Пушок",5,4.25,"Персидский");
        Cat cat3 = new Cat("Пират",8,5.2,"Сиамский");
        Cat cat4 = new Cat("Ганс",4,5.56,"Персидский");
        Cat cat5 = new Cat("Шустрик",6,4.38,"Сиамский");
        Cat cat6 = new Cat("Рыжик",1,3.27,"Персидский");
        Cat cat7 = new Cat("Виски",7,6.58,"Ирдандский");
        Cat cat8 = new Cat("Васька",3,4.87,"Обычный");
        cats.put("Мурзик",cat1);
        cats.put("Пушок",cat2);
        cats.put("Пират",cat3);
        cats.put("Ганс",cat4);
        cats.put("Шустрик",cat5);
        cats.put("Рыжик",cat6);
        cats.put("Виски",cat7);
        cats.put("Васька",cat8);
        return cats;
    }

    public static class Cat{
        private String name;
        private int age;
        private double weight;
        private String breed;

        public Cat(String name, int age, double weight, String breed) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.breed = breed;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getWeight() {
            return weight;
        }

        public String getBreed() {
            return breed;
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    ", breed='" + breed + '\'' +
                    '}';
        }
    }

}
