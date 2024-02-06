package telran.de.company;

import java.util.concurrent.ThreadLocalRandom;

public class Developer extends Employee {
    public Developer(String firstName, String lastName, int age, int experience) {
        super(firstName, lastName, age, experience);
    }

    @Override
    public void work() {
        System.out.println("Я написал этот код " + generateCod());
    }
    public String generateCod(){
        return "if()".repeat(ThreadLocalRandom.current().nextInt(25));
    }


}
