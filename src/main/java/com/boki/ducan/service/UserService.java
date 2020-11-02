package com.boki.ducan.service;
import com.boki.ducan.model.User;
import com.boki.ducan.repository.UserRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    private final UserRepo repo;
    
    @Autowired
    public UserService(UserRepo repo){
        this.repo = repo;
    }
    
      public List<User> listAll() {
        return repo.findAll();
    }
    
    public User saveUser(User user){
      return repo.save(user);
    }
    
    public User getUserById (Integer id){
      return  repo.findById(id).get();
    }
    
    public void deleteUser(Integer id){
        repo.deleteById(id);
    }
}
