package org.example.stol;

public class RobotPutter implements Runnable {
    private Stol stol;
    private Detail[] details = {
            new Detail("Колесо",1),
            new Detail("Кирпич",2),
            new Detail("Швеллер",3),
            new Detail("Доска",4),
            new Detail("Цемент",5),
    };

    public RobotPutter(Stol  stol) {
        this.stol = stol;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for (int i = 0; i < details.length; i++) {
            stol.putDetail(details[i]);
        }
    }
}
