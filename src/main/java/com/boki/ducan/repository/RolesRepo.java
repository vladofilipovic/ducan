package com.boki.ducan.repository;
import com.boki.ducan.model.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolesRepo extends JpaRepository <Roles, Integer> {
    
}
