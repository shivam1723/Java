
/**
 * Represents a single address.
 * 
 * This class encapsulates the information related to a single address, including the first name, last name, street address, city, country, and postal code.
 * 
 * <p>
 * The class provides getters and setters for each attribute, allowing access and modification of the address information.
 * 
 * The class also overrides the {@code toString()} method to provide a string representation of the address.
 * </p>
 */

public class SingleAddress {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String country;
    private String postalCode;

    /**
     * constructs a new {@code SingleAddress} with the specified attributes.
     * @param firstName the first name of the person
     * @param lastName the last name of the person
     * @param streetAddress the street address
     * @param city the city
     * @param country the country
     * @param postalCode the postal code 
     */

    public SingleAddress(String firstName, String lastName, String streetAddress, String city, String country, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + ", " + streetAddress + ", " + city + ", " + country + ", " + postalCode;
    }

}
