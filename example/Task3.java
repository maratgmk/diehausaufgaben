package org.example;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

/*3**) У нас есть профессия в строительстве - чернорабочий. Он может выполнять любые низкоквалифицированные
работы на стройке. На каждый день ему дается список работ, которые он должен выполнить, но не факт
что в течении рабочего времени его задание может измениться.
Напишите программу рабочего дня профессии, которая позволяет динамический давать ему задание на работу,
в любое нужное время. И он их должен выполнять. Применяйте функциональные интерфейсы.
 */
public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        Supplier<Integer> order = ()->{
            return random.nextInt(1,8);
        };

        Consumer<Integer> work = (n)-> System.out.println(ListOfJob.getJob(n));
        work.accept(order.get());

    }
}

enum ListOfJob{
    ONE(1,"Носить кирпичи"),
    TWO(2,"Месить раствор"),
    THREE(3,"Убирать мусор"),
    FOUR(4,"Разгружать машину"),
    FIVE(5,"Забивать гвозди"),
    SIX(6,"Нести бревно"),
    SEVEN(7,"Варить кашу");

    private final int n;
    private final String s;

    ListOfJob(int n, String s) {
        this.n = n;
        this.s = s;
    }

    public int getN() {
        return n;
    }

    public String getS() {
        return s;
    }
    public static ListOfJob getJob(int n){
        return switch (n) {
            case 1 -> ListOfJob.ONE;
            case 2 -> ListOfJob.TWO;
            case 3 -> ListOfJob.THREE;
            case 4 -> ListOfJob.FOUR;
            case 5 -> ListOfJob.FIVE;
            case 6 -> ListOfJob.SIX;
            case 7 -> ListOfJob.SEVEN;
        };
    }

    @Override
    public String toString() {
        return "ListOfJob{" +
                "n=" + n +
                ", s='" + s + '\'' +
                '}';
    }
}
