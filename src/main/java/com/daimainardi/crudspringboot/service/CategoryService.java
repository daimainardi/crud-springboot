package com.daimainardi.crudspringboot.service;

import com.daimainardi.crudspringboot.entity.Category;
import com.daimainardi.crudspringboot.repository.CategoryRepository;
import com.daimainardi.crudspringboot.service.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

}
