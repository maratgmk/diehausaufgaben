package telran.de.company;
/*
3*. Вы работаете на предприятии, где работает большое количество сотрудников.
Создате классы и схему наследования для организационной структуры предприятия:
Базовый класс - Employee с перечнем характеристик и поведением, которые пристутсвуют у любого сотрудника.
А далее все зависит от подразделений где они работают и их функциональных обязанностей.
 */

public abstract class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private int experience;

    public Employee(String firstName, String lastName, int age, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void work();

}
