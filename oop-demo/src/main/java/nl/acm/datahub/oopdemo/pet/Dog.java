package nl.acm.datahub.oopdemo.pet;

/**
 * Class that extends the pet class
 * This means that Pet is the parent class of this class
 * Dog will inherit all variables and functions, but could override some
 */
public class Dog extends Pet {

    // We must always provide a constructor! Contents not important for now
    public Dog(String aName) {
        super(aName);
    }

    // Override the makeSound for a correct implementation of this subclass
    @Override
    public void makeSound() {
        System.out.println("Woef woef");
    }
}
