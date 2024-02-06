package telran.de.swim;



public class SampleSwim {
     public static void main(String[] args) {
          Swim swimer = new Human("Green",57);
          swimer.swim();
          System.out.println();
          swimer = new Fish("Кашалот", 5.27);
          swimer.swim();
          System.out.println();
          swimer = new Boat(45.25);
          swimer.swim();

     }





}
