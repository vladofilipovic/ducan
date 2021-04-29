package com.boki.ducan.controller;
import com.boki.ducan.model.Cart;
import com.boki.ducan.service.CartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/cart")
public class CartController {
    
  private final CartService service;

  @Autowired
  public CartController(CartService service){
      this.service = service;
  }  
    
  
  @GetMapping("/allCarts")
    public String getAllCarts(Model model) {
        List <Cart> carts = service.listAll();
        model.addAttribute("carts", carts);
        return "cart";
    }
  
  
  
  @PostMapping("/createNewCart")
    public void createProduct(@RequestBody Cart cart){
        service.saveCart(cart);
    }
  
}
