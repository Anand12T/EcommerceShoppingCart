public class Product {
    private int id;
    private String name;
    private String category;
    private String description; // Field for product description
    private double price;

    // Constructor
    public Product(int id, String name, String category, String description, double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.description = description; // Initialize description
        this.price = price;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description; // Getter for description
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Category: " + category +
               ", Description: " + description + // Include description in toString
               ", Price: $" + price;
    }
}
