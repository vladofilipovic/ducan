package com.boki.ducan.service;
import com.boki.ducan.model.Cart;
import com.boki.ducan.repository.CartRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    
    CartRepo repo;
    
    //Constructor injection
    @Autowired
    public CartService(CartRepo repo){
        this.repo = repo;
    }
    
    public List<Cart> listAll() {
        return repo.findAll();
    }
    
    public void saveCart(Cart cart){
        repo.save(cart);
    }
    
    public void getCartById (Integer id){
        repo.findById(id);
    }
    
    public void deleteCart(Integer id){
        repo.deleteById(id);
    }
}
