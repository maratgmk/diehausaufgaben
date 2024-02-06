package telran.de.zoo;

public class Cats extends Animal{
    private String nameCat;

    public Cats(String species, int age, double weight, long id, String nameCat) {
        super(species, age, weight, id);
        this.nameCat = nameCat;
    }

    public String getNameCat() {
        return nameCat;
    }

    public void setNameCat(String nameCat) {
        this.nameCat = nameCat;
    }

    @Override
    public void eat() {
        System.out.println( getNameCat()+ " вида " +getSpecies()+ " с номером " + getId() +" едят мясо");

    }

    @Override
    public void sleep() {
        System.out.println("Вид " +getSpecies()+ " весом " + getWeight() +" спят утром");

    }

    @Override
    public void move() {
        System.out.println("Вид " +getSpecies()+ " возрастом " + getAge() +" совершает прыжки");

    }

    @Override
    public void makeSound() {
        System.out.println(getNameCat() + " вида " +getSpecies()+ "  рычит ррррр");

    }
}
