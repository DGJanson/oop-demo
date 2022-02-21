package nl.acm.datahub.oopdemo.farmanimal;

public class Sheep extends AbstractFarmAnimal {

    // As always, we need to provide a constructor
    public Sheep(String aName) {
        super(aName);
    }

    // Specific implementation of the makeSound function
    @Override
    public void makeSound() {
        System.out.println("Beeeh beh");
    }
}
