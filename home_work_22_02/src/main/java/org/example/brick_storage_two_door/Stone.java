package org.example.brick_storage_two_door;

public class Stone {
    private String color;
    private int quantity;

    public Stone(String color, int quantity) {
        this.color = color;
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Stone{" +
                "color='" + color + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
