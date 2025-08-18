package com.telusko.eshop.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity
public class Product {

    public Product() {
        //TODO Auto-generated constructor stub
    }
    @Id
    private int prodId;
    private String prodName;
    private int prodQut;
    private double prodPrice;

}
