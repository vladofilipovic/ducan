package com.boki.ducan.service;
import com.boki.ducan.model.User;
import com.boki.ducan.repository.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    UserRepo repo;
    
    @Autowired
    public UserService(UserRepo repo){
        this.repo = repo;
    }
    
      public List<User> listAll() {
        return repo.findAll();
    }
    
    public void saveUser(User user){
        repo.save(user);
    }
    
    public void getUserById (Integer id){
        repo.findById(id);
    }
    
    public void deleteUser(Integer id){
        repo.deleteById(id);
    }
}
