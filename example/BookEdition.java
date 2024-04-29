package org.example;

import java.util.concurrent.Phaser;

/*Вы пишете книгу и вы автор. Есть 2 человека, которые выступают у вас соавторами.
 На этапе написания книги, они пишут разные главы, помогая таким образом вам полностью ее закончить.
 После того как вы и все соавторы закончили свою работу, вы отправляете книгу на рецензирование.
 В группу рецензентов входит 3 человека, каждый из которых является специалистом в своей области
 и проверяет Вашу книгу на правильность отражения фактов в вашем произведении.
 После того как все рецензии получены, Вы отправляете книгу в издательский дом.
 В редакции главный редактор и руководитель издательства читают ваше творение и утверждают его в печать.
 Вы относите утвержденные рукописи печатникам, они печатают книгу, переплетчики делают ей переплет,
 а служба доставки развозят книги по магазинам.
 Поздравляю Вас, вы полностью прошли все фазы становления известного писателя, т.к. Ваша книга
 стала бестселлером!).
 Создайте приложение, которое сымитирует работу процесса создания книги, с учетом того что каждый человек,
 который встречается в описанной схеме будет представлен отдельным потоком.
 Какой синхронизатор с библиотеки concurrent мог бы быть Вам полезен при выполнении данной задачи?
 */
public class BookEdition {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Лёд тронулся...");
        Phaser phaser = new Phaser(1);
        int currentPhase;
        currentPhase = phaser.getPhase();
        System.out.println("Автор приступил к работе и взял в соавторы двух специалистов на этапе " + currentPhase);
        new Thread(new CoAuthor("X", phaser)).start();
        new Thread(new CoAuthor("Y", phaser)).start();


        phaser.arriveAndAwaitAdvance();

        Thread.sleep(2000);
        System.out.println("Написание текста завершено на этапе  " + currentPhase); // номер фазы не правильно отображается
        if (phaser.isTerminated()){
            System.out.println("Процесс создания книги прерван");
        }

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Автор приступил к работе и отдал текст на рецензию трем рецензентам на этапе " + currentPhase);
        new Thread(new Reviewer(phaser,"A")).start();
        new Thread(new Reviewer(phaser,"B")).start();
        new Thread(new Reviewer(phaser,"C")).start();
        Thread.sleep(2000);
        System.out.println("Рецензирование текста завершено на этапе  " + currentPhase);
        if (phaser.isTerminated()){
            System.out.println("Процесс создания книги прерван");
        }
        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Автор отдал текст издательству на утверждение на этапе " + currentPhase);
        new Thread(new Approval(phaser,"Главред")).start();
        new Thread(new Approval(phaser,"Глава")).start();

        Thread.sleep(2000);
        System.out.println("Рецензирование текста завершено на этапе  " + currentPhase);
        if (phaser.isTerminated()){
            System.out.println("Процесс создания книги прерван");
        }

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Автор отдал текст в печать  " + currentPhase);
        new Thread(new Print(phaser,"Цех печати ")).start();


        Thread.sleep(2000);
        System.out.println("Печать книги завершена на этапе  " + currentPhase);
        if (phaser.isTerminated()){
            System.out.println("Процесс создания книги прерван");
        }

        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Автор отдал книгу в переплет  " + currentPhase);
        new Thread(new Cover(phaser,"Цех переплета")).start();


        Thread.sleep(2000);
        System.out.println("Переплет книги завершен на этапе  " + currentPhase);
        if (phaser.isTerminated()){
            System.out.println("Процесс создания книги прерван");
        }


        currentPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Автор отдал книгу в службу доставки  " + currentPhase);
        new Thread(new Delivery(phaser,"Служба доставки")).start();


        Thread.sleep(2000);
        System.out.println("Доставка книги завершена на этапе  " + currentPhase);
        if (phaser.isTerminated()){
            System.out.println("Процесс создания книги прерван");
        }

        phaser.arriveAndDeregister();
        if (phaser.isTerminated()){
            System.out.println("Процесс создания книги прерван");
        }
        System.out.println("Заслуги автору!");








    }

}

class CoAuthor implements Runnable{
    private String name;
    private Phaser phaser;

    public CoAuthor(String name, Phaser phaser) {
        this.name = name;
        this.phaser = phaser;
    }
    @Override
    public void run() {
        System.out.println("Соавтор " + name + " пишет свои главы книги");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // phaser.arriveAndDeregister();  ошибки выдает!
        System.out.println("Написание глав завершено соавтором " + name);
    }
}
class Reviewer implements Runnable{
    private Phaser phaser;
    private String name;

    public Reviewer(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(" Текст правит рецензент " + name);
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Проверка текста завершена рецензентом " + name );

    }
}
class Approval implements Runnable{
    private Phaser phaser;
    private String name;

    public Approval(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("Издательство в лице %s читает книгу\n",name);
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Издательство  в лице %s утверждает в печать\n",name);

    }
}
class Print implements Runnable{
    private Phaser phaser;
    private String name;

    public Print(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Книгу запустили в печать");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Книга напечатана");

    }
}
class Cover implements Runnable{
    private Phaser phaser;
    private String name;

    public Cover(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Книгу отдали в переплет ");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Твердый переплет окончен");

    }
}
class Delivery implements Runnable{
    private Phaser phaser;
    private String name;

    public Delivery(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Тираж книги отдали в службу доставки ");
        phaser.arriveAndAwaitAdvance();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Во всех магазинах книга на полке");

    }
}

