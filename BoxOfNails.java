package assignmentSeven_000879513;
import java.util.Scanner;

/**
 * This class represents Box Of Nails product. It is a type of product that is sold at the Tims Hardware Store, but
 * cannot be rented, and this is shown through the fact that this class inherits from the TimsProduct class. The purpose
 * of this class is to represent a specific product that is sold. The attributes that are specific to this class consist
 * of two instance variables 'size', and 'quantity', which represent the size of the nails in the box, and the number of
 * nails that come in a box. The class has a private constructor, and a static method 'create'. The purpose of this is so
 * the constructor is not called directly, and is instead called within the 'create' method. The 'create' method is
 * responsible for creating a box of nails from user input. Additionally, the class has methods 'getSize', 'getQuantity'
 * and 'toString' each of which implement logic that are specific to a box of nails.
 *
 * @author BRENDAN DILEO, 000879513.
 */

public class BoxOfNails extends TimsProduct{
    // Instance variables:

    /**
     * 'size' of type double, represents the nail size in the box of nails.
     */
    private double size;
    /**
     * 'quantity' of type integer, represents the number of nails that come in a box of nails.
     */
    private int quantity;

    /**
     * This constructor initializes a BoxOfNails object. It will take five parameters, where 'name', 'cost' and 'price'
     * are initialized by making a call to the superclass constructor using the 'super' keyword. The 'size' and 'quantity'
     * parameters are initialized from the values passed to the constructor itself.
     *
     * @param name, the name of the box of nails.
     * @param size, the size of the nails in the box of nails.
     * @param quantity, the number of nails that come in a box.
     * @param cost, the box of nails production cost.
     * @param price, the box of nails retail price.
     */
    private BoxOfNails(String name, double size, int quantity, double cost, double price) {
        // Call to the superclass constructor.
        super(name, cost, price);
        this.size = size;
        this.quantity = quantity;
    }

    /**
     * This method is responsible for simulating the creation of a BoxOfNails, where each attribute relies on user input.
     * The method will create an instance of the BoxOfNails, and since the method itself is static, it can be invoked
     * from the class name, and there is no reliance on instance variables. Inside the method of the body an instance
     * of the Scanner class is created so the method can receive input from the user. The method then asks the user to
     * enter input for each of the local variables which are declared inside the method, and initialized to what the
     * user enters. This is done so when the instance of the class is created at the end, the local variables are passed
     * as parameters to construct the object based on what the user has entered.
     *
     * @return BoxOfNails, a newly created instance of the BoxOfNails class.
     */
    public static BoxOfNails create() {
        // Instance of Scanner class.
        Scanner sc = new Scanner(System.in);

        // Asks for the name of the product, saves it into local variable 'name'.
        System.out.println("Enter the name of the product: ");
        String name = sc.nextLine();

        // Asks for the size of the nails, saves it into local variable 'size'.
        System.out.println("Enter the size of the nails: ");
        double size = sc.nextDouble();

        // Asks for the number of nails in the box, saves it into local variable 'quantity'.
        System.out.println("Enter the number of nails: ");
        int quantity = sc.nextInt();

        // Asks for the production cost, saves it into local variable 'cost'.
        System.out.println("Enter the cost of production: ");
        double cost = sc.nextDouble();

        // Asks for the retail price, saves it into local variable 'price'.
        System.out.println("Enter the retail price: ");
        double price = sc.nextDouble();

        // Returns a new instance of the BoxOfNails class, taking the local variables as parameters.
        return new BoxOfNails(name, size, quantity, cost, price);
    }

    /**
     * This method retrieves (gets) the size of the nails in a box of nails.
     *
     * @return size, the size of the nails in the box.
     */
    public double getSize() {
        return size;
    }

    /**
     * This method retrieves (gets) the quantity/number of nails that are in a box of nails.
     *
     * @return quantity, the number of nails in a box.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * This method will return a string representation of attributes specific to the box of nails object/class. The
     * method first makes a call to the superclass 'toString' method so the name, cost, and price of the item are included
     * in the string representation, this is to avoid code duplication. Following the 'super' call, is specific information
     * to the BoxOfNails class, like the size of the nails, and the number of nails in a box.
     *
     * @return a String, which represents the attributes of a BoxOfNails object.
     */
    @Override
    public String toString() {
        // Makes call to the superclass 'toString' to retrieve the string representation of 'name', 'cost' and 'price'.
        return super.toString() + "\n" +
                "BoxOfNails: " + "\n" +
                "Size of the nails: " + size + "\n" +
                "Number of nails in the box: " + quantity;
    }
}
