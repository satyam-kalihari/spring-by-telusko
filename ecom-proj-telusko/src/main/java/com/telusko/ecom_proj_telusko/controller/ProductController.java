package com.telusko.ecom_proj_telusko.controller;

import java.util.List;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.ecom_proj_telusko.model.Product;
import com.telusko.ecom_proj_telusko.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

    private ProductService service;
    public ProductController(ProductService service){
        this.service = service;
    }

    @RequestMapping("/products")
    private List<Product> getProducts(){
        return service.getAllProducts();
    }
}
