package com.boki.ducan.repository;
import com.boki.ducan.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository <Product, Integer> {
    
}
