package com.boki.ducan.repository;
import com.boki.ducan.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository <Cart, Integer> {
    
}
