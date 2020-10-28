package com.boki.ducan.service;
import com.boki.ducan.model.Category;
import com.boki.ducan.repository.CategoryRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    
    CategoryRepo repo;
    
    @Autowired
    public CategoryService(CategoryRepo repo){
        this.repo = repo;
    }
    
     public List<Category> listAll() {
        return repo.findAll();
    }
    
    public void saveCart(Category category){
        repo.save(category);
    }
    
    public void getCartById (Integer id){
        repo.findById(id);
    }
    
    public void deleteCart(Integer id){
        repo.deleteById(id);
    }
    
}
