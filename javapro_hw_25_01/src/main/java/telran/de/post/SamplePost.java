package telran.de.post;
/*
Есть абстрактный класс ПочтовоеОтправление, в котором представлен набор характеристик:
наименование;
адрес отправителя;
адрес получателя;
и абстрактное поведение:
доставить;
отправить;
Реализуйте методы этого абстрактного класса в его потомках
Письмо, Бандероль, Посылка, Контейнер с учетом той специфики, которая характерна для каждого типа почтовых отправлений на Ваше усмотрение
 */
public class SamplePost {
    public static void main(String[] args) {
        Mailing mailing = new Letter("Hamburg","Madrid");
        mailing.deliver();
        mailing.send();
        mailing = new Parcel("Oslo","Rome");
        mailing.deliver();
        mailing.send();
        mailing = new Package("Ottawa","Kioto");
        mailing.deliver();
        mailing.send();
        mailing = new Container("Уч Кудук","Катманду");
        mailing.deliver();
        mailing.send();
    }
}
