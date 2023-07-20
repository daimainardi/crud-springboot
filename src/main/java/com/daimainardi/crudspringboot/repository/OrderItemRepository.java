package com.daimainardi.crudspringboot.repository;

import com.daimainardi.crudspringboot.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
