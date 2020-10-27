package com.boki.ducan.repository;
import com.boki.ducan.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriesRepo extends JpaRepository <Categories, Integer> {
    
}
