package telran.de;


import telran.de.company.Developer;
import telran.de.company.Manager;
import telran.de.company.QASpecialist;
import telran.de.pet.Cat;
import telran.de.pet.Dog;
import telran.de.zoo.Bird;
import telran.de.zoo.Cats;
import telran.de.zoo.Monkey;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Sharik", 27.8,5,"male", "Shepard" , 372728282);
        dog1.sleep();
        dog1.eat();
        Cat cat1 = new Cat("Васька",5.8,3,"male","Сиам", false,9876635);
        cat1.eat();
        cat1.sleep();
        System.out.println();

        Bird bird1 = new Bird("Сова", 12,8.3, 383736216,"Филя");
        bird1.eat();
        bird1.sleep();
        bird1.move();
        bird1.makeSound();
        System.out.println();
        Cats cats1 = new Cats("Пантера", 8, 72.4, 983534,"Багира");
        cats1.eat();
        cats1.sleep();
        cats1.move();
        cats1.makeSound();
        Monkey monkey1 = new Monkey("Шимпанзе", 5, 24.7, 19853,"Ваня");
        monkey1.eat();
        monkey1.sleep();
        monkey1.move();
        monkey1.makeSound();
        System.out.println();

        Developer be_dev1 = new Developer("Green","Rob",29,2);
        be_dev1.work();
        QASpecialist qa1 = new QASpecialist("Red","Bob", 37, 3, "Virus");
        qa1.work();
        Manager manager1 = new Manager("Black","Sam", 45,15);
        manager1.work();


    }
}