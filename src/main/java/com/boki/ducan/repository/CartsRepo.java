package com.boki.ducan.repository;
import com.boki.ducan.model.Carts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartsRepo extends JpaRepository <Carts, Integer> {
    
}
