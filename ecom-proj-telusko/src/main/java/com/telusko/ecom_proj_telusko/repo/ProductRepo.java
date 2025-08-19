package com.telusko.ecom_proj_telusko.repo;

import com.telusko.ecom_proj_telusko.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
