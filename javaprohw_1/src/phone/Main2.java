package phone;

public class Main2 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Samsung","+49(905)-978-02-01", 112.28);
        Phone phone2 = new Phone("Nokia", "+127(9376)-09-03-052", 150.38);
        Phone phone3 = new Phone("Sony", "+35(756)-09-78-28",180.39);
        System.out.println(phone1.model + " , " + phone1.number + " , " + phone1.weight);
        System.out.println(phone2.model + " , " + phone2.number + " , " + phone2.weight);
        System.out.println(phone3.model + " , " + phone3.number + " , " + phone3.weight);

        phone1.receiveCall();

        System.out.println(phone2.getNumber());

    }
}
