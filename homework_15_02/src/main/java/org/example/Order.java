package org.example;

import java.time.LocalDateTime;

public class Order {
    private String dish;
    private int table;
    private final LocalDateTime time;

    public Order(String dish, int table, LocalDateTime time) {
        this.dish = dish;
        this.table = table;
        this.time = time;
    }

    public String getDish() {
        return dish;
    }

    public int getTable() {
        return table;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "dish='" + dish + '\'' +
                ", table=" + table +
                ", time=" + time +
                '}';
    }
}
