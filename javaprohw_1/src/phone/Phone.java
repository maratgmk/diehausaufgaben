package phone;
/*
2.Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
Вызвать эти методы для каждого из объектов.
 */

import java.lang.String;
import java.util.Scanner;

public class Phone {
    String model;
    String number;
    double weight;

    Phone(){
    }

    public Phone(String model, String number, double weight) {
        this.model = model;
        this.number = number;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    void receiveCall(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Звонит " + name + " с неизвестного номера");
    }
}
