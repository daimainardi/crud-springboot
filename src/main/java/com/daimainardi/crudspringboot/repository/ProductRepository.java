package com.daimainardi.crudspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.daimainardi.crudspringboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
