import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Product {
    int productNo;
    String productName;
    double productPrice;
    int quantity;
    double discount;

    public Product(int productNo, String productName, double productPrice, int quantity, double discount) {
        this.productNo = productNo;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.discount = discount;
    }
}

class Customer {
    int customerId;
    String customerName;
    double walletBalance;
    List<Product> cart;

    public Customer(int customerId, String customerName, double walletBalance) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.walletBalance = walletBalance;
        this.cart = new ArrayList<>();
    }

    public void addToCart(Product product, int quantity) {
        cart.add(product);
    }

    // Other methods for displaying cart, calculating bill, paying bill, etc.
}

class Administrator {
    Map<Integer, Product> productList;
    Map<Integer, Customer> customerList;

    public Administrator() {
        this.productList = new HashMap<>();
        this.customerList = new HashMap<>();
    }

    public void addProduct(int productNo, String productName, double productPrice, int quantity, double discount) {
        Product product = new Product(productNo, productName, productPrice, quantity, discount);
        productList.put(productNo, product);
    }

    public void readProductList() {
        for (Product product : productList.values()) {
            System.out.println("Product: " + product.productName + " Price: " + product.productPrice);
        }
    }

    public void addCustomerAccount(int customerId, String customerName, double walletBalance) {
        Customer customer = new Customer(customerId, customerName, walletBalance);
        customerList.put(customerId, customer);
    }

    // Other methods for removing customer account, etc.
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Administrator admin = new Administrator();
        admin.addProduct(1, "Product A", 100.0, 10, 0.1);
        admin.addProduct(2, "Product B", 200.0, 15, 0.05);

        admin.addCustomerAccount(1, "Customer X", 500.0);
        admin.addCustomerAccount(2, "Customer Y", 1000.0);

        System.out.println("Welcome to Online Shopping System!");
        System.out.println("1. Login as Administrator");
        System.out.println("2. Login as Customer");
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Administrator logic
        } else if (choice == 2) {
            // Customer logic
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
