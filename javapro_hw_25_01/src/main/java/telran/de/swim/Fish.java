package telran.de.swim;

public class Fish implements Swim{
    private String species;
    private double weight;

    public Fish(String species, double weight) {
        this.species = species;
        this.weight = weight;
    }

    @Override
    public void swim() {
        System.out.println("Вид " + species + " весом " + weight + " плавает с помощью хвоста и плавников ");
    }
}
