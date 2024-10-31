package customer;

import order.ShoppingCart;
import order.Order;
import order.OrderHistory;
import product.Product;

/**
 * The Customer class represents a customer in the shopping platform,
 * holding customer details, shopping cart, and order history.
 */
public class Customer {
    private int customerId; // Unique identifier for the customer
    private String username; // Username of the customer
    private String email;    // Email of the customer
    private ShoppingCart cart; // The customer's shopping cart
    private OrderHistory orderHistory; // The customer's order history


    /**
     * Constructor initializes a Customer with given details.
     *
     * @param customerId Unique identifier for the customer.
     * @param username   The username of the customer.
     * @param email      The email of the customer.
     */
    public Customer(int customerId, String username, String email) {
        this.customerId = customerId;
        this.username = username;
        this.email = email;
        this.cart = new ShoppingCart();
        this.orderHistory = new OrderHistory();
    }

    public String getUsername() {
        return username;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    /**
     * Adds a product to the customer's shopping cart.
     *
     * @param product  The product to be added to the cart.
     * @param quantity The quantity of the product to add.
     */
    public void addToCart(Product product, int quantity) {
        cart.addItem(product, quantity);
    }

    /**
     * Places an order for the items in the shopping cart.
     *
     * @param orderId       The unique identifier for the order.
     * @param shippingMethod The shipping method selected by the customer.
     */
    public void placeOrder(int orderId, String shippingMethod) {
        order.Order order = new order.Order(orderId, cart, shippingMethod);
        // Order order = new Order(orderId, cart, shippingMethod);
        order.placeOrder();
        orderHistory.addOrder(order);
    }

    /**
     * Displays the customer's order history.
     */
    public void viewOrderHistory() {
        orderHistory.viewOrderHistory();
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + ", Username: " + username + ", Email: " + email;
    }
}
