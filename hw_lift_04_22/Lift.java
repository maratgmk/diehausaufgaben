package org.example.hw_lift_04_22;
/*
Задача: вызов лифта
В доме два лифта.
Реализовать алгоритм отправки наиболее ближайшего на вызывающий этаж.
Алгоритм будет применяться в домах разной этажности.
*Алгоритм будет применяться в домах с количеством > 2 лифтов
Пример:
в доме 19 этажей
работают лифт А и лифт В
лифт А находиться на 0 этаже
лифт В находиться на 8 этаже
на вход: 1
отправляем лифт А
 */
public class Lift {
    private final String name;
    private final  int high;
    private int level;
    private int call;


    public Lift(int high, String name, int level,int call) {
        this.high = high;
        this.name = name;
        this.level = level;
        this.call = call;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHigh() {
        return high;
    }

    public int getCall() {
        return call;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public void moveToCall(int call,int level){
        if(call > level){
            System.out.printf("Лифт %s едет на %d этажей вверх\n",name,Math.abs(call - level));
    } else if (call < level) {
            System.out.printf("Лифт %s едет на %d этажей вниз\n",name,Math.abs(call - level));
        }else {
            System.out.printf("Лифт %s открывает двери - приехали\n",name);
        }
    }

    @Override
    public String toString() {
        return "Lift{" +
                "name='" + name + '\'' +
                ", high=" + high +
                ", level=" + level +
                ", call=" + call +
                '}';
    }
}
