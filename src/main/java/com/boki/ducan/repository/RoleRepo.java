package com.boki.ducan.repository;
import com.boki.ducan.model.Role;
import javax.persistence.Id;
import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository <Role, Integer> {

    public Role findOne(Integer id);
    
   
}
