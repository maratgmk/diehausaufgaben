package org.example;
/*6*)
Перебрать ArrayList<Integer> и найти наибольшую возрастающую последовательность элементов.
Перебрать ArrayList<Integer> и удалить все дубликаты элементов.
Перебрать ArrayList<String> и создать новый список, содержащий только уникальные строки.
Перебрать ArrayList<String> и объединить все строки в одну с использованием разделителя.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task6 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(List.of(56,56,23,14,14,3,67,4,9,3,56,32));
        System.out.println(integers);

        Set<Integer> uniqueInt = new HashSet<>(integers); // удаление дубликатов
        System.out.println(uniqueInt);

        List<String> strings = new ArrayList<>(List.of("One","One","one","oNE","oNE","one","oNe","oNe","oNe"));
        System.out.println(strings);
        Set<String> uniqueStr = new HashSet<>(strings); // уникальные строки
        System.out.println(uniqueStr);

        System.out.println(joinStrings(strings));
    }




    public static String joinStrings(List<String> strings) {
        StringBuilder sb = new StringBuilder("/");
        for (String string : strings) {
            sb = sb.append(string+"/");
        }
        return sb.toString();
    }
}
