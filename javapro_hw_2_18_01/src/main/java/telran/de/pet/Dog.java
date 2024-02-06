package telran.de.pet;

public class Dog extends Pet{
    private String breed;
    private long idInsurance;

    public Dog(String name, double weight, int age, String sex, String breed, long idInsurance) {
        super(name, weight, age, sex);
        this.breed = breed;
        this.idInsurance = idInsurance;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public long getIdInsurance() {
        return idInsurance;
    }

    public void setIdInsurance(long idInsurance) {
        this.idInsurance = idInsurance;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Собака по имени " +getName()+ " породы " +getBreed() + " ест только свежее мясо ");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Собака по имени " +getName()+ " породы " +getBreed() + " полис " + getIdInsurance() + " сторожит овец.");
    }
}
