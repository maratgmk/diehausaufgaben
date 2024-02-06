package person;
/*
1.Класс module_1.lecture_1.module_1.lecture_1.Person
Создать класс module_1.lecture_1.module_1.lecture_1.Person, который содержит:
переменные fullName, age;
методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  module_1.lecture_1.module_1.lecture_1.Person говорит".
Добавьте два конструктора  - module_1.lecture_1.module_1.lecture_1.Person() и module_1.lecture_1.module_1.lecture_1.Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором module_1.lecture_1.module_1.lecture_1.Person(), другой - module_1.lecture_1.module_1.lecture_1.Person(fullName, age)

 */

public class Person {
    String fullName;
    int age;

    Person(){

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }


    void talk(){
        System.out.println("Такой-то " + fullName + " говорит стих");
    }
    void move(){
        System.out.println("Такой-то " + fullName + " возраста " + age + " делает кувырок");
    }

}
