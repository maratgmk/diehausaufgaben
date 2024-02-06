package telran.de;

import telran.de.homework_5_30_01.CoffeeMachine;
import telran.de.homework_5_30_01.MonthOfYear;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Месяца года");
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        System.out.println(MonthOfYear.valueOf("mArCH".toUpperCase(Locale.ROOT)));
        System.out.println(MonthOfYear.valueOf("octoBEr".toUpperCase(Locale.ROOT)));
        System.out.println();
        System.out.println("Введите месяц года в любом порядке регистра");
        String month = scanner.nextLine();
        MonthOfYear.getFoodOfSeason(MonthOfYear.valueOf(month.toUpperCase(Locale.ROOT)));
        System.out.println();

        System.out.println(CoffeeMachine.COFFEE_MACHINE);

        int num = scanner.nextInt();
        CoffeeMachine.getCoffee(num);


    }
}