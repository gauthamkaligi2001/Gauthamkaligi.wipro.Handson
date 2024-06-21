package com.productmanagement.app;

import com.productmanagement.exception.ProductNotFoundException;
import com.productmanagement.model.Product;
import com.productmanagement.service.IProductService;
import com.productmanagement.service.ProductService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Scanner;

public class ProductManagementApp {
    private static Scanner scanner = new Scanner(System.in);
    private static IProductService productService = new ProductService();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    public static void main(String[] args) {
        int choice;

        while (true) {
            System.out.println("1. Show All Products");
            System.out.println("2. Find Product By Id");
            System.out.println("3. Add Product");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        showAllProducts();
                        break;
                    case 2:
                        findProductById();
                        break;
                    case 3:
                        addProduct();
                        break;
                    case 4:
                        updateProduct();
                        break;
                    case 5:
                        deleteProduct();
                        break;
                    case 6:
                        System.exit(0);
                    default:
                        System.out.println("Invalid option, please try again");
                }
            } catch (ProductNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void showAllProducts() {
        Collection<Product> products = productService.getAll();
        for (Product product : products) {
            System.out.println(product);
        }
        System.out.println();
    }

    private static void findProductById() {
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Product product = productService.getById(productId);
        System.out.println(product);
        System.out.println();
    }

    private static void addProduct() {
        try {
            System.out.print("Enter Product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity In Hand: ");
            int quantityInHand = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Description: ");
            String description = scanner.nextLine();
            System.out.print("Enter Order Date (yyyy-MM-dd): ");
            String orderDateString = scanner.nextLine();
            Date orderDate = dateFormat.parse(orderDateString);

            String result = productService.addProduct(productId, productName, price, quantityInHand, description, orderDate);
            System.out.println(result);
            System.out.println();
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }

    private static void updateProduct() {
        try {
            System.out.print("Enter Product ID: ");
            int productId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Quantity In Hand: ");
            int quantityInHand = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Description: ");
            String description = scanner.nextLine();
            System.out.print("Enter Order Date (yyyy-MM-dd): ");
            String orderDateString = scanner.nextLine();
            Date orderDate = dateFormat.parse(orderDateString);

            String result = productService.updateProduct(productId, productName, price, quantityInHand, description, orderDate);
            System.out.println(result);
            System.out.println();
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID: ");
        int productId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String result = productService.deleteProduct(productId);
        System.out.println(result);
        System.out.println();
    }
}
