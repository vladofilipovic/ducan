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
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id-user")
    private int userId;
    
    @NotBlank
    @Column(name = "username", unique = true)
    private String username;
    
    @NotBlank
    private String password;
    
    @NotBlank
    @Column(name = "first-name")
    private String firstName;
    
    @NotBlank
    @Column(name = "last-name")
    private String lastName;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="roles-id-role", nullable=false)
    private Role role;
         
    @OneToMany (mappedBy = "users")
    private List <Cart> cart;
    //list added
    
}
