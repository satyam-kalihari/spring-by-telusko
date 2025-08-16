package com.telusko.eshop.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import com.telusko.eshop.models.Product;

@Service
public class ProductService {

    List<Product> products = new ArrayList<Product>(Arrays.asList(
        new Product(101, "Laptop", 10, 1200.00),
        new Product(102, "Mouse", 50, 25.00),
        new Product(103, "Keyboard", 30, 75.00),
        new Product(104, "Monitor", 15, 300.00))
    );

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        
        return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
    }

    public boolean addProduct(Product product) {
       try {
        products.add(product);
        return true;
       } catch (Exception e) {
        return false;
       }
    }
}
