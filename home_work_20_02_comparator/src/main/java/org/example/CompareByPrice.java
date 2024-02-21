package org.example;

import java.util.Comparator;

public class CompareByPrice implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
       // return ((Integer) o1.getPrice()).compareTo(o2.getPrice());
        return Integer.compare(o1.getPrice(),o2.getPrice());
    }
}
