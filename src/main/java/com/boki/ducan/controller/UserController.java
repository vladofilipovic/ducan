package com.boki.ducan.controller;
import com.boki.ducan.exception.ResourceNotFoundException;
import com.boki.ducan.model.User;
import com.boki.ducan.service.UserService;
import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping ("/users")
public class UserController {
    
    UserService service;
    
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
    
   /* @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable(value = "userId") Integer id){
        return service.getUserById(id).orElseThrow(() -> new ResourceNotFoundException("User", "id", id));
    }*/
    
}
