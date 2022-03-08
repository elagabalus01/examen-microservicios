package com.angelsantander.admin_usuarios.repository;
import org.springframework.data.repository.CrudRepository;
import com.angelsantander.admin_usuarios.entity.User;
public interface UserRepository extends CrudRepository<User,Integer>{
    
}
