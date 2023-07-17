package com.daimainardi.crudspringboot.repository;

import com.daimainardi.crudspringboot.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
