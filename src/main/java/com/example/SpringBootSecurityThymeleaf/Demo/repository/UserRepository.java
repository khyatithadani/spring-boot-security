package com.example.SpringBootSecurityThymeleaf.Demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringBootSecurityThymeleaf.Demo.model.DAOUser;

@Repository
public interface UserRepository extends CrudRepository<DAOUser,Integer>{
    
    DAOUser findByUsername(String username);
}
