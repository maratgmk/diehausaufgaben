package telran.de.zoo;

public class Bird extends Animal{

    private String nameBird;

    public Bird(String species, int age, double weight, long id, String nameBird) {
        super(species, age, weight, id);
        this.nameBird = nameBird;
    }

    public String getNameBird() {
        return nameBird;
    }

    public void setNameBird(String nameBird) {
        this.nameBird = nameBird;
    }


    @Override
    public void eat() {
        System.out.println( getNameBird()+ " вида " +getSpecies()+ " с номером " + getId() +" едят мышей");

    }

    @Override
    public void sleep() {
        System.out.println("Вид " +getSpecies()+ " весом " + getWeight() +" спят днем");

    }

    @Override
    public void move() {
        System.out.println("Вид " +getSpecies()+ " возрастом " + getAge() +" машет крыльями");
    }

    @Override
    public void makeSound() {
        System.out.println(getNameBird() + " вида " +getSpecies()+ " кричит ку-ху-гу");

    }
}
