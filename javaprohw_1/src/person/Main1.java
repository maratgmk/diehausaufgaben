package person;

public class Main1 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Green Yellow";
        person1.age = 48;
        person1.talk();
        person1.move();

        Person person2 = new Person("White Grey", 37);
        person2.move();
        person2.talk();
    }
}
