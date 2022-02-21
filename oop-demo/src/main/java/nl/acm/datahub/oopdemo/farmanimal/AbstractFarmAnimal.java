package nl.acm.datahub.oopdemo.farmanimal;

/**
 * Sometimes when making a parent class we cannot know the implementation yet.
 * In that case we add an abstract method: a declaration of a method without implementation.
 * Subclasses can override this when extending this class and implement the abstract method!
 * However, we can NOT instantiate this (parent)class! Only classes without abstract methods can be instantiated
 */
public abstract class AbstractFarmAnimal {

    // Instance vars
    String name;

    // Methods

    // Constructor
    public AbstractFarmAnimal (String aName) {
        name = aName;
    }

    public void ruminate () {
        System.out.println("Chomp chomp");
    }

    // Abstract method. We declare the name, return type and parameters of the method, but do not provide an implementation
    public abstract void makeSound ();
}
