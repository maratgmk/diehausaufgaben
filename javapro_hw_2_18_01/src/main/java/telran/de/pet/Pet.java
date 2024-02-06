package telran.de.pet;
/*
1. У нас в доме живут домашние животные. Попробуйте в этой задаче создать класс Pet
и записать ему в наследники Cat и Dog. Определите, какие характеристики и поведение ваших питомцев
общие, а какие проявляются только у конкретного типа.
 */

public class Pet {
    private String name;
    private double weight;
    private int age;
    private String sex;

    public Pet(String name, double weight, int age, String sex) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void eat(){
        System.out.println(getName() + " питается " + 0.05*getWeight() + " кг корма в день");
    }
    public void sleep(){
        System.out.println(getName() + " sleep ");

    }

}
