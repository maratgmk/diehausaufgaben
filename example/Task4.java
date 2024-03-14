package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* 4)*Создать класс Employee с характеристиками:
фамилия, имя, отчество
должность
отдел
зарплата
Вычислить среднюю зарплату всех сотрудников
Получить список сотрудников с зп > 1000
4. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
5. Получить сотрудника с самой низкой зп
6*. Получить сотрудника с самой высокой зп
7. Получите сотрудников из всех отделов с максимальной зп
8. Сгруппировать сотрудников по должности
 */
public class Task4 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Tom", "Smith", "manager", "marketing", 2500),
                new Employee("Sam", "Bell", "programmer", "marketing", 2000),
                new Employee("Leo", "White", "programmer", "marketing", 500),
                new Employee("Ben", "Green", "programmer", "marketing", 1500),
                new Employee("Anna", "Yellow", "bookkeeper", "finance", 1200),
                new Employee("Leonid", "Copper", "programmer", "sales", 700),
                new Employee("Kat", "Grammy", "manager", "sales", 1500),
                new Employee("Bill", "Black", "programmer", "sales", 600),
                new Employee("Neo", "Ocean", "manager", "finance", 950),
                new Employee("Teo", "Berg", "programmer", "sales", 800),
                new Employee("Mary", "Blue", "bookkeeper", "finance", 1700),
                new Employee("Dana", "Grey", "programmer", "sales", 800),
                new Employee("Yana", "Forest", "programmer", "marketing", 900)
        );
        long n = employees.stream()
                .count();
        System.out.println("Количество работников " + n);
       int sum = 0;

       int averageSalary = employees.stream()
               .map(Employee::getSalary)
               .reduce(sum, (acc, e) ->  acc + e);
        System.out.println("Средняя зарплата работников :" + averageSalary/n);


        List<Employee> employees1 = employees.stream()
                        .filter(e -> e.getSalary()>1000)
                        .toList();
        System.out.println("Список сотрудников с зарплатой выше 1000 " + employees1);

        List<Employee> employees2 = employees.stream().filter(e -> e.getDepartment().equals("marketing")).toList();
        System.out.println("Список сотрудников департамента marketing " + employees2);
        List<Double> salary = employees2.stream().map(e->e.getSalary()*1.15).toList();
        System.out.println(salary);

        System.out.println("Самая низкая зарплата " + employees.stream().map(Employee::getSalary).min(Comparator.naturalOrder()));
        System.out.println("Самая высокая  зарплата " + employees.stream().map(Employee::getSalary).max(Comparator.naturalOrder()));

        List<Employee> withLowSalary = employees.stream().sorted((e1,e2)-> e1.getSalary()- e2.getSalary()).limit(1)
                .toList();
        System.out.println("Сотрудник с самой низкой зарплатой " + withLowSalary);

        List<Employee> withHighSalary = employees.stream().sorted((e1,e2)->e2.getSalary()-e1.getSalary())
                .limit(1).toList();
        System.out.println("Сотрудник с самой высокой зарплатой " + withHighSalary);


    }
}
