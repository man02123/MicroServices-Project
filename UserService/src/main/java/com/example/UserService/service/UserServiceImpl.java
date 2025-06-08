package com.example.UserService.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.UserService.entity.User;
import com.example.UserService.repository.UserRepositoryInterface;

import lombok.extern.slf4j.Slf4j;

import org.slf4j.LoggerFactory;

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
   public List<User> getAllUsers() {
      log.info("Getting all users");
      try {
         userRepositoryInterface.findAll();
      } catch (Exception e) {
         log.error("Error getting all users: {}", e.getMessage());
      }
      return userRepositoryInterface.findAll();
   }
}
