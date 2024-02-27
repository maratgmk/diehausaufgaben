package org.example.brick_storage;

public class Brick {
        private String type;
        private int quantity;

        public Brick(String type, int quantity) {
            this.type = type;
            this.quantity = quantity;
        }

        public String getType() {
            return type;
        }

        public int getQuantity() {
            return quantity;
        }

        @Override
        public String toString() {
            return "Brick{" +
                    "type='" + type + '\'' +
                    ", quantity=" + quantity +
                    '}';
        }
    }

