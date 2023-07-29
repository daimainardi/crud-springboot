package com.daimainardi.crudspringboot.service;

import com.daimainardi.crudspringboot.entity.Order;
import com.daimainardi.crudspringboot.repository.OrderRepository;
import com.daimainardi.crudspringboot.service.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));

    }

}
