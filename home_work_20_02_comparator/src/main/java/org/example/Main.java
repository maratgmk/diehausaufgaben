package org.example;

import java.util.*;

/* 1 уровень сложности: 1. Вы автоматизируете бизнес риелторов. у вас есть класс:
public class House {
    int area; //площадь дома
    int price; // цена
    String city; // город
    boolean hasFurniture; //продается с мебелью
    }
По умолчанию в вашем информационном хранилище дома сортируются по цене.
Но иногда клиент хочет видеть информацию о домах в конкретном городе и осортированную по цене.
Реализуйте компаратор, который вы можете применить для показа клиенту в требуемом им формате.
А если клиенту неожиданно захочет увидеть информацию, отсортированную в формате:
"город - площадь дома", что вы будете делать?
 */
public class Main {
    public static void main(String[] args) {
        House house1 = new House(238, 128000, "New Orleans", true);
        House house2 = new House(157, 136800, "New York", false);
        List<House> houseList = getHouses(house2, house1);
        System.out.println(houseList.size());
        System.out.println(houseList);
        houseList.add(new House(397,678000,"New York",true));
        System.out.println(houseList.size());
        System.out.println(houseList); // неотсортрованно
        Collections.sort(houseList);
        System.out.println(houseList); // отсортировано по цене

        Set<House> houseSet = new HashSet<>(houseList);
        System.out.println(houseSet);// неотсортрованно
        Set<House> houseSet1 = new TreeSet<>(houseSet);
        System.out.println(houseSet1);// отсортировано по цене

        CompareBySquare compareBySquare = new CompareBySquare();
        Collections.sort(houseList,compareBySquare);
        System.out.println(houseList);// отсортировано по площади

        Collections.sort(houseList, new CompareByCity());
        System.out.println(houseList);// отсортировано по городу

        Collections.sort(houseList,new CompareByPrice());
        System.out.println(houseList);// отсортировано по цене

        Collections.sort(houseList,new CompareByCity().thenComparing(new CompareByPrice()));
        System.out.println(houseList); // отсортировано по городам и по цене в каждом

//        Collections.sort(houseSet1,new CompareByCity().thenComparing(new CompareBySquare()));
//        System.out.println(houseList);// TreeSet не сортирует?





    }

    private static List<House> getHouses(House house2, House house1) {
        House house3 = new House(211, 220650, "New Orleans", true);
        House house4 = new House(79, 98100, "New Orleans", true);
        House house5 = new House(189, 367950, "New York", false);
        House house6 = new House(356, 589200, "New York", true);
        House house7 = new House(179, 289400, "New Orleans", true);
        House house8 = new House(153, 168930, "New Orleans", true);
        House house9 = new House(97, 87980, "New Orleans", false);

        return new ArrayList<>(Set.of(house2, house1,house6,house3,house7,house4,house9,house8,house5));
    }


}