package com.boki.ducan.repository;
import com.boki.ducan.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository <Users, Integer> {
    
}
