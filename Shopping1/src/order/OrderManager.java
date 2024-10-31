package order;

import java.util.HashSet;
import java.util.Random;

/**
 * The OrderManager class is responsible for managing order IDs.
 * It ensures that each order ID is unique by using a HashSet to track generated IDs.
 * 
 * <p>This class provides the following functionality:</p>
 * <ul>
 *   <li>Generate unique 4-digit order IDs</li>
 * </ul>
 * 
 * <p>Usage example:</p>
 * <pre>
 * {@code
 * OrderManager orderManager = new OrderManager();
 * int uniqueOrderId = orderManager.generateUniqueOrderId();
 * }
 * </pre>
 * 
 * <p>Class members:</p>
 * <ul>
 *   <li>{@code private HashSet<Integer> orderIds} - A set to store unique order IDs.</li>
 *   <li>{@code private Random random} - A Random instance to generate random numbers.</li>
 * </ul>
 * 
 * <p>Methods:</p>
 * <ul>
 *   <li>{@code public OrderManager()} - Constructor to initialize the HashSet and Random instances.</li>
 *   <li>{@code public int generateUniqueOrderId()} - Generates a unique 4-digit order ID.</li>
 * </ul>
 */


public class OrderManager {
    private HashSet<Integer> orderIds;
    private Random random;

    /**
     * Constructs a new OrderManager with an empty set of order IDs.
     */
    public OrderManager() {
        orderIds = new HashSet<>();
        random = new Random();
    }

    /**
     * Generates a unique 4-digit order ID.
     * 
     * @return a unique order ID
     */
    public int generateUniqueOrderId() {
        int orderId;
        do {
            orderId = random.nextInt(10000); // Generate a 4-digit random ID
        } while (orderIds.contains(orderId)); // Ensure uniqueness
        orderIds.add(orderId);
        return orderId;
    }
}
