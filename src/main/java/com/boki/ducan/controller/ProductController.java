package com.boki.ducan.controller;
import com.boki.ducan.exception.ResourceNotFoundException;
import com.boki.ducan.model.Product;
import com.boki.ducan.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    private final ProductService service;
    
    @Autowired
    public ProductController(ProductService service){
        this.service = service;
    }
    
    @GetMapping("/allProducts")
    public String getAllProducts(Model model) {
        List <Product> products = service.listAll();
        model.addAttribute("products", products);
        return "cart";
    }
    
    @PostMapping("/createNewProduct")
    public void createProduct(@RequestBody Product product){
        service.saveProduct(product);
    }
    
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable(value = "productId")Integer id) throws ResourceNotFoundException{
        return service.getProductById(id);
    }
    
    @PutMapping("/productUpdate{id}")
    public void updateProduct(@RequestBody Product product,@PathVariable(value = "productId") Integer id)throws ResourceNotFoundException{
        Product updatedProduct = service.getProductById(id);
        updatedProduct.setName(product.getName());
        updatedProduct.setPrice(product.getPrice());
        updatedProduct.setCategory(product.getCategory());
        
        service.saveProduct(updatedProduct);
    }
}
