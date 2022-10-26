package methodoverriding23;
//creating child class//
public class Bike2 extends Vehicle {
    public void run(){                            // call method run from Vehicle class//
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2();    // creating method//
        obj.run(); // calling method//

    }
}
