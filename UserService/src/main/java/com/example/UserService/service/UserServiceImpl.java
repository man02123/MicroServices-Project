package com.example.UserService.service;

import com.example.UserService.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserService.entity.User;
import com.example.UserService.repository.UserRepositoryInterface;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl implements User_Service {
   @Autowired
   private UserRepositoryInterface userRepositoryInterface;

   @Override
   public User saveUser(User user) {
      log.info("Saving user: {}", user);
      try {
         userRepositoryInterface.save(user);
      } catch (Exception e) {
         log.error("Error saving user: {}", e.getMessage());
      }
      return user;
   }

   @Override
   public User getAllUsers(Long id) {
      return
              userRepositoryInterface.findById(id).orElseThrow(() -> new ResourceNotFoundException("not found", "404"));
      // return new User();
   }
}
