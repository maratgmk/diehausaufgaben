package org.example;

import java.time.LocalDateTime;
import java.util.*;

/* 1 уровень сложности: 1) Вы пришли в отделение банка, в котором обслуживание ведется строго по талончикам, который Вы получаете в автомате при входе.
При регистрации, Вы обязательно указываете ФИО, год рождения, тип операции который Вам необходимо выполнить в отделении (например
Консультация, Получение денежных средств, Вложение средств, Открытие депозита, Коммунальные платежи).
После регистрации - вы получаете номер талончика.
Обслуживание в банке ведется строго по номеру талончика в порядке их возрастания.
Создать множество, которое будет обслуживать класс Ticket.
Подумайте какой тип Set - а вы могли бы использовать для этой задачи.
Сымитируйте работу отделения банка.

2)* В ресторане официанты подают заказы Order на кухню. Очень важно чтобы заказы брались в работу поварами строго в том порядке,
в котором они были переданы на кухню. Создайте множество (Set) заказов, которые будут передаваться на кухню официантом и реализуйте
механизм взятия в работу этих заказом поваром.
Используйте LinkedHashSet для решения этой задачи.
Характеристики Order определите самостоятельно.
 */
public class Main {
    public static void main(String[] args) {
        Ticket ticket1 = new Ticket(3,"White",27,OperationType.UTILITY_BILLS);
        Ticket ticket2 = new Ticket(5,"Green",47,OperationType.CONSULTING);
        Ticket ticket3 = new Ticket(1,"Black",42,OperationType.DEPOSIT);
        Ticket ticket4 = new Ticket(2,"Red",78,OperationType.WITHDRAW);
        Ticket ticket5 = new Ticket(4,"Grey",19,OperationType.DEPOSIT);
        Set<Ticket> tickets = new TreeSet<>();
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);

        serve(tickets);

        Order order1 = new Order("Salat",17, LocalDateTime.of(2024,1, 24 , 20,34));
        Order order2 = new Order("Duck",1, LocalDateTime.of(2024,1, 24 , 19,17));
        Order order3 = new Order("Fish",9, LocalDateTime.of(2024,1, 24 , 18,12));
        Order order4 = new Order("Soup",12, LocalDateTime.of(2024,1, 24 , 18,13));
        Order order5 = new Order("Pizza",4, LocalDateTime.of(2024,1, 24 , 20,35));
        LinkedHashSet<Order> orders = new LinkedHashSet<>();
        orders.add(order3);
        orders.add(order4);
        orders.add(order2);
        orders.add(order1);
        orders.add(order5);
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            System.out.println();
        }






    }

    public static void serve(Set<Ticket> tickets) {
        for (Ticket ticket : tickets) {
            System.out.println(ticket);
            System.out.println("Обслуживается господин " +ticket.getName()+" с номером " +ticket.getNumber()+" касательно " + ticket.getType());
            System.out.println();
        }
    }
}