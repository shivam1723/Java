package product;
/**
 * Represents a product with details such as product ID, name, price, category, and stock.
 */
public class Product {

    /**
     * The unique identifier for the product.
     */
    private int productId;

    /**
     * The name of the product.
     */
    private String productName;

    /**
     * The price of the product.
     */
    private double price;

    /**
     * The category to which the product belongs.
     */
    private String category;

    /**
     * The available stock of the product.
     */
    private int stock;

    /**
     * Constructs a new Product with the specified details.
     *
     * @param productId   the unique identifier for the product
     * @param productName the name of the product
     * @param price       the price of the product
     * @param category    the category to which the product belongs
     * @param stock       the available stock of the product
     */
    public Product(int productId, String productName, double price, String category, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public void updateStock(int quantity) {
        this.stock += quantity;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Name: " + productName +
                ", Price: Rs" + price +
                ", Category: " + category +
                ", Stock: " + stock;
    }
}
