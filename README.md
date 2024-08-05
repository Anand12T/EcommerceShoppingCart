# E-commerce Shopping Cart

## Project ID
#CC5266

## Project Title
E-commerce Shopping Cart

## Internship Domain
Java Development Intern

## Project Level
Entry Level

## Assigned By
CodeClause Internship

## Assigned To
Anand Tripathi

## Start Date
01 Aug 2024

## End Date
31 Aug 2024

## Aim
Develop a simple e-commerce system with product listings, a shopping cart, and checkout functionality.

## Description
Build a console-based shopping cart application where users can browse products, add them to a cart, and complete a purchase.

## Technologies
Java, OOP. Other technologies may be used as necessary.

## What You Learn
OOP concepts, shopping cart implementation.

## Project Setup
1. **Install JDK**: Ensure you have JDK installed.
2. **Choose an IDE**: Use IntelliJ IDEA, Eclipse, or NetBeans.
3. **Clone the Repository**: `git clone <repository-url>`
4. **Navigate to Project Directory**: `cd EcommerceShoppingCart`
5. **Compile the Project**: Use your IDE or run `javac src/*.java`.
6. **Run the Application**: Use your IDE or run `java src/Main`.

## Features
- Browse products.
- Add products to the shopping cart.
- View the shopping cart.
- Checkout and complete the purchase.

## Future Enhancements
- User authentication.
- Detailed product descriptions and categories.
- Advanced checkout process.

## Usage
1. Run the `Main` class.
2. Follow the on-screen instructions to browse products, add to cart, and checkout.

## Example
```sh
$ java src/Main
1. Browse Products by Category
2. View Cart
3. Checkout
4. Exit
Enter your choice: 1
Categories:
1. Electronics
2. Accessories
3. Clothing
4. Books
5. Groceries
Enter the category number: 1
Available Products:
ID: 1, Name: Laptop, Category: Electronics, Description: High-performance laptop, Price: $749.99
ID: 2, Name: Phone, Category: Electronics, Description: Latest smartphone, Price: $499.99
ID: 3, Name: Tablet, Category: Electronics, Description: Multifunctional tablet, Price: $299.99
ID: 4, Name: Smart TV, Category: Electronics, Description: 4K UHD Smart TV, Price: $549.99
ID: 5, Name: Camera, Category: Electronics, Description: Digital SLR camera, Price: $649.99
Enter product ID to add to cart or '0' to go back: 1
Laptop added to cart.
1. Add more products from the same category
2. Choose another category
3. Go to main menu
4. Checkout
Enter your choice: 1
Available Products:
ID: 1, Name: Laptop, Category: Electronics, Description: High-performance laptop, Price: $749.99
ID: 2, Name: Phone, Category: Electronics, Description: Latest smartphone, Price: $499.99
ID: 3, Name: Tablet, Category: Electronics, Description: Multifunctional tablet, Price: $299.99
ID: 4, Name: Smart TV, Category: Electronics, Description: 4K UHD Smart TV, Price: $549.99
ID: 5, Name: Camera, Category: Electronics, Description: Digital SLR camera, Price: $649.99
Enter product ID to add to cart or '0' to go back: 2
Phone added to cart.
1. Add more products from the same category
2. Choose another category
3. Go to main menu
4. Checkout
Enter your choice: 4
Processing order...
--------------------------------------------------
ID: 1, Name: Laptop, Category: Electronics, Description: High-performance laptop, Price: $749.99
ID: 2, Name: Phone, Category: Electronics, Description: Latest smartphone, Price: $499.99
--------------------------------------------------
Total: $1249.98
Your order has been successfully placed.
Thank you for your purchase!
