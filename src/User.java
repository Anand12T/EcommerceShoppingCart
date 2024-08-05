public class User {
    private String name; // Private field for the user's name
    private ShoppingCart cart; // Private field for the user's shopping cart

    // Constructor to initialize User with a name and create a new ShoppingCart
    public User(String name) {
        this.name = name; // Initialize the name field
        this.cart = new ShoppingCart(); // Create a new ShoppingCart for the user
    }

    // Getter method for the user's shopping cart
    public ShoppingCart getCart() {
        return cart;
    }

    // Getter method for the user's name (optional, if needed)
    public String getName() {
        return name;
    }
}
