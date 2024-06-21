package com.productmanagement.model;

import java.util.Date;

public class Product {
    private int productId;
    private String productName;
    private double price;
    private int quantityInHand;
    private String description;
    private Date orderDate;

    // Constructors, getters, and setters
    public Product(int productId, String productName, double price, int quantityInHand, String description, Date orderDate) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantityInHand = quantityInHand;
        this.description = description;
        this.orderDate = orderDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityInHand() {
        return quantityInHand;
    }

    public void setQuantityInHand(int quantityInHand) {
        this.quantityInHand = quantityInHand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", quantityInHand=" + quantityInHand + ", description=" + description + ", orderDate=" + orderDate + "]";
    }
}
