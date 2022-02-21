package nl.acm.datahub.oopdemo;

import nl.acm.datahub.oopdemo.car.Car;

public class Oopdemo {

    private void doCarStuff () {
        // We can use the Car class to instantiate two Car objects
        // Instantiating means creating an object
        // Note that when instantiating an object we call the constructor method of the corresponding class
        Car audi = new Car("audi", "red", 10000);
        Car citroenc1 = new Car("citroen", "greyAndRust", 70000);

        // We can call functions the objects we just created.
        // The honk method gives the same result in both cases, but the drive method depends on the odometer value
        //   and therefore will give different results depending on which object is used
        audi.honk();
        citroenc1.honk();

        System.out.println(String.format("Audi has driven %d kilometres", audi.drive(100)));
        System.out.println(String.format("Citroen has driven %d kilometres", citroenc1.drive(100)));
    }

    // Entry point of the program: main method
    public static void main (String[] args) {
        System.out.println("OOP demo start");
        Oopdemo demo = new Oopdemo();

        System.out.println("##############################");
        System.out.println("## Class based OOP");
        System.out.println("##############################");
        demo.doCarStuff();

    }
}
