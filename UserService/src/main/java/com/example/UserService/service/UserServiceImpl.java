package com.example.UserService.service;

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
   public Optional<User> getAllUsers(Long id ) {
      log.info("Getting all users");
      if(userRepositoryInterface.findById(id).isPresent()){
         Optional<User> user = userRepositoryInterface.findById(id);
         log.info(user.toString());
         return user;
      }
      return Optional.of(new User());
     // return new User();
   }
}
