package telran.de.zoo;

public class  Monkey extends Animal {
    private String nameMonkey;

    public Monkey(String species, int age, double weight, long id, String nameMonkey) {
        super(species, age, weight, id);
        this.nameMonkey = nameMonkey;
    }

    public String getNameMonkey() {
        return nameMonkey;
    }

    public void setNameMonkey(String nameMonkey) {
        this.nameMonkey = nameMonkey;
    }

    @Override
    public void eat() {
        System.out.println( getNameMonkey()+ " вида " +getSpecies()+ " с номером " + getId() +" едят бананы");

    }

    @Override
    public void sleep() {
        System.out.println("Вид " +getSpecies()+ " весом " + getWeight() +" спят ночью");

    }

    @Override
    public void move() {
        System.out.println("Вид " +getSpecies()+ " возрастом " + getAge() +" ходит на ногах");

    }

    @Override
    public void makeSound() {
        System.out.println(getNameMonkey() + " вида " +getSpecies()+ " кричит о-у-о-у");

    }
}
