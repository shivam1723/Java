import java.util.Map;
import java.util.HashMap;

/**
 * 
 * This file contains the implementation of the AddressBook interface. It provides methods to add and remove addresses from the address book, as well as display all addresses in the book.
 * 
 * The AddressBookImpl class implements the AddressBook interface and uses a HashMap to store the addresses. Each address is stored with a unique key generated from the first name and last name of the address.
 * 
 * The class also defines two custom exceptions, AddressExistsException and AddressNotFoundException, which are thrown when adding or removing addresses.
 * 
 * @see AddressBook
 * @see SingleAddress
 * @see AddressExistsException
 * @see AddressNotFoundException
 */


class AddressExistsException extends Exception {
    public AddressExistsException(String message) {
        super(message);
    }
}

class AddressNotFoundException extends Exception {
    public AddressNotFoundException(String message) {
        super(message);
    }
}

/**
 * The AddressBook interface represents a collection of addresses.
 * It provides methods to add, remove, and display addresses.
 */
interface AddressBook{
    void addAddress(SingleAddress address) throws AddressExistsException;
    void removeAddress(String lName,String fName) throws AddressNotFoundException;
    void display();
}

/**
 * The AddressBookImpl class implements the AddressBook interface and represents an address book.
 * It provides methods to add and remove addresses, as well as display the addresses in the address book.
 */
public class AddressBookImpl implements AddressBook{

    // A map to store the addresses with the key as the first name and last name of the person and the value as the address object.
    private Map<String,SingleAddress> addressMap;

    /**
     * Constructs a new AddressBookImpl with an empty address map.
     */
    public AddressBookImpl(){
        this.addressMap = new HashMap<>();
    }

    /**
     * Generates a key for the address map using the first name and last name of the person.
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @return the key for the address map
     */
    private String generateKey(String firstName, String lastName) {
        return firstName.toLowerCase() + " " + lastName.toLowerCase();
    }

    /**
     * Adds an address to the address book.
     * @param address the address to add
     * @throws AddressExistsException if the address already exists in the address book
     */
    @Override
    public void addAddress(SingleAddress address) throws AddressExistsException {
        String key=generateKey(address.getFirstName(),address.getLastName());
        if(addressMap.containsKey(key)){
            throw new AddressExistsException("Address already exists for the name "+address.getFirstName()+" "+address.getLastName());
        }
        addressMap.put(key,address);  
    }

    /**
     * Removes an address from the address book.
     * @param lName the last name of the person
     * @param fName the first name of the person
     * @throws AddressNotFoundException if the address is not found in the address book
     */
    @Override
    public void removeAddress(String lName,String fName) throws AddressNotFoundException {
        String key=generateKey(lName,fName);
        if(!addressMap.containsKey(key)){
            throw new AddressNotFoundException("Address with the name " + fName + " " + lName + " not found.");
        }
        addressMap.remove(key);
        System.out.println("Address removed");
    }

    /**
     * Displays all addresses in the address book.
     */

    public void display(){
        if(addressMap.isEmpty()){
            System.out.println("Address book is empty");
            return;
        }
        // for(SingleAddress address:addressMap.values()){
        //     System.out.println(address.getFirstName() + " " + address.getLastName() + " " + address.getStreetAddress() + " " + address.getCity() + " " + address.getCountry() + " " + address.getPostalCode());
        // }
        System.out.println(this.toString());
    }

    public String toString(){
        if(addressMap.isEmpty()){
            return "Address book is empty";
        }

        String s=new String("");
        for(SingleAddress address:addressMap.values()){
            s+=address.getFirstName()+", "+address.getLastName()+", "+address.getStreetAddress()+", "+address.getCity()+", "+address.getCountry()+"\n";
        }

        return s;
    }

}
