package com.telusko.eshop.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.telusko.eshop.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
