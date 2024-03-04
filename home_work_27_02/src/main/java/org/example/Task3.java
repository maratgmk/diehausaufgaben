package org.example;

import java.util.*;

/*
3)* Найти маршрут из заданного списка билетов, желательно используя Map.
Учитывая список билетов, найти маршрут по порядку, используя данный список.
Вход: «Berlin» -> «London»
«Tokyo» -> «Seoul»
«Mumbai» -> «Berlin»
«Seoul» -> «Mumbai»
Выход:
Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->Lindon
 */
public class Task3 {
    public static void main(String[] args) {
        Map<String,String> rout = new TreeMap<>(Comparator.reverseOrder());
        rout.put("Berlin","London");
        rout.put("Tokyo","Seoul");
        rout.put("Mumbai","Berlin");
        rout.put("Seoul","Mumbai");
        System.out.println(rout);



        System.out.println();
        for (Map.Entry<String, String> entrySet : rout.entrySet()) {

            System.out.print( entrySet.getKey()+ " -> " + entrySet.getValue() + ", " );
        }


    }
}
