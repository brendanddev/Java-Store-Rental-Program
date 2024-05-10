package assignmentSeven_000879513;

/**
 * This is the main class responsible for running, and testing the Tims Hardware store.
 *
 * @author BRENDAN DILEO, 000879513.
 */

public class Main {
    /**
     * The main method that runs the application.
     *
     * @param args, unused.
     */
    public static void main(String[] args) {

        // Creates a TimsOrder by calling upon the static 'create' method, and saving it into a variable 'timsOrder'
        // of type TimsOrder.
        TimsOrder timsOrder = TimsOrder.create();
        // Prints the order.
        System.out.println(timsOrder);
        // Retrieves the total price of the order.
        System.out.printf("Total Price: $%.2f\n", timsOrder.getAmountDue());



    }
}
