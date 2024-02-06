package telran.de.company;

public class Manager extends Employee{
    private Developer developer;
    private QASpecialist qaSpecialist;
    public Manager(String firstName, String lastName, int age, int experience) {
        super(firstName, lastName, age, experience);
        this.developer = new Developer("Green","Rob", 29,2);
        this.qaSpecialist = new QASpecialist("Red","Bob",37,3,"Virus");
    }

    @Override
    public void work() {
        System.out.println("Эй, " + developer.getFirstName() + " пиши код!");
        System.out.println("Эй, " + qaSpecialist.getFirstName() + " тестируй код!");

    }

}



