package telran.de.post;

public class Package extends Mailing{
    public Package(String addressReceiver, String addressSender) {
        super(addressReceiver, addressSender);
    }

    @Override
    public void deliver() {
        System.out.println("Получение посылки происходит на почте по адресу :" + getAddressReceiver());
    }

    @Override
    public void send() {
        System.out.println("Отправка посылки происходит в почтовом отделении по адресу :" + getAddressSender());

    }
}
