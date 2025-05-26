import java.util.Vector;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price + ", Category: " + category;
    }
}

class OnlineShoppingManager {
    private Vector<Product> inventory;

    public OnlineShoppingManager() {
        inventory = new Vector<>();
    }

    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
        System.out.println("Product added: " + product);
    }

    public void removeProduct(String name) {
        boolean found = false;
        for (Product product : inventory) {
            if (product.name.equalsIgnoreCase(name)) {
                inventory.remove(product);
                System.out.println("Product removed: " + product);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found: " + name);
        }
    }

    public void displayProducts() {
        if (inventory.isEmpty()) {
            System.out.println("No products in inventory.");
        } else {
            System.out.println("Inventory:");
            for (Product product : inventory) {
                System.out.println(product);
            }
        }
    }
}

public class OnlineShoppingPlatform {
    public static void main(String[] args) {
        OnlineShoppingManager manager = new OnlineShoppingManager();

        manager.addProduct("Laptop", 800.50, "Electronics");
        manager.addProduct("Shirt", 25.99, "Clothing");
        manager.addProduct("Coffee Maker", 45.00, "Home Appliances");

        manager.displayProducts();
        manager.removeProduct("Shirt");
        manager.displayProducts();
        manager.removeProduct("Tablet");
    }
}
