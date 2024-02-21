package org.example;

import java.util.Comparator;

public class CompareByCity implements Comparator<House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getCity().compareTo(o2.getCity());
    }
}
