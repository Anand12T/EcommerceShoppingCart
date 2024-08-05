import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User("Anand Tripathi");
        ShoppingCart cart = user.getCart();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Define products for each category
        Product[] electronics = {
            new Product(1, "Laptop", "Electronics", "High-performance laptop", 749.99),
            new Product(2, "Phone", "Electronics", "Latest smartphone", 499.99),
            new Product(3, "Tablet", "Electronics", "Multifunctional tablet", 299.99),
            new Product(4, "Smart TV", "Electronics", "4K UHD Smart TV", 549.99),
            new Product(5, "Camera", "Electronics", "Digital SLR camera", 649.99)
        };

        Product[] accessories = {
            new Product(6, "Headphones", "Accessories", "Noise-cancelling headphones", 29.99),
            new Product(7, "Smartwatch", "Accessories", "Fitness smartwatch with GPS", 49.99),
            new Product(8, "Mouse", "Accessories", "Wireless mouse", 9.99),
            new Product(9, "Keyboard", "Accessories", "Mechanical keyboard", 24.99),
            new Product(10, "Charger", "Accessories", "Fast charging adapter", 6.99)
        };

        Product[] clothing = {
            new Product(11, "T-shirt", "Clothing", "100% cotton t-shirt", 4.99),
            new Product(12, "Jeans", "Clothing", "Denim jeans, size 32", 14.99),
            new Product(13, "Jacket", "Clothing", "Leather jacket", 29.99),
            new Product(14, "Sneakers", "Clothing", "Comfortable sneakers", 19.99),
            new Product(15, "Cap", "Clothing", "Stylish baseball cap", 3.99)
        };

        Product[] books = {
            new Product(16, "Novel", "Books", "Fiction novel", 3.99),
            new Product(17, "Biography", "Books", "Inspiring biography", 4.99),
            new Product(18, "Science", "Books", "Science textbook", 9.99),
            new Product(19, "History", "Books", "History book", 6.99),
            new Product(20, "Comics", "Books", "Graphic novel", 2.99)
        };

        Product[] groceries = {
            new Product(21, "Rice", "Groceries", "Basmati rice, 1kg", 0.99),
            new Product(22, "Oil", "Groceries", "Cooking oil, 1L", 1.49),
            new Product(23, "Pasta", "Groceries", "Whole wheat pasta", 0.79),
            new Product(24, "Spices", "Groceries", "Mixed spices pack", 0.59),
            new Product(25, "Tea", "Groceries", "Green tea, 100g", 1.99)
        };

        Product[] selectedCategory = null;

        while (running) {
            try {
                // Display the main menu
                System.out.println("1. Browse Products by Category");
                System.out.println("2. View Cart");
                System.out.println("3. Checkout");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");
                
                // Read user input
                int choice = scanner.nextInt();  // Read integer input
                
                // Clear the buffer
                scanner.nextLine();  // Consume the leftover newline character

                switch (choice) {
                    case 1:
                        boolean browsingCategory = true;
                        while (browsingCategory) {
                            if (selectedCategory == null) {
                                // Display category menu
                                System.out.println("Categories:");
                                System.out.println("1. Electronics");
                                System.out.println("2. Accessories");
                                System.out.println("3. Clothing");
                                System.out.println("4. Books");
                                System.out.println("5. Groceries");
                                System.out.print("Enter the category number: ");
                                int categoryChoice = scanner.nextInt();
                                scanner.nextLine();  // Consume the newline

                                switch (categoryChoice) {
                                    case 1:
                                        selectedCategory = electronics;
                                        break;
                                    case 2:
                                        selectedCategory = accessories;
                                        break;
                                    case 3:
                                        selectedCategory = clothing;
                                        break;
                                    case 4:
                                        selectedCategory = books;
                                        break;
                                    case 5:
                                        selectedCategory = groceries;
                                        break;
                                    default:
                                        System.out.println("Invalid category choice.");
                                        continue;
                                }
                            }

                            // Display products in the selected category
                            System.out.println("Available Products:");
                            for (Product product : selectedCategory) {
                                System.out.println(product);
                            }
                            System.out.print("Enter product ID to add to cart or '0' to go back: ");
                            int productId = scanner.nextInt();  // Read product ID
                            scanner.nextLine();  // Consume the newline

                            if (productId == 0) {
                                selectedCategory = null;
                                browsingCategory = false;
                                continue;
                            }

                            boolean found = false;
                            for (Product product : selectedCategory) {
                                if (product.getId() == productId) {
                                    cart.addProduct(product);
                                    System.out.println(product.getName() + " added to cart.");
                                    found = true;
                                    break;
                                }
                            }
                            if (!found) {
                                System.out.println("Product not found.");
                            }

                            System.out.println("1. Add more products from the same category");
                            System.out.println("2. Choose another category");
                            System.out.println("3. Go to main menu");
                            System.out.println("4. Checkout");
                            System.out.print("Enter your choice: ");
                            int postAddChoice = scanner.nextInt();
                            scanner.nextLine();  // Consume the newline

                            switch (postAddChoice) {
                                case 1:
                                    // Directly show the products of the same category
                                    break;  // Continue browsing the same category
                                case 2:
                                    selectedCategory = null;
                                    browsingCategory = true;  // Set to true to allow choosing another category
                                    break;
                                case 3:
                                    selectedCategory = null;
                                    browsingCategory = false;  // Exit the category browsing loop
                                    break;
                                case 4:
                                    Order order = new Order(user);
                                    order.checkout();
                                    browsingCategory = false;  // Exit the category browsing loop
                                    running = false;  // Exit the main loop after checkout
                                    break;
                                default:
                                    System.out.println("Invalid choice. Returning to main menu.");
                                    selectedCategory = null;
                                    browsingCategory = false;
                            }
                        }
                        break;

                    case 2:
                        // View cart
                        System.out.println(cart.displayCart());
                        break;

                    case 3:
                        // Checkout
                        Order order = new Order(user);
                        order.checkout();
                        running = false;  // Exit the main loop after checkout
                        break;

                    case 4:
                        // Exit
                        running = false;
                        System.out.println("Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();  // Consume the invalid input
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
