package com.productmanagement.service;

import com.productmanagement.exception.ProductNotFoundException;
import com.productmanagement.model.Product;
import com.productmanagement.repository.IProductRepository;
import com.productmanagement.repository.ProductRepository;

import java.util.Collection;
import java.util.Date;

public class ProductService implements IProductService {
    private IProductRepository productRepository = new ProductRepository();

    @Override
    public Collection<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public Product getById(int id) throws ProductNotFoundException {
        return productRepository.getById(id);
    }

    @Override
    public String addProduct(int productId, String productName, double price, int quantityInHand, String description, Date orderDate) {
        Product product = new Product(productId, productName, price, quantityInHand, description, orderDate);
        return productRepository.addProduct(product);
    }

    @Override
    public String updateProduct(int productId, String productName, double price, int quantityInHand, String description, Date orderDate) {
        Product product = new Product(productId, productName, price, quantityInHand, description, orderDate);
        return productRepository.updateProduct(product);
    }

    @Override
    public String deleteProduct(int id) throws ProductNotFoundException {
        return productRepository.deleteProduct(id);
    }
}
