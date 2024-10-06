package storeRentalProgram;

import java.util.Scanner;

/**
 * This class represents the NailGun hardware product that can be rented, or purchased at the Tims Hardware Store. As
 * this class inherits from (extends) the RentableHardware class, this means that this product can be rented, and since
 * the RentableHardware class inherits (extends) from the TimsProduct class, this also means that this hardware product
 * can be purchased aswell. The purpose of this class is to represent a specific product, in this case a NailGun that
 * can either be rented, or sold. The attributes specific to this class will consist of one instance variable 'features'
 * which represents the features of a NailGun. The class will also have a private constructor, and a static 'create'
 * method. The private constructor will not be invoked/called upon directly, but will instead rely on the 'create' method
 * to create a NailGun object based on user input. The class also has a 'getFeatures' method which retrieves the features
 * of the NailGun, and a 'toString' method each of which will contain logic that is specific to the NailGun class.
 *
 * @author BRENDAN DILEO.
 */

public class NailGun extends RentableHardware {
    // Instance variables:

    /**
     * 'features' of type String, represents the NailGun's features.
     */
    private String features;

    /**
     * This is the private constructor that initializes a NailGun hardware product. It takes five parameters, where the
     * 'name', 'rentalCost', 'cost', and 'price' are initialized by making a call to the superclass constructor using
     * the 'super' keyword. (The superclass/parent class to this class is RentableHardware). The 'features' parameter is
     * initialized to the parameter that is passed to the constructor.
     *
     * @param name, the name of the NailGun.
     * @param features, the NailGun's features.
     * @param rentalCost, the cost of renting the NailGun.
     * @param cost, the NailGun's production cost.
     * @param price, the NailGun's retail price.
     */
    private NailGun(String name, String features, double rentalCost, double cost, double price) {
        // Makes call to the superclass constructor
        super(name, rentalCost, cost, price);
        this.features = features;
    }

    /**
     * This method 'create' is responsible for simulating the creation of a NailGun, where each of the NailGun's attributes
     * relies on the users input. The method will create an instance of the NailGun, and since the method itself is static,
     * it can be invoked from the name of the class/class itself, rather than relying on the instance variables, or the
     * need to have an instance of the class beforehand. The method creates an instance of the Scanner class in order to
     * take input from the user. The method then prompts the user to enter values each of which are assigned to the local
     * variables declared inside the methods scope. The purpose of this is so when an instance of the NailGun class is
     * returned from the method, the local variables are passed to the constructor, in turn creating a NailGun object
     * based on what the user has entered.
     *
     *
     * @return NailGun, an instance of the NailGun class based on the users input.
     */
    public static NailGun create() {
        // Creates instance of the Scanner class.
        Scanner sc = new Scanner(System.in);

        // Asks for the name of the NailGun, saves it into local variable 'name'.
        System.out.println("Enter the name of the NailGun: ");
        String name = sc.nextLine();

        // Asks for the NailGun's features, saves it into local variable 'features'.
        System.out.println("Enter the NailGuns features: ");
        String features = sc.nextLine();

        // Asks for the NailGun's rental cost, saves it into local variable 'rentalCost'.
        System.out.println("Enter the NailGun's rental cost: ");
        double rentalCost = sc.nextDouble();

        // Asks for the NailGun's production cost, saves it into local variable 'cost'.
        System.out.println("Enter the production cost of the NailGun: ");
        double cost = sc.nextDouble();

        // Asks for the NailGun's retail price, saves it into local variable 'price'.
        System.out.println("Enter the retail price of the NailGun: ");
        double price = sc.nextDouble();

        // Returns a new instance of the NailGun class, taking the local variables as parameters.
        return new NailGun(name, features, rentalCost, cost, price);
    }

    /**
     * This method is responsible for retrieving (getting) the NailGun's features.
     *
     * @return features, the NailGun's features.
     */
    public String getFeatures() {
        return features;
    }

    /**
     * This 'toString' method will return a string representation of attributes that are specific to the NailGun class.
     * In the body of the method, an additional local variable is declared, and initialized to either 'No', or 'Yes'
     * which is determined by the value that the 'isReturned' method inherited from the RentableHardware class holds,
     * indicating whether or not the NailGun is currently rented. After this, a call is made to the superclasses
     * 'toString' method so that the attributes shared amongst rentable hardware products at the Tims Hardware Store
     * like 'name', 'rentalCost', 'cost', 'price', whether or not the item is currently rented, and whether or not the
     * item was rented and the returned are included in the string representation without the need to rewrite all the
     * code by making a call to the superclass using the 'super' keyword. Additionally, the attribute specific to the
     * NailGun class 'features', the rental cost, and the status of the rental will also be included in the NailGun
     * string representation.
     *
     * @return a string, which is a string representation of the NailGun class/object.
     */
    public String toString() {
        // Makes call to the superclass 'toString' method.
        return super.toString() + "\n" +
                "NailGun: " + "\n" +
                "NailGun Features: " + features + "\n" +
                "NailGun Rental Cost: " + getRentalCost() + "\n" +
                "Item is rented: " + isRented();
    }
}
