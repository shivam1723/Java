import java.util.Scanner;

/**
     * The {@code TestAddressBook} class represents a test class for the {@code AddressBookImpl} class.
     * <p>
     * This class represents a test class for the AddressBookImpl class. It provides a main method to interact with the AddressBookImpl object and perform various operations on the address book.
     * The main method displays a menu with options
     * <ul>
     *  <li>to add an address</li>
     *  <li>delete an address</li> 
     *  <li>display all addresses</li>
     *  <li>Exit the program.</li>
     * </ul>
     * The menu continues to be displayed until the user chooses to exit the program.
     * </p>
     * 
     * @author Shivam Pandey
     * @since 1.0
     */

public class TestAddressBook {

    /**
     * The entry point of the program.
     * <p>
     * This method creates an instance of the AddressBookImpl class and a Scanner object to read user input.
     * It then displays a menu with options to add an address, delete an address, display all addresses, or exit the program.
     * The user can choose an option by entering the corresponding number. The program will then perform the selected operation.
     * The program will continue to display the menu and prompt the user for input until the user chooses to exit.
     * </p>
     * @param args The command-line arguments passed to the program.
     */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBookImpl addressBook = new AddressBookImpl();

        while (true) {
            System.out.println("Menu:");
            System.out.println("Add address");
            System.out.println("Delete address");
            System.out.println("Display");
            System.out.println("Exit");

            String choice = scanner.nextLine().toLowerCase().trim();
            scanner.nextLine();  // consume the newline

            switch (choice) {
                case "add address":
                    try {
                        System.out.print("Enter first name: ");
                        String firstName = scanner.nextLine();
                        System.out.print("Enter last name: ");
                        String lastName = scanner.nextLine();
                        System.out.print("Enter street address: ");
                        String streetAddress = scanner.nextLine();
                        System.out.print("Enter city: ");
                        String city = scanner.nextLine();
                        System.out.print("Enter country: ");
                        String country = scanner.nextLine();
                        System.out.print("Enter postal code: ");
                        String postalCode = scanner.nextLine();

                        SingleAddress address = new SingleAddress(firstName, lastName, streetAddress, city, country, postalCode);
                        addressBook.addAddress(address);
                    } catch (AddressExistsException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "delete address":
                    try {
                        System.out.print("Enter first name: ");
                        String firstName = scanner.nextLine();
                        System.out.print("Enter last name: ");
                        String lastName = scanner.nextLine();
                        addressBook.removeAddress(firstName, lastName);
                    } catch (AddressNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "display":
                    addressBook.display();
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

