package org.example.brick_storage_two_door;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StoreHouse {
    private Queue<Stone> intoStore = new LinkedList<>(); // загрузка склада товаром
    private Queue<Stone> outStore = new LinkedList<>();  // погрузка товара в грузовик

    public StoreHouse(Queue<Stone> intoStore, Queue<Stone> outStore) {
        this.intoStore = intoStore;
        this.outStore = outStore;
    }
    public void putInStore(Stone stone) {
        intoStore.offer(stone);
    }
    public Stone takeOutStore(){
        return intoStore.poll();
    }
    public void loadTrack(Stone stone) {
        outStore.offer(stone);
    }
    public Stone checkStoneNext() {
        return intoStore.peek();
    }
    public boolean hasStone() {
       return !intoStore.isEmpty();
    }

    @Override
    public String toString() {
        return " Учет хранения {" +
                " Наличие товара на складе  = " + intoStore +
                ", Отгрузка покупателю = " + outStore +
                '}';
    }
}
