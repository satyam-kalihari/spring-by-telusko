package com.telusko.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telusko.eshop.models.Product;
import com.telusko.eshop.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    // List<Product> products = new ArrayList<Product>(Arrays.asList(
    //     new Product(101, "Laptop", 10, 1200.00),
    //     new Product(102, "Mouse", 50, 25.00),
    //     new Product(103, "Keyboard", 30, 75.00),
    //     new Product(104, "Monitor", 15, 300.00))
    // );

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        
        // return products.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
        return repo.findById(prodId).orElse(new Product());
    }

    public boolean addProduct(Product product) {
    //    try {
    //     products.add(product);
    //     return true;
    //    } catch (Exception e) {
    //     return false;
    //    }
    return repo.save(product) != null;
    }

    // private int getIndex(int prodId){
    //     int index = -1;
    //     for (int i = 0; i < products.size(); i++) {
    //         if (products.get(i).getProdId() == prodId) {
    //             index = i;
    //             break;
    //         }
    //     }
    //     return index;
    // }

    public String updateProduct(int prodId, Product product) {
        
        // int index = getIndex(prodId);
        // if (index == -1) {
        //     return "Product not found";
        // }
        // products.set(index, product);
        repo.save(product);
        return "Product updated successfully";
    }

    public String deleteProduct(int prodId){
        // int index = getIndex(prodId);
        // if(index == -1){
        //     return "Product not found";
        // }
        // products.remove(index);

        repo.deleteById(prodId);
        return "Product deleted successfully";
    }
}
