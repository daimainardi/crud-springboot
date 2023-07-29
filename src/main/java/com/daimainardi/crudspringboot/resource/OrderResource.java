package com.daimainardi.crudspringboot.resource;

import com.daimainardi.crudspringboot.entity.Order;
import com.daimainardi.crudspringboot.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    private final OrderService service;

    public OrderResource(OrderService service) {
        this.service = service;
    }

    @GetMapping
    public List<Order> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Order findById(@PathVariable Long id) {
        return service.findById(id);

    }

}
