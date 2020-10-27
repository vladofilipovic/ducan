package com.boki.ducan.repository;
import com.boki.ducan.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository <Category, Integer> {
    
}
