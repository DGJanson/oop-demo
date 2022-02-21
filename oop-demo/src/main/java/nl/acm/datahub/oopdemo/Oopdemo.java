package nl.acm.datahub.oopdemo;

import nl.acm.datahub.oopdemo.car.Car;
import nl.acm.datahub.oopdemo.farmanimal.AbstractFarmAnimal;
import nl.acm.datahub.oopdemo.farmanimal.Cow;
import nl.acm.datahub.oopdemo.farmanimal.Sheep;
import nl.acm.datahub.oopdemo.list.ListPrinter;
import nl.acm.datahub.oopdemo.pet.Cat;
import nl.acm.datahub.oopdemo.pet.Dog;
import nl.acm.datahub.oopdemo.pet.Mouse;
import nl.acm.datahub.oopdemo.pet.Pet;

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

        // Small quiz
        // Which of the following statements will crash the application (compiler actually)?
        // Try at your own risk ;)

        // ArrayList<Integer> optionA = new List<>();
        // List<Integer> optionB = new LinkedList<>();
        // LinkedList<Integer> optionC = new LinkedList<>();
        // ArrayList<Integer> optionD = new LinkedList<>();
    }

    private void doPetStuff () {
        // Polymorphism means we can add specific implementations to a parent type.
        // For example, we can create a list of pets with specific implementations. Like so:
        List<Pet> shelter = new ArrayList<>();
        shelter.add(new Dog("GoodBoy"));
        shelter.add(new Cat("FelixTheGreat"));

        // We can also first create a subclass-type object and add it to parentclass-type list:
        Mouse pinky = new Mouse("Pinky");
        pinky.setUnpettable(); // method from parent class!
        shelter.add(pinky);

        // We can call all methods defined in the Pet class on the objects in the list.
        // The exact implementation differs per subclass used during instantiation
        for (Pet pet : shelter) {
            pet.makeSound();
        }

        // Note that the pet class is creatable as well!
        Pet genericPet = new Pet("John Doe");
        genericPet.setUnpettable();
        genericPet.makeSound();
        // this is probably not desirable behaviour, see abstract classes for how to deal with this

        // Remember we have a Mouse called Pinky. The Mouse class has a unique function:
        pinky.whatAreWeGoingToDoTonight();

        // Note how this relates to polymporphism.
        // Which of the following statements will crash the application (compiler actually)?
        // Try at your own risk ;)

        // Pet jerry = new Mouse();                 // Option A
        // Mouse larry = new Mouse();               // Option B
        // Mouse andy = new Pet();                  // Option C
        // jerry.whatAreWeGoingToDoTonight();       // Option D
        // larry.whatAreWeGoingToDoTonight();       // Option E
        // andy.whatAreWeGoingToDoTonight();        // Option F
    }

    private void doAnimalStuff () {
        // As with the pets, we can make a polymorph list.
        // The abstract class can be used as a type, but not during instantiation!
        // Let's see how this works:
        List<AbstractFarmAnimal> farm = new ArrayList<>();
        // We can add the specific implementations to the list:
        farm.add(new Cow("Clara"));
        farm.add(new Sheep("Shaun"));

        // Note that we can NOT instantiate the abstract animal class though!
        // the following will give an error:
        // AbstractAnimal pablo = new AbstractAnimal("Pablo")

        // As before, we can iterate over the list and call the object functions:
        for (AbstractFarmAnimal animal : farm) {
            animal.ruminate(); // implementation from (abstact) parent class
            animal.makeSound(); // implementation from (concrete) sub class
        }
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

        System.out.println("##############################");
        System.out.println("## Pets and polymorphism");
        System.out.println("##############################");
        demo.doPetStuff();

        System.out.println("##############################");
        System.out.println("## Abstract animals");
        System.out.println("##############################");
        demo.doAnimalStuff();
    }
}

