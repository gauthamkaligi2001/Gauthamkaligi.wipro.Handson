package com.productmanagement.repository;

import com.productmanagement.exception.ProductNotFoundException;
import com.productmanagement.model.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> productDb = new HashMap<>();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    static {
        try {
            productDb.put(1, new Product(1, "Laptop", 1200.50, 10, "High-end gaming laptop", dateFormat.parse("2023-05-01")));
            productDb.put(2, new Product(2, "Smartphone", 800.99, 25, "Latest model smartphone", dateFormat.parse("2023-06-15")));
            productDb.put(3, new Product(3, "Headphones", 150.00, 50, "Noise-cancelling headphones", dateFormat.parse("2023-04-20")));
            productDb.put(4, new Product(4, "Monitor", 300.75, 20, "4K Ultra HD monitor", dateFormat.parse("2023-07-05")));
            productDb.put(5, new Product(5, "Keyboard", 99.99, 30, "Mechanical keyboard", dateFormat.parse("2023-03-10")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Collection<Product> getAll() {
        return productDb.values();
    }

    @Override
    public Product getById(int id) {
        Product product = productDb.get(id);
        if (product == null) {
            throw new ProductNotFoundException("Product with id " + id + " does not exist");
        }
        return product;
    }

    @Override
    public String addProduct(Product product) {
        productDb.put(product.getProductId(), product);
        return "Product with Id " + product.getProductId() + " added successfully";
    }

    @Override
    public String updateProduct(Product product) {
        if (!productDb.containsKey(product.getProductId())) {
            throw new ProductNotFoundException("Product with id " + product.getProductId() + " does not exist");
        }
        productDb.put(product.getProductId(), product);
        return "Product with Id " + product.getProductId() + " updated successfully";
    }

    @Override
    public String deleteProduct(int id) {
        if (!productDb.containsKey(id)) {
            throw new ProductNotFoundException("Product with id " + id + " does not exist");
        }
        productDb.remove(id);
        return "Product with Id " + id + " deleted successfully";
    }
}
