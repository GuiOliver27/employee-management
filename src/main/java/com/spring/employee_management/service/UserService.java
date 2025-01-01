package com.spring.employee_management.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.spring.employee_management.dto.UserRegistrationDto;
import com.spring.employee_management.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
