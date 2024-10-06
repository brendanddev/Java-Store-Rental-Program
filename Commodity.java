package storeRentalProgram;


/**
 * This Interface serves as a building block for a product that can be sold at the Tims Product Store. It declares the
 * behaviours that will be shared amongst the classes which implement this interface. This Interface declares two methods,
 * one for retrieving the product cost of a product, and one for retrieving the retail price of a commodity. These methods
 * are declared in order for each class that implements this interface to implement logic that is specific to that class,
 * or that type of product.
 *
 * @author BRENDAN DILEO
 */

public interface Commodity {
    /**
     * This method declaration serves as a foundation for retrieving (getting) the production cost of a product.
     *
     * @return a double value, the production cost of a product once the method is implemented.
     */
    public double getProductionCost();

    /**
     * This method declaration serves as the foundation for retrieving (getting) the retail price of a product.
     *
     * @return a double value, the retail price of a product once the method is implemented.
     */
    public double getRetailPrice();
}
