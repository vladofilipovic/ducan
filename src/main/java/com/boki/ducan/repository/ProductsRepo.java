package com.boki.ducan.repository;
import com.boki.ducan.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepo extends JpaRepository <Products, Integer> {
    
}
