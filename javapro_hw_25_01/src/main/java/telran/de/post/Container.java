package telran.de.post;

public class Container extends Mailing{
    public Container(String addressReceiver, String addressSender) {
        super(addressReceiver, addressSender);
    }

    @Override
    public void deliver() {
        System.out.println("Получение контейнера происходит в терминале таможни по адресу :" + getAddressReceiver());
    }

    @Override
    public void send() {
        System.out.println("Отправка контейнера осуществляется на таможенном пункте " + getAddressSender());
    }
}
