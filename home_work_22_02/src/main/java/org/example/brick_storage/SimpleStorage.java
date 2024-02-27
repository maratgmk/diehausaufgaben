package org.example.brick_storage;

import java.util.Stack;

/*
 1 уровень сложности: 1) Вы работаете на складе, который продает один вид продукции, не имеющий сроков хранения, например кирпич.
У вас всего одни двери на складе, через которые вы загружаете новый товар и отгружаете заказчикам тоже через эту же дверь.
Как бы вы построили рабочий процесс на Вашем складе, какую бы коллекцию использовали для имитации процесса работы?
Напишите программу, которая бы имитировала работу.
 */
public class SimpleStorage {
    public static void main(String[] args) {

        Stack<Brick> inStorage = new Stack<>(); // хранилище
        System.out.println("Склад пока пустой " + inStorage.empty());
        System.out.println("На склад поступило :" + inStorage.push(new Brick("White", 17)));
        System.out.println("Проверка показала наличие " + inStorage.peek());
        inStorage.push(new Brick("Red", 28));
        inStorage.push(new Brick("Red", 1));
        inStorage.push(new Brick("Brown", 3));
        System.out.println("Наличие кирпичей на складе " + inStorage);
        Brick brick1 = new Brick("Black",9);
        inStorage.push(brick1);
        System.out.println("Наличие кирпичей на складе " + inStorage);
        Stack<Brick> outStorage = new Stack<>(); // картотека отгруженного кирпича
        System.out.println("Отгружено со склада " + outStorage);
        Storage storage = new Storage(inStorage,outStorage); // процесс учета хранения
        System.out.println(storage); // состояние загруженного склада до отгрузки кирпичей


        storage.loadTrack(storage.takeFromStorage()); // списана первая партия от двери, которая поступила на склад, и первая загружена в грузовик
        storage.loadTrack(storage.takeFromStorage());// списана вторая партия от двери, которая поступила на склад предпоследней; и вторая в грузовик
        System.out.println("состояние грузовика " + outStorage);
        System.out.println("процесс учета хранения " + storage);
        storage.loadTrack(storage.takeFromStorage());
        System.out.println("состояние грузовика " + outStorage);
        System.out.println("состояние склада " + inStorage);
        System.out.println("процесс учета хранения " + storage);
        System.out.println("следующий к отгрузке " + storage.checkBrickNext());
        storage.loadTrack(storage.takeFromStorage());
        System.out.println("процесс учета хранения " + storage);
        System.out.println("состояние грузовика " + outStorage);
        System.out.println("наличие товара на складе " + storage.hasBrick());
        System.out.println("процесс учета хранения " + storage);
        storage.loadTrack(storage.takeFromStorage());
        System.out.println("наличие товара на складе " + storage.hasBrick());
        System.out.println("процесс учета хранения " + storage);



    }
}


