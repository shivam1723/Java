package login;

import customer.User;
import java.util.HashMap;

/**
 * The LoginManager class manages user signups and logins.
 * It maintains a list of users and an admin account.
 *
 * <p>Features:</p>
 * <ul>
 *   <li>Signup new users</li>
 *   <li>Login existing users</li>
 *   <li>Predefined admin and demo user accounts</li>
 * </ul>
 *
 * <p>Usage:</p>
 * <pre>
 * LoginManager loginManager = new LoginManager();
 * loginManager.signup("newUser", "newPassword");
 * User user = loginManager.login("newUser", "newPassword");
 * </pre>
 *
 * <p>Note: The admin account has a predefined username "admin" and password "admin123".</p>
 *
 * @author
 */


public class LoginManager {
    private HashMap<String, User> users;
    private User admin;

    /**
     * Constructor initializes the LoginManager and sets up the admin and demo users.
     */
    public LoginManager() {
        users = new HashMap<>();
        // Predefined admin account
        admin = new User("admin", "admin123", true);

        // Predefine two demo users
        users.put("user1", new User("user1", "pass1", false));
        users.put("user2", new User("user2", "pass2", false));
    }

    /**
     * Signup a new user with the given username and password.
     *
     * @param username the username of the new user
     * @param password the password of the new user
     * @return true if signup is successful, false otherwise
     */
    public boolean signup(String username, String password) {
        if (users.containsKey(username)) {
            System.out.println("Username already exists.");
            return false;
        }
        users.put(username, new User(username, password, false));
        System.out.println("Signup successful!");
        return true;
    }

    /**
     * Login a user with the given username and password.
     *
     * @param username the username of the user
     * @param password the password of the user
     * @return the User object if login is successful, null otherwise
     */

    public User login(String username, String password) {
        try {
            if (admin.getUsername().equals(username)) {
                if (admin.checkPassword(password)) {
                    System.out.println("Admin login successful!");
                    return admin;
                }
            }
            User user = users.get(username);
            if (user != null && user.checkPassword(password)) {
                System.out.println("Customer login successful!");
                return user;
            }
            System.out.println("Invalid username or password.");
        } catch (Exception e) {
            System.out.println("An error occurred during login: " + e.getMessage());
        }
        return null;
    }
}
