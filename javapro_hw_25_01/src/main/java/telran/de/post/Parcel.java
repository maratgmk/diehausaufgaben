package telran.de.post;

public class Parcel extends Mailing{

    public Parcel(String addressReceiver, String addressSender) {
        super(addressReceiver, addressSender);
    }

    @Override
    public void deliver() {
        System.out.println("Бандероль передана в руки получателя по адресу :" + getAddressReceiver());
    }

    @Override
    public void send() {
        System.out.println("Бандероль передана работникам почты по адресу :" + getAddressSender());
    }
}
