# Java-Store-Rental-Program

For this assignment I have created a software model for products available at 'Tim’s Hardware Store' using polymorphism, abstract classes, and interfaces. I have implemented each class based ona UML, which has shown the relationships between different types of products, some of which are rentable. Each product is a type of TimsProduct and a Commodity.

In addition to the basic UML provided as an outline, I have added one rentable product and one non-rentable product. For rentable products, methods to manage rental status (rent, isRented, and return) have been implemented within an abstract class called RentableHardware.

The classes have private constructors, and instead of using these directly, I have implemented static create methods to interact with the user, gather necessary product details, and then create instances of the products. This pattern aligns with the Factory Design Pattern.

The TimsOrder class represents a customer’s order, containing an array of TimsProduct objects. Its create method interacts with the user to capture the customer’s name and the products they want to order. The getAmountDue method calculates the total price of the order by summing the retail or rental prices of the products.

For testing, a provided TestClass initiates a dialog with the user to create a TimsOrder object, then prints the order details and the total price.

The assignment emphasizes using design principles such as encapsulation, inheritance, and polymorphism, along with good coding practices like error handling and method stubs. The goal is to develop a comprehensive and interactive model while adhering to the specified UML diagram and design patterns.
