package order;

import java.util.Date;
/**
 * The Order class represents a customer's order in the shopping system.
 * It contains details about the order such as the order ID, shopping cart,
 * order date, shipping method, and status.
 * 
 * <p>This class provides methods to place an order, track the order status,
 * and update the order status.</p>
 * 
 * @author 
 */

public class Order {
    private int orderId;
    private ShoppingCart cart;
    private Date orderDate;
    private String shippingMethod;
    private String status;

    /**Constructor initializes an order with the given details.*/
    public Order(int orderId, ShoppingCart cart, String shippingMethod) {
        this.orderId = orderId;
        this.cart = cart;
        this.orderDate = new Date();
        this.shippingMethod = shippingMethod;
        this.status = "Processing";
    }

    /**Places the order and displays a success message.*/
    public void placeOrder() {
        System.out.println("Order placed successfully! Order ID: " + orderId);
    }

    /**Tracks the current status of the order.*/
    public void trackOrder() {
        System.out.println("Order " + orderId + " is currently " + status);
    }

    /**Updates the status of the order.*/
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    /**Returns a string representation of the order.*/
    @Override
    public String toString() {
        return "Order ID: " + orderId + 
                ", Date: " + orderDate + 
                ", Status: " + status + 
                ", Shipping Method: " + shippingMethod + 
                "\nCart Details: \n" + cart;
    }
}
