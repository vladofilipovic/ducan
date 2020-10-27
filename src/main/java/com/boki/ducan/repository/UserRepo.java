package com.boki.ducan.repository;
import com.boki.ducan.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Integer> {
    
}
