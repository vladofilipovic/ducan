package com.boki.ducan.service;
import com.boki.ducan.model.Product;
import com.boki.ducan.repository.ProductRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    
    ProductRepo repo;
    
    @Autowired
    public ProductService (ProductRepo repo){
        this.repo = repo;
    }
    
     public List<Product> listAll() {
        return repo.findAll();
    }
    
    public void saveProduct(Product product){
        repo.save(product);
    }
    
    public void getProductById (Integer id){
        repo.findById(id);
    }
    
    public void deleteProduct(Integer id){
        repo.deleteById(id);
    }
}
