package order;

import java.util.ArrayList;

/**
 * The OrderHistory class manages a list of orders.
 * It provides methods to add orders and view the order history.
 */

public class OrderHistory {
    private ArrayList<Order> orders;

    /**Constructor initializes an empty list of orders.*/
    public OrderHistory() {
        orders = new ArrayList<>();
    }

    /**Adds an order to the order history.*/
    public void addOrder(Order order) {
        orders.add(order);
    }

    /**Displays the order history.*/
    public void viewOrderHistory() {
        if (orders.isEmpty()) {
            System.out.println("No orders found.");
        } else {
            for (Order order : orders) {
                System.out.println(order);
            }
        }
    }

    /**Returns a string representation of the order history.*/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (orders.isEmpty()) {
            sb.append("No orders.");
        } else {
            for (Order order : orders) {
                sb.append(order.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
