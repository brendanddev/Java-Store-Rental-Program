package storeRentalProgram;

import java.util.Scanner;

/**
 * This class represents a Bobcat, which is a type of product that is sold at the Tims Hardware Store. This product can
 * only be purchased, and cannot be rented, as this is shown through the fact the class inherits from the TimsProduct
 * class. The purpose of this class is to represent a specific product that is sold at the store, where this product will
 * have attributes specific to this class/product. The attributes specific to this class consist of the instance variables
 * 'weight', and 'carryWeight', which represent the weight of the Bobcat, and the weight that the Bobcat can carry/handle.
 * This class will have a private constructor, and a static method 'create' responsible for creating an instance of the
 * Bobcat. The purpose of the private constructor is so the object cannot be created through the constructor itself, but
 * is instead created through the invoking of the 'create' method, which in turn returns an instance of the created Bobcat.
 * The class will also have methods 'getWeight', 'getCarryWeight', and a 'toString', each of which contain logic that is
 * specific to this class.
 *
 * @author BRENDAN DILEO, 000879513.
 */

public class Bobcat extends TimsProduct{
    // Instance variables:

    /**
     * 'weight' of type double, represents the weight of the Bobcat.
     */
    private double weight;
    /**
     * 'carryWeight' of type double, represents the weight that the Bobcat can carry.
     */
    private double carryWeight;

    /**
     * This constructor is responsible for initializing a Bobcat object. It takes five parameters, where 'name', 'cost',
     * and 'price', are initialized through the call to the superclass constructor using the 'super' keyword, and the
     * 'weight' and 'carryWeight' are initialized through the values passed to the constructor itself.
     *
     * @param name, the name of the Bobcat.
     * @param weight, the Bobcat's weight.
     * @param carryWeight, the weight the Bobcat can carry.
     * @param cost, the Bobcat's production cost.
     * @param price, the Bobcat's retail price.
     */
    private Bobcat(String name, double weight, double carryWeight, double cost, double price) {
        // Call to the superclass constructor.
        super(name, cost, price);
        this.weight = weight;
        this.carryWeight = carryWeight;
    }

    /**
     * This method is responsible for simulating the creation of a Bobcat, where each attribute relies on the user input.
     * The method will create an instance of the Bobcat object, and since the method itself is static, it can be invoked
     * from the class name, and there is no reliance on instance variables. Inside the body of the method, an instance
     * of the Scanner class is created, this is so the method can take input from the user in order to create an instance
     * of the Bobcat. The method then asks the user to enter input corresponding to each attribute, and saves it into a
     * local variable declared inside the method. This is done so when an instance of the class is created as a result
     * of invoking the 'create' method, each local variable is passed to the constructor to create the object based on
     * the values that the user has entered.
     *
     *
     * @return a Bobcat, a newly created instance of the Bobcat class.
     */
    public static Bobcat create() {
        // Creates instance of the Scanner class.
        Scanner sc = new Scanner(System.in);

        // Asks for the name of the product, saves it into local variable 'name'.
        System.out.println("Enter the name of the product: ");
        String name = sc.nextLine();

        // Asks for the Bobcat's weight, saves into local variable 'weight'.
        System.out.println("Enter the weight of the Bobcat: ");
        double weight = sc.nextDouble();

        // Asks for the weight the Bobcat can carry, saves it into local variable 'carryWeight'.
        System.out.println("Enter the weight the Bobcat needs to carry: ");
        double carryWeight = sc.nextInt();

        // Asks for the production cost of the Bobcat, saves into local variable 'cost'.
        System.out.println("Enter the Bobcats production cost: ");
        double cost = sc.nextDouble();

        // Asks for the Bobcat's retail price, saves into local variable 'price'.
        System.out.println("Enter the Bobcats retail price: ");
        double price = sc.nextDouble();

        // Returns a new instance of the Bobcat class, taking each local variable as parameters for the constructor.
        return new Bobcat(name, weight, carryWeight, cost, price);
    }

    /**
     * This method is responsible for retrieving (getting) the weight of the Bobcat.
     *
     * @return weight, the Bobcat's weight.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * This method is responsible for retrieving (getting) the weight that the Bobcat can carry.
     *
     * @return carryWeight, weight that the Bobcat can carry/lift.
     */
    public double getCarryWeight() {
        return carryWeight;
    }

    /**
     * This method is responsible for returning a string representation of attributes that are specific to the Bobcat
     * class. Inside the body of the method, is a call to the superclasses 'toString' method, this is so the attributes
     * that are shared amongst Tims Hardware Store products like 'name', 'cost', and 'price' are included in the method
     * without needing to rewrite the code. After the call to the superclass, the attributes specific to the Bobcat
     * 'weight' and 'carryWeight' are included in the string.
     *
     * @return a string, which is a string representation of the Bobcat object/class.
     */
    @Override
    public String toString() {
        // Call to superclass 'toString'.
        return super.toString() + "\n" +
                "Bobcat: " + "\n" +
                "Weight of the Bobcat: " + weight + "\n" +
                "Weight Bobcat can lift: " + carryWeight;

    }
}
