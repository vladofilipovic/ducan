package com.boki.ducan.service;
import com.boki.ducan.model.Role;
import com.boki.ducan.repository.RoleRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {
    
    RoleRepo repo;
    
    @Autowired
    public RoleService(RoleRepo repo){
        this.repo = repo;
    }
    
     public List<Role> listAll() {
        return repo.findAll();
    }
    
    public void saveCart(Role role){
        repo.save(role);
    }
    
    public void getCartById (Integer id){
        repo.findById(id);
    }
    
    public void deleteCart(Integer id){
        repo.deleteById(id);
    }
}
