package storeRentalProgram;


/**
 * This abstract class serves as a base for the Rentable Hardware that is offered at the Tims Hardware Store. The class
 * inherits (extends) the TimsProduct class as every rentable hardware product is a type of product, and also implements
 * the Rentable interface, meaning it will have a polymorphic relationship, as this class represents a piece of hardware
 * that can be rented. Although the class itself is abstract, but the methods implemented in the class will not be abstract.
 * This is because the methods implemented in this class from the interface will be shared amongst all subclasses, as
 * each of the subclasses will inherit these methods, but will also include additional methods specific to each class.
 * Instances of this class will not be created directly, but will be used through the subclasses. This class declares
 * two instance variables 'rentalCost', and 'rented', which are declared in this class as they will be shared amongst
 * subclasses. Similarly to the methods, they are implemented from the interface, and the logic for the methods are
 * implemented in this class for the subclasses to inherit.
 *
 * @author BRENDAN DILEO
 */

public abstract class RentableHardware extends TimsProduct implements Rentable{
    // Instance variables:

    /**
     * 'rentalCost' of type double, represents the rentable hardware's rental cost.
     */
    private double rentalCost;
    /**
     * 'rented' of type boolean, indicates the rental status of a piece of rental hardware.
     */
    private boolean rented;

    /**
     * This constructor serves as the superclass constructor to initialize the name, rental cost, production cost, and
     * retail price of a rentable piece of hardware. The purpose of this constructor is to allow the subclasses to invoke
     * it by making a call using the 'super' keyword, which in turn invokes the RentableHardware class's superclass
     * constructor as this class's constructor makes a call to its own superclass constructor initializing 'name', 'cost',
     * and 'price'. The variable 'rentalCost' is initialized in this class and constructor itself. The class is abstract,
     * so an instance of this class cannot be directly instantiated.
     *
     * @param name, the name of the piece of rentable hardware.
     * @param rentalCost, the cost of renting the piece of hardware.
     * @param cost, the rentable hardware's production cost.
     * @param price, the rentable hardware's retail price.
     */
    public RentableHardware(String name, double rentalCost, double cost, double price) {
        super(name, cost, price);
        this.rentalCost = rentalCost;
    }

    /**
     * This method retrieves the rental cost of a piece of rentable hardware.
     *
     * @return rentalCost, the cost to rent the piece of hardware.
     */
    public double getRentalCost() {
        return rentalCost;
    }

    /**
     * This method simulates the action of renting a piece of rentable hardware, changing the status of the variable
     * 'rented' to true, simulating the renting of a piece of hardware.
     */
    public void rentHardware() {
        rented = true;
    }

    /**
     * This method simulates the action of returning a piece of rentable hardware, changing the status of the variable
     * 'rented' to false, simulating the returning of a piece of hardware.
     */
    public void returnHardware() {
        rented = false;
    }

    /**
     * This method is used to check the rental status of a piece of rentable hardware. When it is called upon, the method
     * returns the boolean value that the 'rented' variable holds, which indicates whether or not the piece of hardware
     * is currently rented.
     *
     * @return rented, a boolean value indicating the rental status of a piece of rentable hardware.
     */
    public boolean isRented() {
        return rented;
    }

}
