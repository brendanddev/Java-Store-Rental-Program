package storeRentalProgram;

import java.util.Scanner;

/**
 * This class represents the Chainsaw hardware product that can be rented, or purchased at the Tims Hardware Store. As
 * this class inherits from (extends) the RentableHardware class, this means that this product can be rented, and since
 * the RentableHardware class inherits (extends) the TimsProduct class, this implies that the hardware product can also
 * be purchased. The purpose of this class is to represent the Chainsaw hardware product at the Tims Hardware Store, and
 * contains attributes specific to the Chainsaw product. The class contains one instance variable 'features' representing
 * the Chainsaw's features. Additionally, the class will also have a private constructor, and a static 'create' method
 * responsible for creating an instance of the class. The constructor is private, and the method is static so creating
 * an instance of the class relies on the use of the 'create' method rather than the constructor itself. The class will
 * also have a getter method 'getFeatures' for retrieving the Chainsaw's features, and a 'toString' method to show a
 * string representation of the Chainsaw object consisting of the attributes specific to the Chainsaw, and the attributes
 * shared amongst Tims Hardware products.
 *
 * @author BRENDAN DILEO.
 */

public class Chainsaw extends RentableHardware {
    // Instance variables:

    /**
     * 'features' of type String, represents the Chainsaw's features.
     */
    private String features;

    /**
     * This private constructor is responsible for initializing the Chainsaw hardware product. It will take five
     * parameters, where 'name', 'rentalCost', 'cost' and 'price' are initialized through making a call to the superclass
     * constructor with the use of the 'super' keyword. The parameter 'features' is initialized to the parameter that
     * is passed to the constructor itself. This constructor is private as it will be invoked by the static method in
     * the class to create an instance of the Chainsaw, rather than invoking the constructor directly.
     *
     * @param name, the name of the Chainsaw.
     * @param features, the Chainsaw's features.
     * @param rentalCost, the Chainsaw's rental cost.
     * @param cost, the Chainsaw's production cost.
     * @param price, the Chainsaw's retail price.
     */
    private Chainsaw(String name, String features, double rentalCost, double cost, double price) {
        // Call to the superclass constructor.
        super(name, rentalCost, cost, price);
        this.features = features;
    }

    /**
     * THis method is responsible for simulating the creation of a Chainsaw based upon user input. The user will be
     * prompted to enter information and values for each of the Chainsaw's attributes, which will then construct the
     * Chainsaw based upon these attributes. The purpose of the method is to create an instance of the Chainsaw, and
     * since the method 'create' itself is static, it can be invoked from the class itself/class name rather than needing
     * an instance of the class beforehand. The method starts by creating an instance of the scanner class, in order to
     * receive input from the user.The method then prompts the user to enter values for each attribute through the print
     * line statements, where each input for an attribute is saved into a local variable, which is then used as arguments
     * to pass to the Chainsaw constructor. The method will return a new instance of the Chainsaw class, with attributes
     * based on what the user has entered.
     *
     * @return Chainsaw, a new instance of the Chainsaw class based on the input from the user.
     */
    public static Chainsaw create() {
        // Creates instance of the Scanner class.
        Scanner sc = new Scanner(System.in);

        // Prompts user for the Chainsaw's name, saves it into local variable 'name'.
        System.out.println("Enter the name of the Chainsaw: ");
        String name = sc.nextLine();

        // Prompts the user for the Chainsaw's features, saves it into local variable 'features'.
        System.out.println("Enter the Chainsaw's features: ");
        String features = sc.nextLine();

        // Prompts the user for the Chainsaw's rental cost, saves it into local variable 'rentalCost'.
        System.out.println("Enter the Chainsaw's rental cost: ");
        double rentalCost = sc.nextDouble();

        // Prompts the user to enter the Chainsaw's production cost, saves it into local variable 'cost'.
        System.out.println("Enter the Chainsaw's production cost: ");
        double cost = sc.nextDouble();

        // Prompts the user to enter the Chainsaw's retail price, saves it into local variable 'price'.
        System.out.println("Enter the Chainsaw's retail price: ");
        double price = sc.nextDouble();

        // Returns a new instance of the Chainsaw class, taking each local variable as arguments to construct the instance.
        return new Chainsaw(name, features, rentalCost, cost, price);
    }

    /**
     * This method retrieves (gets) the Chainsaw's features.
     *
     * @return features, a string representation of the Chainsaw's features.
     */
    public String getFeatures() {
        return features;
    }

    /**
     * This method is responsible for returning a string representation of the Chainsaw class, which will include the
     * attributes specific to the Chainsaw, and the attributes that are shared amongst rentable products, and Tims
     * Hardware products in general. The method first declares a local variable 'isReturned' which will represent whether
     * or not the Chainsaw was returned after being rented. It uses an if statement to check the status of the method
     * 'isRented' which is inherited from the RentableHardware class, and if it holds true, meaning the Chainsaw is
     * rented, this means it was not returned. If the method holds false, this means the item was returned therefore the
     * local variable will hold a 'Yes'. A call is then made to the superclasses 'toString' method so that each attribute
     * shared amongst all products, and rentable products are included in the string representation of the piece of
     * hardware, eliminating the need of rewriting the code. The string representation also includes the attribute
     * specific to the Chainsaw, 'features', the rental cost, and the status of the rental in the string.
     *
     * @return a string, which is a string representation of the Chainsaw class/object.
     */
    public String toString() {
        // Makes call to the superclass 'toString' method.
        return super.toString() + "\n" +
                "Chainsaw: " + "\n" +
                "Chainsaw Features: " + features + "\n" +
                "Chainsaw Rental Cost: " + getRentalCost() + "\n" +
                "Item is rented: " + isRented();
    }

}
