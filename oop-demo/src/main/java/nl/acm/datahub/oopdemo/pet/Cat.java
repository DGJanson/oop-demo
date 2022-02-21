package nl.acm.datahub.oopdemo.pet;

/**
 * Class that extends the pet class
 * This means that Pet is the parent class of this class
 * Cat will inherit all variables and functions, but could override some
 */
public class Cat extends Pet {

    // We must always provide a constructor! Contents not important for now
    public Cat(String aName) {
        super(aName);
    }

    @Override
    public void makeSound () {
        System.out.println("Purrrrrrrrrrrrr");
    }
}
