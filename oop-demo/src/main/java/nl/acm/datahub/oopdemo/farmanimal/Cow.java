package nl.acm.datahub.oopdemo.farmanimal;

public class Cow extends AbstractFarmAnimal {

    // As always, we need to provide a constructor
    public Cow(String aName) {
        super(aName);
    }

    // Specific implementation of the makeSound function
    @Override
    public void makeSound() {
        System.out.println("Moooo moooooooo");
    }
}
