package telran.de.homework_5_30_01;
/*2*) У вас на работе есть один кофейный автомат. Он умеет готовить развличные виды кофе. Но он только один.
Реализуйте класс кофейного автомата, с помощью которого любой человек может приготовить себе различные варианты кофе.
Но что важно, сколько ко бы раз не обращался человек за изготовлением кофе, или какие бы люди не пытались
приготовить кофе, они всегда получали бы ссылку на один и тот же объект кофейного автомата.
(Поищите информацию в интернете о паттерне Singleton и попытайтесь его реализовать при решении данной задачи.
Можно использовать вариант реализации со статическим методом и приватным конструктором,
или вариант реализации через Enum.)
 */
public enum CoffeeMachine {
    COFFEE_MACHINE;

    private CoffeeMachine() {
        System.out.println("Введите номер заказа");
    }
    public static void getCoffee(int num) {
        switch (num) {
            case 1 -> {
                System.out.println("Ваш заказ " + TypeOfCoffee.AMERICANO.name());
            }
            case 2 -> {
                System.out.println("Ваш заказ " + TypeOfCoffee.CAPPUCCINO.name());
            }
            case 3 -> {
                System.out.println("Ваш заказ " + TypeOfCoffee.CHOCO.name());
            }
            case 4 -> {
                System.out.println("Ваш заказ " + TypeOfCoffee.ESPRESSO.name());
            }

            default -> throw new IllegalStateException("Такого выбора нет : " + num);
        }
    }



}
