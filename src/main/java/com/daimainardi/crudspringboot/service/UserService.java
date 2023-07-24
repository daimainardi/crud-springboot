package com.daimainardi.crudspringboot.service;

import com.daimainardi.crudspringboot.entity.User;
import com.daimainardi.crudspringboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }
    public User findById(Long id){
        return repository.findById(id).get();
        //Optional<Order> obj = repository.findById(id);
        //        return obj.get();
    }
    public User insert(User obj){
        return repository.save(obj);
    }
}
