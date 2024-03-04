package org.example;

import java.util.*;

/*
1) Есть Map, в котором храниться количество жителей по разным городам.
   - Найдите город с самым большим количеством жителей.
   - Найдите среднее количество жителей по всем городам.
   - Найдите все города, у которых количество жителей одинаковое.
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> mapCity = new HashMap<>();
        mapCity.put("Port",126783);
        mapCity.put("Portabello",32517);
        mapCity.put("Portico",81539);
        mapCity.put("Portland",536721);
        mapCity.put("Newport",32517);
        mapCity.put("LakeCity",257379);
        mapCity.put("FortPort",32517);
        System.out.println(mapCity);
        Set<Integer> people = Set.copyOf(mapCity.values());
        System.out.println(people);

        int max = 0;
        int population = 0;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapCity.entrySet()) {
            list.add(entry.getValue());
            if (entry.getValue() > max) max = entry.getValue();
            population = (population + entry.getValue());
        }
        System.out.println("Город с наибольшим населением " + max );
        System.out.println("Среднее количество жителей " + population/mapCity.size());
        System.out.println(list);
        System.out.println(people);
        System.out.println();

        for (Map.Entry<String, Integer> entry : mapCity.entrySet()) {
            for (Map.Entry<String, Integer> entry1 : mapCity.entrySet()) {
                if (entry.getValue().equals(entry1.getValue()) && !entry.getKey().equals(entry1.getKey()))
                   System.out.println(entry.getKey());
            }
        }
    }
}
