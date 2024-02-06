package telran.de.swim;

public class Boat implements Swim{
    private double speed;

    public Boat(double speed) {
        this.speed = speed;
    }

    @Override
    public void swim() {
        System.out.println("Катер плывет по волнам со скорстью " + speed);
    }
}
