package telran.de.zoo;
/*
2*. Создать классы и схему наследования для задачи учета животных в зоопарке:
- Как минимум должен быть общий класс Animal с характеристиками и поведением, характерными для всех животных.
А дальше уже Ваше творчество, в котором вы должны разбить животных на группы и подгруппы.
 */

public abstract class Animal {
    private String species;
    private int age;
    private double weight;

    private long id;

    public Animal(String species, int age, double weight, long id) {
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void move();
    public abstract void makeSound();

}
