import java.util.List;

public class Order {
    private User user;

    public Order(User user) {
        this.user = user;
    }

    public void checkout() {
        ShoppingCart cart = user.getCart();
        List<Product> products = cart.getProducts();
        double total = 0;
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Processing order.....");
        System.out.println("------------------------------------------------------------------------");
        for (Product product : products) {
            System.out.println(String.format("ID: %d, Name: %s, Category: %s, Description: %s, Price: $%.2f", 
                                             product.getId(), product.getName(), product.getCategory(), 
                                             product.getDescription(), product.getPrice()));
            total += product.getPrice();
        }
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Your order has been successfully placed.");
        System.out.println(String.format("Total: $%.2f", total));
         System.out.println("------------------------------------------------------------------------");
        System.out.println("                   !!!     Thank you for your purchase     !!!");
         System.out.println("------------------------------------------------------------------------");
    }
}
