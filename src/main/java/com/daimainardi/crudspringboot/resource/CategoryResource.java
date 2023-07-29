package com.daimainardi.crudspringboot.resource;

import com.daimainardi.crudspringboot.entity.Category;
import com.daimainardi.crudspringboot.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    private final CategoryService service;

    public CategoryResource(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    public List<Category> findAll() {
        return service.findAll();

    }

    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
