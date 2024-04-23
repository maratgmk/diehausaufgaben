package org.example.company;

import java.util.concurrent.atomic.AtomicInteger;

public class Student extends Thread {
    private final int payment ;
    private final int percent ;
    private AtomicInteger million = new AtomicInteger();

    public Student(int payment, int percent,  AtomicInteger million) {
        this.payment = payment;
        this.percent = percent;
        this.million = million;
    }
}
