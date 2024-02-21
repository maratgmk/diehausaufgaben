package org.example;

import java.util.Comparator;

public class CompareBySquare implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        if(o1.getArea() == o2.getArea()) return 0;
        if(o1.getArea() < o2.getArea()) return -1;
        else return 1;
    }
}
