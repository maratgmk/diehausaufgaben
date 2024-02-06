package telran.de.company;

public class QASpecialist extends Employee{
    private String bug;

    public QASpecialist(String firstName, String lastName, int age, int experience, String bug) {
        super(firstName, lastName, age, experience);
        this.bug = bug;
    }

    public String getBug() {
        return bug;
    }

    public void setBug(String bug) {
        this.bug = bug;
    }

    @Override
    public void work() {
        System.out.println("Я разбираюсь с этим " + bug);

    }

}
