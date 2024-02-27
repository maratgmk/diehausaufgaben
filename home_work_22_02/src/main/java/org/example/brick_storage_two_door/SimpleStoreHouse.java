package org.example.brick_storage_two_door;

import java.util.LinkedList;
import java.util.Queue;

/*
2)* Тот же склад, что и в случае п.1 но у Вас есть две двери - одна в начале склада, вторая в конце.
Как бы вы построили оптимальный рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
Напишите программу, которая бы имитировала работу.
 */
public class SimpleStoreHouse {
    public static void main(String[] args) {
        Queue<Stone> intoStore = new LinkedList<>(); // склад
        Queue<Stone> outStore = new LinkedList<>();  // автомобиль
        StoreHouse storage = new StoreHouse(intoStore,outStore); // учет хранения
        System.out.println("Склад пустой " + storage);
        System.out.println("Наличие товара " + storage.hasStone());

        Stone stone1 = new Stone("Black",16);
        Stone stone2 = new Stone("Yellow",7);
        Stone stone3 = new Stone("Grey",32);
        Stone stone4 = new Stone("White",11);
        Stone stone5 = new Stone("Brown",5);
        Stone stone6 = new Stone("Red",19);
        intoStore.offer(stone1);
        intoStore.offer(stone2);
        intoStore.offer(stone3);
        intoStore.offer(stone4);
        intoStore.offer(stone5);
        intoStore.offer(stone6);
        System.out.println("Загружено на склад в порядке очереди " + intoStore); // FIFO
        System.out.println("Наличие товара " + storage.hasStone());
        System.out.println("Учет движения товара " + storage);

        System.out.println("Партия товара к выдаче " + storage.checkStoneNext());
        System.out.println("Учет движения товара " + storage);
        storage.loadTrack(storage.takeOutStore());  // загрузка автомобиля
        System.out.println("Учет движения товара " + storage);
        storage.loadTrack(storage.takeOutStore());  // загрузка автомобиля
        storage.loadTrack(storage.takeOutStore());  // загрузка автомобиля
        storage.loadTrack(storage.takeOutStore());  // загрузка автомобиля
        storage.loadTrack(storage.takeOutStore());  // загрузка автомобиля
        System.out.println("Наличие товара " + storage.hasStone());
        System.out.println("Партия товара к выдаче " + storage.checkStoneNext());
        System.out.println("Учет движения товара " + storage);
        storage.loadTrack(storage.takeOutStore());  // загрузка автомобиля
        System.out.println("Наличие товара " + storage.hasStone());
        System.out.println("Партия товара к выдаче " + storage.checkStoneNext());
        System.out.println("Склад пуст, товар отгружен покупателю   " + storage);








    }
}
