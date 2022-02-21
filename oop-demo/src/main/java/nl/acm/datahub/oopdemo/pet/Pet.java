package nl.acm.datahub.oopdemo.pet;

/**
 * Parent class for all pets
 * Defines all variables and methods that all child classes should have
 */
public class Pet {

    // instance vars
    String name;
    boolean canIPetThisAnimal;

    // Functions!

    // Constructor, called when creating object based on this class
    public Pet (String aName) {
        name = aName;
        canIPetThisAnimal = true; // You can pet by default!
    }

    // In case animal can not be petted, call this method on the object
    public void setUnpettable () {
        canIPetThisAnimal = false;
    }

    // Oh oh, we do not know what sound yet
    // Make a default implementation for now
    public void makeSound () {
        System.out.println("Generic animal sound");
    }
}
