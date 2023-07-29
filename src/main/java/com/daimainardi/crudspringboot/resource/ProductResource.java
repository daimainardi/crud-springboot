package com.daimainardi.crudspringboot.resource;

import com.daimainardi.crudspringboot.entity.Product;
import com.daimainardi.crudspringboot.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    private final ProductService service;

    public ProductResource(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Product findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
