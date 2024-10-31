package customer;
/**
 * The User class represents a user in the system with a username, password, and admin status.
 * It provides methods to retrieve the username, check the password, and determine if the user is an admin.
 */
public class User {
    private String username;
    private String password;
    private boolean isAdmin;

    /**Constructor initializes a User with the given details.*/
    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    /**Returns the username of the user.*/
    public String getUsername() {
        return username;
    }

    /**Checks if the given password matches the user's password.*/
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    /**Checks if the user is an admin.*/
    public boolean isAdmin() {
        return isAdmin;
    }

    /**Returns a string representation of the user.*/
    @Override
    public String toString() {
        return "Username: " + username + ", Admin: " + isAdmin;
    }
}
