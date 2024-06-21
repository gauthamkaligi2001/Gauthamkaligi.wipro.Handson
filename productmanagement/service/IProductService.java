package com.productmanagement.service;

import com.productmanagement.exception.ProductNotFoundException;
import com.productmanagement.model.Product;

import java.util.Collection;
import java.util.Date;

public interface IProductService {
    Collection<Product> getAll();
    Product getById(int id) throws ProductNotFoundException;
    String addProduct(int productId, String productName, double price, int quantityInHand, String description, Date orderDate);
    String updateProduct(int productId, String productName, double price, int quantityInHand, String description, Date orderDate);
    String deleteProduct(int id) throws ProductNotFoundException;
}
