package com.boki.ducan.controller;
import com.boki.ducan.model.User;
import com.boki.ducan.service.UserService;
import java.util.List;
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
    
    /*
    
     @GetMapping("/{id}")
    public Korisnici getUserById(@PathVariable Integer id){
        
        return service.getKorisnikById(id);
    }
    */
}