package com.daimainardi.crudspringboot.service;

import com.daimainardi.crudspringboot.entity.Product;
import com.daimainardi.crudspringboot.repository.ProductRepository;
import com.daimainardi.crudspringboot.service.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));

    }
}
