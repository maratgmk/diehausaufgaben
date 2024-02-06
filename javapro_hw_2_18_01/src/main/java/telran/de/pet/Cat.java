package telran.de.pet;

public class Cat extends Pet{
    private String breed;
    private boolean isSterialised;
    private long idInsurance;

    public Cat(String name, double weight, int age, String sex, String breed, boolean isSterialised, long idInsurance) {
        super(name, weight, age, sex);
        this.breed = breed;
        this.isSterialised = isSterialised;
        this.idInsurance = idInsurance;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isSterialised() {
        return isSterialised;
    }

    public void setSterialised(boolean sterialised) {
        isSterialised = sterialised;
    }

    public long getIdInsurance() {
        return idInsurance;
    }

    public void setIdInsurance(long idInsurance) {
        this.idInsurance = idInsurance;
    }

    public Cat(String name, double weight, int age, String sex) {
        super(name, weight, age, sex);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(getBreed() + ", по имени " + getName() + " со страховкой " + getIdInsurance() +" любит свежую рыбу.");
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Кошка породы " + getBreed() + " спит " + 0.5*getWeight() + " часов");
    }
}
