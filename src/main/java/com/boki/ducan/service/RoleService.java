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
    
    public void saveRole(Role role){
        repo.save(role);
    }
    
    public void getRoleById (Integer id){
        repo.findById(id);
    }
    
    public void deleteRole(Integer id){
        repo.deleteById(id);
    }
}
