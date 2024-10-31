import java.util.HashMap;
import java.util.Scanner;


/**
 * The ProductManager class is responsible for managing a collection of products.
 * It allows adding, viewing, and searching for products within the collection.
 * 
 * Methods:
 * - ProductManager(): Constructor that initializes the product list.
 * - void addProduct(Product product): Adds a product to the collection. If the product ID already exists,
 *   it provides options to either replace the existing product or add stock to it.
 * - void viewAllProducts(): Displays all products in the collection. If no products are available, 
 *   it notifies the user.
 * - void searchProduct(String keyword): Searches for products that contain the specified keyword 
 *   in their string representation. If no products are found, it notifies the user.
 * - Product getProductById(int productId): Retrieves a product by its ID from the collection.
 * 
 * Fields:
 * - private HashMap<Integer, Product> productList: A collection that stores products with their IDs as keys.
 * - Scanner scanner: A Scanner object for reading user input.
 */

public class ProductManager {
    private HashMap<Integer, Product> productList;
    Scanner scanner=new Scanner(System.in);

    /**Constructor initializes the product list.*/
    public ProductManager() {
        productList = new HashMap<>();
    }
    
    /**Adds a product to the collection.*/
    public void addProduct(Product product) {
        if (productList.containsKey(product.getProductId())) {
            Product existingProduct = productList.get(product.getProductId());
            System.out.println("Product ID already exists: " + existingProduct);
            System.out.println("1. Replace Product");
            System.out.println("2. Add Stock");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: 
                    productList.put(product.getProductId(), product);
                    System.out.println("Product replaced successfully.");
                    break;
                case 2: 
                    existingProduct.updateStock(product.getStock());
                    System.out.println("Stock increased by " + product.getStock() + ".");
                    break;
                case 3:
                    System.out.println("Exiting....");
                    break;
                default:
                    System.out.println("Invalid option. No changes made.");
                    break;
            }
        } else {
            productList.put(product.getProductId(), product);
            System.out.println("Product added successfully.");
        }
    }

    /**Displays all products in the collection.*/
    public void viewAllProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products available.");
        } else {
            System.out.println("Available products:");
            for (Product product : productList.values()) {
                System.out.println(product);
            }
        }
    }

    /**Searches for products that contain the specified keyword in their string representation.*/
    public void searchProduct(String keyword) {
        boolean found = false;
        for (Product product : productList.values()) {
            if (product.toString().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found for: " + keyword);
        }
    }


    /**Retrieves a product by its ID from the collection.*/
    public Product getProductById(int productId) {
        return productList.get(productId);
    }

}
