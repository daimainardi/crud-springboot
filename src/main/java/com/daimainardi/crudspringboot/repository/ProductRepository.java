package com.daimainardi.crudspringboot.repository;

import com.daimainardi.crudspringboot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
