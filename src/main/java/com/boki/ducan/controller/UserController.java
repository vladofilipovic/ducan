package com.boki.ducan.controller;
import com.boki.ducan.exception.ResourceNotFoundException;
import com.boki.ducan.model.User;
import com.boki.ducan.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/users")
public class UserController {
    
    private final UserService service;
    
    @Autowired
    public UserController(UserService service){
        this.service = service;
    }
    
    @GetMapping
    public List < User > getAllUsers() {
        return service.listAll();
    }
    
    @PostMapping("/newUser")
    public User createUser(@RequestBody User user){
        return service.saveUser(user);
    }
    
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id){
        service.deleteUser(id);
    }
    
    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "userId") Integer id)throws ResourceNotFoundException {
        return service.getUserById(id);
    }
    
    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user,@PathVariable(value = "userId") Integer id)throws ResourceNotFoundException{
        User updateUser = service.getUserById(id);
        updateUser.setFirstName(user.getFirstName());
        updateUser.setLastName(user.getLastName());
        updateUser.setUsername(user.getUsername());
        updateUser.setPassword(user.getPassword());
        updateUser.setRole(user.getRole());
        
        return service.saveUser(updateUser);
    }
    
     /*@GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "userId") Integer id){
        return service.getUserById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }
    */
    
    
}
