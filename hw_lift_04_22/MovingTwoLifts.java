package org.example.hw_lift_04_22;

import java.util.Random;

public class MovingTwoLifts {
    Random random = new Random();
    private Lift first;
    private Lift second;
    private int call;

    public MovingTwoLifts(Lift first, Lift second, int call) {
        this.first = first;
        this.second = second;
        this.call = call;
    }

    public int getCall() {
        return call;
    }

    public void setCall(int call) {
        this.call = call;
    }

    public Lift getFirst() {
        return first;
    }

    public void setFirst(Lift first) {
        this.first = first;
    }

    public Lift getSecond() {
        return second;
    }

    public void setSecond(Lift second) {
        this.second = second;
    }

    public Lift takeLift(Lift first, Lift second) {
        boolean choice = random.nextBoolean();
        if (Math.abs(first.getLevel() - call) > Math.abs(second.getLevel() - call)) {
            return second;
        } else if (Math.abs(first.getLevel() - call) < Math.abs(second.getLevel() - call)) {
            return first;
        } else if (choice == true) {
            System.out.println(choice);
            return first;
        } else {
            System.out.println(choice);
            return second;
        }
    }


    @Override
    public String toString() {
        return "MovingTwoLifts{" +
                ", first=" + first +
                ", second=" + second +
                ", call=" + call +
                '}';
    }
}
