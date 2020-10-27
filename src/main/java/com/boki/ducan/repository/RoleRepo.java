package com.boki.ducan.repository;
import com.boki.ducan.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository <Role, Integer> {
    
}
