package telran.de.post;

public class Letter extends Mailing{
    public Letter(String addressReceiver, String addressSender) {
        super(addressReceiver, addressSender);
    }
    @Override
    public void deliver() {
        System.out.println("Письмо доставлено по адресу :" + getAddressReceiver() + " и опущено в почтовый ящик получателя");
    }

    @Override
    public void send() {
        System.out.println("Письмо опущено в ящик почтого отделения по адресу :" + getAddressSender());
    }
}
