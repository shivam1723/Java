package customer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * The CustomerManager class is responsible for managing customer data and operations.
 * It maintains a collection of customers and ensures unique customer IDs.
 * 
 * <p>Features:</p>
 * <ul>
 *   <li>Add a new customer with a unique ID</li>
 *   <li>Retrieve customer details by username</li>
 *   <li>View all customers and their cart details</li>
 * </ul>
 * 
 * <p>Usage:</p>
 * <pre>
 * CustomerManager manager = new CustomerManager();
 * Customer customer = manager.addCustomer("username", "email@example.com");
 * Customer retrievedCustomer = manager.getCustomer("username");
 * manager.viewAllCustomers();
 * </pre>
 * 
 * <p>Dependencies:</p>
 * <ul>
 *   <li>Customer class</li>
 *   <li>Cart class (used within Customer)</li>
 * </ul>
 * 
 * <p>Note:</p>
 * This class uses a HashMap to store customers by their username and a HashSet to ensure unique customer IDs.
 * 
 * @see Customer
 * @see Cart
 */


public class CustomerManager {
    private HashMap<String, Customer> customers;
    private HashSet<Integer> customerIds; 
    private Random random;

    /**
     * Constructs a new CustomerManager with an empty collection of customers.
     */
    public CustomerManager() {
        customers = new HashMap<>();
        customerIds = new HashSet<>();
        random = new Random();
    }

    /**
     * Adds a new customer with the given username and email.
     * 
     * @param username the username of the customer
     * @param email    the email of the customer
     * @return the newly created Customer object
     */

    public Customer addCustomer(String username, String email) {
        int customerId = generateUniqueCustomerId();
        Customer customer = new Customer(customerId, username, email);
        customers.put(username, customer);
        return customer;
    }

    /**
     * Retrieves the customer details by username.
     * 
     * @param username the username of the customer
     * @return the Customer object if found, null otherwise
     */

    public Customer getCustomer(String username) {
        return customers.get(username);
    }

    /**
     * Displays details of all customers and their cart contents.
     */

    public void viewAllCustomers() {
        if (customers.isEmpty()) {
            System.out.println("No customers found.");
        } else {
            for (Customer customer : customers.values()) {
                System.out.println(customer);
                customer.getCart().viewCart();
                System.out.println("Total Cart Price: Rs" + customer.getCart().calculateTotal());
            }
        }
    }

    /**
     * Generates a unique customer ID that is not already in use.
     * 
     * @return a unique customer ID
     */

    private int generateUniqueCustomerId() {
        int id;
        do {
            id = random.nextInt(10000); 
        } while (customerIds.contains(id)); 
        customerIds.add(id);
        return id;
    }
}
