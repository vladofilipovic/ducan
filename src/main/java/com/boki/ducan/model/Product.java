package com.boki.ducan.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "products")
public class Product {
    
    
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id-product")
  private int productId;
  
  @NotBlank
  private String name;
  
  @NotBlank
  private int price;
  
  @ManyToOne (fetch = FetchType.LAZY)
  @JoinColumn(name="categories-id-category", nullable=false)
  private Category category;
  
  @ManyToOne (fetch = FetchType.LAZY)
  @JoinColumn(name="carts-id-cart", nullable=false)
  private Cart carts;
  
  
}
