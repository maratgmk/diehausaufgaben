package telran.de.post;

public abstract class Mailing {
    private String addressReceiver;
    private String addressSender;

    public String getAddressReceiver() {
        return addressReceiver;
    }

    public String getAddressSender() {
        return addressSender;
    }

    public Mailing(String addressReceiver, String addressSender) {
        this.addressReceiver = addressReceiver;
        this.addressSender = addressSender;
    }
    public abstract void deliver();
    public abstract void send();

}
