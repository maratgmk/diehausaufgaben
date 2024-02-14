package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*1. В стране Лимпопо количество всех зверей равно 10 миллионов.
Рождаемость составляет 14 зверей на 1000, смертность - 8 зверей.
Рассчитайте, сколько зверей будет через 10 лет, принимая во внимание,
что показатели рождаемости и смертности постоянны.
 */
public class Limpopo {
    public static void main(String[] args) {
        System.out.println(increaseAnimalsPerOne(14, 8, 1,10));

        List<Double> population = new ArrayList<>(10000000);
        for (int i = 0; i < 10000000; i++) {
            population.add(i,   1.0);
        }
        System.out.println(population.size());

        ListIterator<Double> listIterator = population.listIterator();
        double sum = 0;
        while (listIterator.hasNext()) {
            listIterator.next();
           sum = sum + listIterator.next();
        }
        System.out.println(population.size());


    }
    public static double increaseAnimalsPerOne(double birth,double death,double year,int quantityYears) {
       double result = (birth - death) /(1000 *year); // рождаемость в "year" лет на 1 зверя
        result = result * quantityYears;
        return result;
    }
}
