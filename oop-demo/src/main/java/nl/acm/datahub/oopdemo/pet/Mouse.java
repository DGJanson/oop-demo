package nl.acm.datahub.oopdemo.pet;

/**
 * Class that extends the pet class
 * This means that Pet is the parent class of this class
 * Mouse will inherit all variables and functions, but could override some
 */
public class Mouse extends Pet {

    // We must always provide a constructor! Contents not important for now
    public Mouse(String aName) {
        super(aName);
    }

    @Override
    public void makeSound () {
        System.out.println("Squeek squeek");
    }

    // Extra function! Specific for mouse class
    public void whatAreWeGoingToDoTonight () {
        System.out.println("Take over the world");
    }
}
