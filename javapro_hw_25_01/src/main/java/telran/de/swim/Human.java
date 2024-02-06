package telran.de.swim;

public class Human implements Swim{
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void swim() {
        System.out.println(name +  " возраста " + age + " плавает стилем брасс.");
    }
}
