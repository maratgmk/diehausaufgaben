package org.example.brick_storage;

import java.util.Stack;

public class Storage {
    private Stack<Brick> inStorage; // хранится на складе
    private Stack<Brick> outStorage; // отгружено со склада

    public Storage(Stack<Brick> inStorage, Stack<Brick> outStorage) {    // движение по складу
        this.inStorage = inStorage;
        this.outStorage = outStorage;
    }

    public Brick takeFromStorage() {  //  берется со склада
        return inStorage.pop();
    }
    public void loadTrack(Brick brick) {  // отгружается на грузовик
        outStorage.push(brick);
    }
    public Brick checkBrickNext() {  //  проверка ближайшей партии на складе к выходу
        return inStorage.peek();
    }
    public boolean hasBrick() {   // проверка наличия товара на складе
        return !inStorage.empty();
    }

    public Stack<Brick> getInStorage() {
        return inStorage;
    }

    public void setInStorage(Stack<Brick> inStorage) {  // внесение реестра записей товара на складе
        this.inStorage = inStorage;
    }

    public Stack<Brick> getOutStorage() {
        return outStorage;
    }

    public void setOutStorage(Stack<Brick> outStorage) { // внесение реестра записей отгруженного товара
        this.outStorage = outStorage;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "brickStack=" + inStorage +
                "  ||  loadTrack=" + outStorage +
                '}';
    }
}

