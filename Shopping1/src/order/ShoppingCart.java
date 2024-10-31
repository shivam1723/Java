package order;

import product.Product;
import java.util.HashMap;
import java.util.Map;

/**
 * The ShoppingCart class represents a shopping cart that holds products and their quantities.
 * It provides methods to add items to the cart, view the cart contents, and calculate the total cost.
 */

public class ShoppingCart {
    private Map<Product, Integer> cartItems;

    /**Constructor initializes the shopping cart.*/
    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    /**Adds a product to the cart with the specified quantity.*/
    public void addItem(Product product, int quantity) {
        if (product.getStock() >= quantity) {
            cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
            System.out.println("Product added to Cart");
            product.updateStock(-quantity);
        } else {
            System.out.println("Insufficient stock for product: " + product.getProductId());
        }
    }

    /**Displays the contents of the cart.*/
    public void viewCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Cart contents:");
            for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
                System.out.println(entry.getKey() + ", Quantity: " + entry.getValue());
            }
        }
    }

    /**Calculates the total cost of all items in the cart.*/
    public double calculateTotal() {
        double total = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            total += entry.getKey().getPrice() * entry.getValue();
        }
        return total;
    }
}
