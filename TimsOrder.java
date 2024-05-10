package assignmentSeven_000879513;
import java.util.Scanner;

/**
 * This class represents the creation and placing of an order that has been made by a user for the Tims Hardware Store.
 * The class has a relationship of association with the TimsProduct class, allowing this class to access the methods from
 * the TimsProduct class, as this class contains an instance of the TimsProduct class as an array 'timsProduct'. The class
 * contains three instance variables, 'size', 'customerName', and 'timsProduct' where 'size' represents the number of
 * products the customer/user will be renting or purchasing, 'customerName' represents the name of the customer/user, and
 * 'timsProduct' represents the array of products the user/customer will either be purchasing or renting. The private
 * constructor within the class is responsible for creating an instance of the TimsOrder class, which will represent an
 * order that a customer/user has made. The constructor will take two parameters, 'customerName', and 'size', for the
 * name of the customer, and the number of products they will be buying or renting. Inside the body of the constructor
 * an array is initialized with a length of size, as this array will consist of the products that the user will be buying
 * or renting, given the number of products. The class will also have its own implementation of the 'create' method,
 * which will allow the user to rent hardware, purchase hardware, return hardware, or exit and receive their receipt and
 * total. The class also offers a getter method 'getAmountDue' which will retrieve the amount of money that the customer
 * will owe, depending on whether or not they have rented, or purchased the hardware. Additionally, the class has its own
 * implementation of a 'toString' method, which will return a string representation of the customers name, and iterate
 * through the array of orders, and show each one, with the corresponding information.
 *
 * @author BRENDAN DILEO, 000879513.
 */

    // In terms of the logic for returning the item, it is not specified how it should be handled in the assignments
    // instructions, so I attempted to implement my own form of logic for it. Although for the most part it is successful,
    // if you make the size as 2 for example, and then rent or purchase 2 items, but then try and rent another two items,
    // the last two items you rent or purchase will override the previous 2, I tried for a while and could not seem to
    // find a solution that still incorporates the user entered size of the array. Additionally, after returning an item,
    // the total price is not reflected properly, as the program assumes if the item was returned, the user will be no
    // longer renting, but now purchasing the item, but neither of these aspects were directly mentioned in the assignment.
    // Although the assignment did not mention anything about the 'quit' part, or the actual behaviour of returning a
    // piece of hardware, I just wanted to try it. So im hoping I won't lose marks for this as it was not specifically
    // mentioned in the assignment.

public class TimsOrder {
    // Instance variables:

    /**
     * 'size' of type int, represents the number of hardware products the customer will be renting, or purchasing.
     */
    private int size;
    /**
     * 'customerName' of type String, represents the name of the customer that is renting, or purchasing hardware.
     */
    private String customerName;
    /**
     * 'timsProduct' of type TimsProduct[], represents an array of TimsProduct's which allows this class to store each
     * product in an array as the order.
     */
    private TimsProduct[] timsProduct;

    /**
     * This constructor is responsible for creating an instance of the TimsOrder class, given the two parameters
     * 'customerName', and 'size'. The purpose of this constructor is to set up the TimsOrder with the given customer
     * name, and size of the customers order (Number of products). Inside the constructor the 'timsProduct' array is
     * initialized with a length of 'size', this is so the array will now hold instances of the TimsProduct object/class
     * representing the customers order. The constructor itself is private, as it will not be invoked directly, but
     * instead relies on the static 'create' method to create instances of the users order, and then populate the array.
     *
     * @param customerName, the name of the customer.
     * @param size, the number of items the customer will be purchasing.
     */
    private TimsOrder(String customerName, int size) {
        this.customerName = customerName;
        this.size = size;
        // Array is initialized to an array of TimsProduct's with a length of 'size'.
        timsProduct = new TimsProduct[size];
    }

