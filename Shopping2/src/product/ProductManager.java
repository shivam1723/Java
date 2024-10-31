package product;

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
            System.out.println("2. Add More Stock");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    replaceProduct(existingProduct.getProductId());
                    break;
                case 2:
                    addStockToProduct(existingProduct);
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
    /**
     * Replaces the details of an existing product.
     *
     * @param productId The ID of the product to be replaced.
     */
    private void replaceProduct(int productId) {
        System.out.print("Enter new Product Name: ");
        String newName = scanner.nextLine();
        System.out.print("Enter new Product Category: ");
        String newCategory = scanner.nextLine();
        System.out.print("Enter new Product Price: ");
        double newPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter new Product Stock: ");
        int newStock = scanner.nextInt();
        scanner.nextLine();

        Product newProduct = new Product(productId, newName, newPrice, newCategory, newStock);
        productList.put(productId, newProduct);
        System.out.println("Product replaced successfully.");
    }

    /**
     * Adds more stock to an existing product.
     *
     * @param existingProduct The product to which more stock is to be added.
     */
    private void addStockToProduct(Product existingProduct) {
        System.out.print("Enter additional stock quantity: ");
        int additionalStock = scanner.nextInt();
        scanner.nextLine();

        existingProduct.updateStock(additionalStock);
        System.out.println("Stock updated successfully. New stock: " + existingProduct.getStock());
    }

    /**Display all products */
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
