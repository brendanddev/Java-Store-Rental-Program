package storeRentalProgram;

/**
 * This Interface serves as a building block for a product that can be rented from the Tims Product Store. The interface
 * consists of behaviours (methods) that will be shared amongst the classes that implement this interface. The interface
 * declares three methods, each of which contribute to the functionality between renting a piece of hardware. The first
 * method declared 'rentHardware' is responsible for letting the user rent a piece of rentable hardware, the second
 * method 'returnHardware' is responsible for letting the user return a piece of rented hardware, and the third method
 * 'isRented' checks if the piece of hardware is currently rented or not. Each of these methods are declared, and
 * currently contain no logic, as each class implementing this interface will implement its own logic that is specific
 * to that class, or piece of hardware.
 *
 * @author BRENDAN DILEO
 */

public interface Rentable {
    /**
     * This method declaration serves as the foundation for renting a piece of hardware.
     */
    public void rentHardware();

    /**
     * This method declaration serves as the foundation for returning a piece of hardware.
     */
    public void returnHardware();

    /**
     * This method declaration serves as a foundation for checking whether or not the piece of hardware is currently rented.
     *
     * @return a boolean value, indicating if the hardware is rented or not, once the method has been implemented.
     */
    public boolean isRented();
}
