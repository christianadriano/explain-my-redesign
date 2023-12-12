import java.util.ArrayList;
import java.util.List;

// Product class representing a product
class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

// ShoppingCart class representing the user's shopping cart
class ShoppingCart {
    List<Product> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
    }

    public List<Product> getItems() {
        return items;
    }
}

// ProductCatalog class managing the product catalog
class ProductCatalog {
    List<Product> products;

    public ProductCatalog() {
        this.products = new ArrayList<>();
        // Populate the catalog with some products
        products.add(new Product("Laptop", 999.99));
        products.add(new Product("Smartphone", 499.99));
        products.add(new Product("Headphones", 79.99));
    }

    public List<Product> getProducts() {
        return products;
    }
}

// Order class representing an order
class Order {
    int orderId;
    List<Product> orderedItems;

    public Order(int orderId, List<Product> orderedItems) {
        this.orderId = orderId;
        this.orderedItems = orderedItems;
    }

    public int getOrderId() {
        return orderId;
    }

    public List<Product> getOrderedItems() {
        return orderedItems;
    }
}

// User class representing a user
class User {
    String username;

    public User(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

// Main class representing the e-commerce application
public class ECommerceApplication {
    public static void main(String[] args) {
        // Create instances of ShoppingCart, ProductCatalog, Order, and User
        ShoppingCart shoppingCart = new ShoppingCart();
        ProductCatalog productCatalog = new ProductCatalog();
        User user = new User("john_doe");

        // Simulate user adding products to the shopping cart
        shoppingCart.addItem(productCatalog.getProducts().get(0));
        shoppingCart.addItem(productCatalog.getProducts().get(2));

        // Simulate user placing an order
        Order order = new Order(12345, shoppingCart.getItems());

        // Display order information
        System.out.println("Order ID: " + order.getOrderId());
        System.out.println("Ordered Items:");
        for (Product item : order.getOrderedItems()) {
            System.out.println("  - " + item.name + ", Price: $" + item.price);
        }

        // Display user information
        System.out.println("User: " + user.getUsername());
    }
}
