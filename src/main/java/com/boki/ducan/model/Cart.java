package com.boki.ducan.model;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "carts")
public class Cart {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-cart")
    private int cartId;
    
    @Column(name = "quantity", nullable = false)
    private int quantity;
    
    @Column(name = "total-price", nullable = false)
    private int totalPrice;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="users-id-user", nullable=false)
    private User user;
    
    @OneToMany (mappedBy = "carts")
    private List <Product> product;
    //list added
    
}
