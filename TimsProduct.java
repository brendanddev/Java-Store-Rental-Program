package assignmentSeven_000879513;

/**
 * This abstract class serves as a base for the Tims Products. It implements the interface Commodity, meaning it will
 * have a direct polymorphic relationship to the interface. The class itself is declared as abstract, but the methods
 * implemented in the class will not be abstract. This is because the methods implemented in this class from the interface
 * will be shared amongst all subclasses, as each subclass will inherit these methods, and will include additional methods
 * specific to their class. Instances of this class will not be created directly, but will be used through the subclasses.
 * This class declares three instance variables, 'name', 'cost', and 'price', which are declared in this class as they
 * will be shared amongst subclasses. Similarly to the methods, they are implemented from the interface, and the logic
 * for the methods are implemented in this class for the subclasses to inherit. The class also initializes a 'toString'
 * method which will serve as a foundation to be called by the subclasses as it currently only offers basic information
 * specific to the overall Tims Products.
 *
 * @author BRENDAN DILEO, 000879513
 */

public abstract class TimsProduct implements Commodity {
    // Instance variables:

    /**
     * 'name' of type String, represents the name of the hardware.
     */
    private String name;
    /**
     * 'cost' of type double, represents the production cost of the hardware.
     */
    private double cost;
    /**
     * 'price' of type double, represents the retail price of the piece of hardware.
     */
    private double price;

    /**
     * This constructor serves as the superclass constructor to initialize a products name, cost and price. The purpose
     * of this constructor is to allow subclasses to invoke it by making a call using the 'super' keyword, as this class
     * is abstract and cannot be instantiated.
     *
     * @param name, the name of the piece of hardware.
     * @param cost, the hardware's production cost.
     * @param price, the hardware's retail price.
     */
    public TimsProduct(String name, double cost, double price) {
        this.name = name;
        this.cost = cost;
        this.price = price;
    }

    /**
     * This method retrieves (gets) the name of the product.
     *
     * @return name, a String representing the name of the product.
     */
    public String getName() {
        return name;
    }

    /**
     * This retrieves (gets) the production cost of the product.
     *
     * @return cost, a double value which represents a products production cost.
     */
    public double getProductionCost() {
        return cost;
    }

    /**
     * This method retrieves (gets) the retail price of a product.
     *
     * @return price, a double value which represents a products retail price.
     */
    public double getRetailPrice() {
        return price;
    }

    /**
     * This method is responsible for returning a String representation of the products name, cost, and price. It
     * provides a brief overview of the attributes that will be shared amongst all products.
     *
     * @return a string, which is a brief representation of all common attributes each product will have.
     */
    @Override
    public String toString() {
        return "\n" + "TimsProduct: " + "Name Of Product: " + name + "\n" +
                "Production Cost: " + cost + "\n" +
                "Retail Price: " + price;
    }
}
