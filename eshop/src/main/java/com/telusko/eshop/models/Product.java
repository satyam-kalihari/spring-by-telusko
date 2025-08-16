package com.telusko.eshop.models;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Product {
    private int prodId;
    private String prodName;
    private int prodQut;
    private double prodPrice;

}
