package nl.acm.datahub.oopdemo.car;

/**
 * Example of class based object oriented programming
 * A class is a blueprint for an object. Multiple objects can be created based of a single class.
 * A class defines the variables the object has, but, generally, not the values of the variables.
 * A class also defines AND implements the functions (or methods) of the object
 * The logic of each function is the same for each object instantiated of this class,
 *   but since the functions can depend on variable-values of the object the result may differ between different objects
 */
public class Car {

    // Instance variables
    String model;
    String color;
    int odometer; // Kilometerstand

    // Functions

    // Constructor
    // The constructor is a special function that gets called on instantiation of the object
    // In this case, you have to pass the model, color and odometer when you create a Car object
    // The constructor method then sets these values for that particular instance
    public Car (String aModel, String aColor, int aOdometer) {
        // The lefthand of these expressions refer to the instance variables.
        model = aModel;
        color = aColor;
        odometer = aOdometer;
    }

    public void honk () {
        System.out.println("Toet toet");
    }

    // This function takes an integer as parameter and returns an integer
    // Note that te result depends on one of the instance vars: odometer
    public int drive (int distance) {
        odometer = odometer + distance;
        return odometer;
    }
}
