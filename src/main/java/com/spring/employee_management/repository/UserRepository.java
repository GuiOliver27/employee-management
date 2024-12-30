package com.spring.employee_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.employee_management.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
