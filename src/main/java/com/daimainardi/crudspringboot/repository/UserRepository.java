package com.daimainardi.crudspringboot.repository;

import com.daimainardi.crudspringboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
