package com.daimainardi.crudspringboot.service;

import com.daimainardi.crudspringboot.entity.Product;
import com.daimainardi.crudspringboot.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll(){
        return repository.findAll();
    }
    public Product findById(Long id){
        return repository.findById(id).get();
        //Optional<Order> obj = repository.findById(id);
        //        return obj.get();
    }
}
