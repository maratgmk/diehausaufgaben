package org.example.hw_lift_04_22;

import java.util.Scanner;

public class UseLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Лифт Первый находится на этаже : ");
        int levelFirst = scanner.nextInt();
        System.out.println("Лифт Второй находится на этаже : ");
        int levelSecond = scanner.nextInt();
        System.out.println("Вызов лифта на этаж : ");
        int call = scanner.nextInt();

        Lift first = new Lift(19,"Первый",levelFirst,call);
        Lift second = new Lift(19,"Второй",levelSecond,call);
        System.out.println(first);
        System.out.println(second);

        first.moveToCall(call,levelFirst);
        second.moveToCall(call,levelSecond);

        MovingTwoLifts moving = new MovingTwoLifts(first,second,call);
        System.out.println(moving);
        System.out.println(moving.takeLift(first, second));
    }
}