    /**
     * This method is responsible for creating an instance of the class (TimsOrder) rather than using the constructor
     * itself to create an instance. The method will still utilize the constructor, but inside the body of this method
     * as the constructor is private, and this method is static. The method will prompt the user to enter information,
     * and choose what they would like to do. The method will then handle the users choice with the corresponding logic,
     * and the user will be able to continue to rent, purchase, or return, as long as they do not quit, and they have
     * specified the correct number of items they plan to buy. The method will then return the 'timsOrder', which is the
     * instance of the TimsOrder class that has been created based upon the input from the user.
     *
     * @return timsOrder, an instance of the TimsOrder based on the input from the user.
     */
    public static TimsOrder create() {
        // Creates instance of the scanner class.
        Scanner sc = new Scanner(System.in);

        // Prompts the user to enter their name, saves it into local variable 'customerName'.
        System.out.println("Enter the name of the customer: ");
        String customerName = sc.nextLine();

        // Prompts the user to enter the number of products they plan to purchase, or rent. Saves the value into the
        // local variable 'size'.
        System.out.println("Enter the number of products being purchased or rented: ");
        int size = sc.nextInt();
        // Consumes the next line character.
        sc.nextLine();

        // Creates a new instance of the TimsOrder class using the class's private constructor, and passes the local
        // variables which hold the user inputs as arguments.
        TimsOrder timsOrder = new TimsOrder(customerName, size);
        // Declares the variable choice.
        int choice;

        // Enters the outer do-while loop to continuously prompt the user until they enter a specified value '4'.
        do {
            // Prompts the user asking them what they would like to do.
            System.out.println("Would you like to rent, or purchase hardware?");
            System.out.println("Enter '1' to rent, '2' to purchase, '3' to return a piece of hardware, or '4' to quit: ");
            // Initializes the variable 'choice' to what the user has entered as this corresponds to what they would like
            // to do.
            choice = sc.nextInt();
            // Consumes the next line character.
            sc.nextLine();

            // The if statement is responsible for checking the value of 'choice', and if it holds the value 1. If the
            // user has entered 1, this means they would like to rent.
            if (choice == 1) {
                // The for loop iterates through the number of products, up to the number of products the user intends
                // to purchase or rent.
                for (int i = 0; i < size; i++) {
                    // A variable 'hardwareChoice' is declared representing which piece of hardware the user would like
                    // to rent.
                    int hardwareChoice;
                    // Enters a nested do-while loop to prompt the user to choose a piece of hardware to rent.
                    do {
                        // Prompts the user which of the two pieces of hardware they would like to rent, as there are
                        // only two pieces of hardware that can be rented.
                        System.out.println("What type of hardware would you like to rent?");
                        System.out.println("Enter '1' to rent the NailGun, or '2' to rent the Chainsaw: ");
                        // Depending on which piece of hardware the user would like to rent, their choice is saved into
                        // the variable 'hardwareChoice' which is initialized to the choice the user has made.
                        hardwareChoice = sc.nextInt();
                        // Consumes next line character.
                        sc.nextLine();

                        // This switch case is responsible creating the specified item, and renting this item depending
                        // on the piece of hardware the user would like to rent.
                        switch (hardwareChoice) {
                            // If the user has entered 1, meaning they would like to rent a NailGun, this case is
                            // executed.
                            case 1:
                                // An instance of the NailGun class is created by calling upon the static 'create' method.
                                NailGun nailGun = NailGun.create();
                                // The nested if statement checks if the NailGun is currently rented or not.
                                if (!nailGun.isRented()) {
                                    // If the NailGun is not already rented, meaning it can be rented, the newly created
                                    // NailGun product is assigned to the index 'i' of the 'timsProduct' array.
                                    timsOrder.timsProduct[i] = nailGun;
                                    // Calls upon the 'rentHardware' method to reflect that the NailGun is now rented.
                                    nailGun.rentHardware();
                                // If the NailGun was already rented, this else block will be executed prompting the user
                                // that they cannot currently rent the product.
                                } else {
                                    System.out.println("The NailGun cannot be rented at this time.");
                                }
                                // 'break' statement exits the switch block.
                                break;
                            // If the user has entered 2, meaning they would like to rent a Chainsaw, this case is
                            // executed.
                            case 2:
                                // An instance of the Chainsaw class is created by calling upon the static 'create' method.
                                Chainsaw chainsaw = Chainsaw.create();
                                // The nested if statement checks if the Chainsaw is currently rented.
                                if (!chainsaw.isRented()) {
                                    // If it's not currently rented, meaning the user can rent it, the newly created
                                    // Chainsaw product is assigned to the index 'i' of the 'timsProduct' array.
                                    timsOrder.timsProduct[i] = chainsaw;
                                    // Calls upon the 'rentHardware' method to reflect the fact the Chainsaw is now rented.
                                    chainsaw.rentHardware();
                                // The else block will be executed if the Chainsaw is already rented.
                                } else {
                                    System.out.println("The Chainsaw cannot be rented at this time.");
                                }
                                // 'break' statement is used to exit the switch block.
                                break;
                            // The default case is executed if the user enters a choice that isnt 1 or 2, prompting them
                            // that you can only rent the NailGun, or Chainsaw.
                            default:
                                System.out.println("We only offer rentals on the NailGun's and Chainsaw's!");
                                break;
                        }
                    // If the user has chosen an invalid choice, they will be prompted again as there are only two options,
                    // the while loop ensures that the user has entered a valid choice.
                    } while (hardwareChoice < 1 || hardwareChoice > 2);
                }
            // The else-if statement is responsible for checking the value of 'choice', and if it holds the value 2. If
            // the user has entered 2, this means they would like to purchase a piece of hardware.
            } else if (choice == 2) {
                // The for loop iterates through the number of products, up to the number of products the user intends
                // to purchase or rent 'size'.
                for (int i = 0; i < size; i++) {
                    //A local variable 'hardwareChoice' is declared within the else-if scope, representing which piece
                    // of hardware the user would like to purchase.
                    int hardwareChoice;
                    // The inner do-while loop will prompt the user to choose a piece of hardware to purchase.
                    do {
                        // The user is then prompted to choose one of the four hardware products to purchase, as any of
                        // the four hardware products can be purchased.
                        System.out.println("What type of hardware would you like to purchase?");
                        System.out.println("Enter '1' to purchase the Box of Nails, '2' to purchase a Bobcat, " +
                                "'3' to purchase a NailGun, or '4' to purchase a Chainsaw: ");
                        // Depending on the choice the user makes given the piece of hardware they will be purchasing,
                        // their choice is saved into the variable 'hardwareChoice' initialized to the value they
                        // entered.
                        hardwareChoice = sc.nextInt();
                        // Consumes next line character.
                        sc.nextLine();

                        // The switch case is responsible for creating the hardware product the user has chosen to
                        // purchase.
                        switch (hardwareChoice) {
                            // If the user has chosen/entered 1, meaning they would like to purchase a BoxOfNails, this
                            // case is executed.
                            case 1:
                                // An instance of the BoxOfNails class is created by calling upon the static 'create'
                                // method.
                                BoxOfNails boxOfNails = BoxOfNails.create();
                                // The newly created BoxOfNails product 'boxOfNails' is assigned to the index 'i' of the
                                // 'timsProduct' array.
                                timsOrder.timsProduct[i] = boxOfNails;
                                // The break statement exits the switch block.
                                break;
                            // If the user has chosen/entered 2, meaning they would like to purchase a Bobcat, this case
                            // is executed.
                            case 2:
                                // An instance of the Bobcat class is created by calling upon the static 'create' method,
                                // and saved into the variable 'bobcat' of type Bobcat.
                                Bobcat bobcat = Bobcat.create();
                                // The newly created Bobcat product is assigned to index 'i' of the 'timsProduct' array.
                                timsOrder.timsProduct[i] = bobcat;
                                // The 'break' statement exits the switch block.
                                break;
                            // If the user has chosen/entered 3, meaning they would like to purchase a NailGun, this case
                            // is executed.
                            case 3:
                                // An instance of the NailGun class is created using the static 'create' method, and
                                // saved into the variable 'nailGun' of type NailGun.
                                NailGun nailGun = NailGun.create();
                                // The newly created NailGun product is assigned to the index 'i' of the 'timsProduct'
                                // array.
                                timsOrder.timsProduct[i] = nailGun;
                                // This 'break' statement exits the switch block.
                                break;
                            // If the user has entered/chosen 4, this means they would like to purchase a Chainsaw, and
                            // this case is executed.
                            case 4:
                                // An instance of the Chainsaw class/object is created using the static 'create' method,
                                // which is then saved into the variable 'chainsaw' of type Chainsaw.
                                Chainsaw chainsaw = Chainsaw.create();
                                // The newly created Chainsaw product is assigned to the index 'i' of the 'timsProduct'
                                // array.
                                timsOrder.timsProduct[i] = chainsaw;
                                // The 'break' statement exits the switch block.
                                break;
                            // The default case will be executed if the user enters an invalid value, which means a value
                            // less than 1, or higher than 4.
                            default:
                                System.out.println("We only offer Box's of Nails, Bobcat's, Nailgun's, or Chainsaw's for purchase!");
                                break;
                        }
                    // The while condition will make the sure the user is continuously prompted if they enter a invalid
                    // value, a value less than 1, or greater than 4.
                    } while (hardwareChoice < 1 || hardwareChoice > 4);
                }
            // This else-if block will check if the user has entered a value of 3, by checking what value the 'choice'
            // variable holds. If it holds the value of 3, meaning the user would like to return an item, the code inside
            // the body of this else-if block is executed.
            } else if (choice == 3) {
                // The user is prompted to choose one of the two rentable pieces of hardware to return.
                System.out.println("Which piece of hardware would you like to return?");
                System.out.println("Enter '1' to return a rented Nailgun, or '2' to return a rented Chainsaw: ");
                // Depending on which piece of hardware they would like to return, the value they have entered as the
                // choice of hardware to be returned is saved into the variable 'returnHardware'.
                int returnHardware = sc.nextInt();

                // This if statement checks if the user has entered 1, which means they would like to return a NailGun.
                if (returnHardware == 1) {
                    // This boolean variable 'nailGunRented' is declared and initialized to false as default, as this
                    // will act as a boolean flag to whether or no the NailGun was rented by the user or not.
                    boolean nailGunRented = false;
                    // This for loop iterates through the array of Tims Hardware products 'timsProducts'.
                    for (int i = 0; i < size; i++) {
                        // This nested if statement checks if the products at the index 'i' of the array, is an instance
                        // of the NailGun class (Is a NailGun since NailGun has no subclasses).
                        if (timsOrder.timsProduct[i] instanceof NailGun) {
                            // If it is, which means a NailGun is found, the product is casted into type NailGun, and
                            // saved into a variable 'nailgun'. I casted it just in case, as this is what I saw from our
                            // notes, but I feel like you wouldn't need to since the 'instanceof' is checking if it is an
                            // instance of 'NailGun', and the 'NailGun' class has no subclasses.
                            NailGun nailgun = (NailGun) timsOrder.timsProduct[i];
                            // This inner nested if statement is used to check whether or not this NailGun object is
                            // currently rented by calling upon the 'isRented' method.
                            if (nailgun.isRented()) {
                                // If the 'nailgun' is currently rented, the 'returnHardware' method is called upon to
                                // simulate the 'nailgun' being returned.
                                nailgun.returnHardware();
                                // The user is prompted with a message that they have returned the NailGun.
                                System.out.println("You have successfully returned the Nailgun!");
                                // The boolean flag tracking whether or not the NailGun is rented is reassigned to true,
                                // as the was rented, until it was returned.
                                nailGunRented = true;
                                // The 'break' statement exits the loop.
                                break;
                            }
                        }
                    }
                    // This if statement is checking the boolean flag 'nailGunRented' and negating the value it
                    // currently holds. If the variable holds 'false', this means the user has not rented a nailgun, and
                    // therefore will not have the opportunity to return a NailGun. A corresponding prompt is printed
                    // to the user saying they have no NailGun.
                    if (!nailGunRented) {
                        System.out.println("You have not rented a Nailgun! ");
                    }
                // The else-if statement checks the condition of if the user has entered a 2, which means they would like
                // to return a Chainsaw that has been rented.
                } else if (returnHardware == 2) {
                    // A boolean variable 'chainsawRented' is declared and initialized to false acting as a boolean flag
                    // keeping track of whether or not the user has actually rented a Chainsaw before attempting to return
                    // one.
                    boolean chainsawRented = false;
                    // This for loop will iterate through each element of the 'timsProduct' array which will hold each
                    // of the products the user has rented or purchased.
                    for (int i = 0; i < size; i++) {
                        // This nested if statement checks if the product at the index 'i' of the 'timsProduct' array is
                        // an instance of the Chainsaw class (Is a Chainsaw, since the Chainsaw class has no subclasses).
                        if (timsOrder.timsProduct[i] instanceof Chainsaw) {
                            // If it is, which means a NailGun is found, the product is casted into type NailGun, and
                            // saved into a variable 'nailgun'. I casted it just in case, as this is what I saw from our
                            // notes, but I feel like you wouldn't need to since the 'instanceof' is checking if it is an
                            // instance of 'NailGun', and the 'NailGun' class has no subclasses.

                            // If the element at index 'i' is an instance of the Chainsaw class, the product is casted
                            // into a type Chainsaw, and saved into a variable 'chainsaw' of type Chainsaw. I casted this
                            // just in case as I was following the class notes, and this is what was done. I feel that
                            // the 'instanceof' checks this anyway, but to be sure, I casted it either way.
                            Chainsaw chainsaw = (Chainsaw) timsOrder.timsProduct[i];
                            // This nested inner if statement is used to check whether or not the Chainsaw 'chainsaw' is
                            // currently rented or not by calling upon the 'isRented' method.
                            if (chainsaw.isRented()) {
                                // If the Chainsaw 'chainsaw' is currently rented, the 'returnHardware' method is called
                                // upon to reflect and simulate the fact that the 'chainsaw' is now returned after being
                                // rented.
                                chainsaw.returnHardware();
                                // A prompt is printed to the user as they have returned the Chainsaw.
                                System.out.println("You have successfully returned the Chainsaw!");
                                // To reflect the fact that a Chainsaw was rented, the boolean flag is reassigned to true.
                                chainsawRented = true;
                                // To exit out of the loop, the 'break' statement is used.
                                break;
                            }
                        }
                    }
                    // This if statement is checking the boolean flag 'chainsawRented' and negating the value it
                    // currently holds. If the variable holds 'false', this means the user has not rented a chainsaw,
                    // and therefore will not have the opportunity to return a Chainsaw. A corresponding prompt is printed
                    // to the user saying they have no Chainsaw.
                    if (!chainsawRented) {
                        System.out.println("You have not rented a Chainsaw!");
                    }
                }
            }
        // The outer do-while loop will continue executing and prompting the user until they enter '4', which is the
        // prompt to quit.
        } while (choice != 4);
        // The 'timsOrder' which is the order that has been created for the user will be returned.
        return timsOrder;
    }

