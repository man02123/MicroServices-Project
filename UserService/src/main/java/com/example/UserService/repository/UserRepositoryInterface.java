package com.example.UserService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.UserService.entity.User;

public interface UserRepositoryInterface extends JpaRepository<User, Long> {

}
