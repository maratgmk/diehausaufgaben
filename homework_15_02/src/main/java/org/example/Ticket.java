package org.example;

import java.util.Collection;

public class Ticket implements Comparable<Ticket> {
    private final int number;
    private final String name;
    private final int age;

    private final OperationType type;


    public Ticket(int number, String name, int age, OperationType type) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public OperationType getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", type=" + type +
                '}';
    }

    @Override
    public int compareTo(Ticket o) {
        return Integer.compare(this.getNumber(), o.getNumber());
    }
}