    /**
     * This method is responsible for retrieving and returning the amount the user will owe given their purchases, or
     * renting of the hardware products. The method calculates the total amount of money the user will owe, and then
     * returns this value depending on whether they have rented, or purchased an item, which is dependent on the hardware
     * products rental cost, or retail price.
     *
     * @return amountDue, the amount the user will owe depending on the renting or purchasing of an hardware product.
     */
    public double getAmountDue() {
        // Declares and initializes a variable 'amountDue' to 0 as default. This variable will represent the amount of
        // money the user will owe.
        double amountDue = 0;

        // This for loop iterates through each element in the 'timsProduct' array.
        for (int i = 0; i < size; i++) {
            // Each element/object at index 'i' of the loop, is assigned to a variable 'productTims' of type TimsProduct
            // in order to eliminate the duplication of code.
            TimsProduct productTims = timsProduct[i];
            // The nested if statement checks if the element at index 'i' of the array 'productTims' is null, as if it
            // is, the user did not purchase as many items as they specified initially.
            if (productTims != null) {
                // This inner nested if statement checks if the variable 'productTims' which is the element at the
                // current index 'i' of the array, is an instance of RentableHardware, which means that the cost will be
                // based on the rental cost, and no the retail price.
                if (productTims instanceof RentableHardware) {
                    // If it is, the variable is casted to type RentableHardware, and is saved into a variable
                    // 'rentedProduct' of type RentableHardware.
                    RentableHardware rentedProduct = (RentableHardware) productTims;
                    // This if statement checks if this product is actually rented, so any returned products are not
                    // reflected in the final price.
                    if (rentedProduct.isRented()) {
                        // If the hardware product is rented, the amount the user owes is incremented by the price it
                        // costs to rent the hardware product.
                        amountDue = amountDue + rentedProduct.getRentalCost();
                    } else {
                        amountDue = amountDue + rentedProduct.getRetailPrice();
                    }
                // If the element at index 'i' of the array is not an instance of RentableHardware, meaning it cannot
                // be rented,this means the cost of the product is determined by the retail price, which is why the
                // amount the user now owes is incremented by the hardware product retail price.
                } else {
                    amountDue = amountDue + productTims.getRetailPrice();
                }
            }
        }
        // The amount the user owes is returned as 'amountDue'.
        return amountDue;
    }

    /**
     * This method is responsible for returning a string representation of a Tims Hardware store order. It will consist
     * of the customers name 'customerName', and each product in the customers order by iterating through the array
     * 'timsProduct', and for every element that isnt null, printing that hardware product, which will print the products
     * specific 'toString' method. The method first declares the local variable 'output' with the customers name, and
     * then for every product in the array, they are concatenated to the 'output' string, to then be returned.
     *
     * @return output, a string representation of the customers order.
     */
    @Override
    public String toString() {
        String output = "\n" + customerName + "'s order: ";
        for (int i = 0; i < timsProduct.length; i++) {
            if (timsProduct[i] != null) {
                output = output + timsProduct[i].toString() + "\n";
            }
        }
        return output;
    }
}
