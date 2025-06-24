package com.example.UserService.controller;

import java.nio.file.ReadOnlyFileSystemException;
import java.util.List;
import java.util.Optional;

import com.example.UserService.exception.ResourceNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.UserService.entity.User;
import com.example.UserService.service.User_Service;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private User_Service userService;

    @PostMapping("/")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @GetMapping("/{Id}")
    public User getAllUsers(@PathVariable Long Id) {
        log.info("get all the user called");
        // TODO : this id needs to be fetched from the Subscription service , dynamically
        Long id = 1L;
        return userService.getAllUsers(Id);
    }

}
