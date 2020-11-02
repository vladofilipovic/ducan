package com.boki.ducan.controller;
import com.boki.ducan.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
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
    
}
