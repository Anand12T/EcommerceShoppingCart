import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public String displayCart() {
        if (products.isEmpty()) {
            return "Cart is empty.";
        }
        StringBuilder sb = new StringBuilder();
        double total = 0;
        for (Product product : products) {
            sb.append(product).append("\n");
            total += product.getPrice();
        }
        sb.append("Total: $").append(total);
        return sb.toString();
    }
}
