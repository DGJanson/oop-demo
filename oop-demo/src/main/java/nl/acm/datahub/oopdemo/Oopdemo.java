package nl.acm.datahub.oopdemo;

import nl.acm.datahub.oopdemo.car.Car;
import nl.acm.datahub.oopdemo.list.ListPrinter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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

    private void doListStuff () {
        // Java has two implemented lists (in this example :) )
        // An ArrayList and a LinkedList
        // Both have parentClass List, which means we can use List as a type for both:
        List<Integer> aList = new ArrayList<>();
        List<Integer> lList = new LinkedList<>();

        // Both the lList and aList can now be used the same way; we do not need to worry about the implementation
        aList.add(1);
        aList.add(3);

        lList.add(4);
        lList.add(42);

        // It is possible to use the lists as parameters to a method that expects lists:
        ListPrinter printer = new ListPrinter(); // Create the object
        printer.printList(aList);
        printer.printList(lList);

        // What is more, we can send printer a specific implentation and it will still work
        ArrayList<Integer> specificAList = new ArrayList<>(); // Note the type is an ArrayList; not a List
        specificAList.add(5);
        specificAList.add(55);
        printer.printList(specificAList);

        // Which of the following statements will crash the application (compiler actually?)
        // Try at your own risk ;)
        // ArrayList<Integer> optionA = new List<>();
        // List<Integer> optionB = new LinkedList<>();
        // LinkedList<Integer> optionC = new LinkedList<>();
        // ArrayList<Integer> optionC = new LinkedList<>();
    }

    // Entry point of the program: main method
    public static void main (String[] args) {
        System.out.println("OOP demo start");
        Oopdemo demo = new Oopdemo();

        System.out.println("##############################");
        System.out.println("## Class based OOP");
        System.out.println("##############################");
        demo.doCarStuff();

        System.out.println("##############################");
        System.out.println("## Lists and polymorphism");
        System.out.println("##############################");
        demo.doListStuff();
    }
}
