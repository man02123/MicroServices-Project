package com.example.UserService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.UserService.entity.User;

;

public interface User_Service {
   public User saveUser(User user);

   public User getAllUsers(Long Id);

}
