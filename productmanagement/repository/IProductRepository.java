package com.productmanagement.repository;

import com.productmanagement.model.Product;
import java.util.Collection;

public interface IProductRepository {
    Collection<Product> getAll();
    Product getById(int id);
    String addProduct(Product product);
    String updateProduct(Product product);
    String deleteProduct(int id);
}
