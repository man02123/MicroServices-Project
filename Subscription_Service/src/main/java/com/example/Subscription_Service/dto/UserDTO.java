package com.example.Subscription_Service.dto;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

public class UserDTO {
    private String name;
    private String email;

    public UserDTO() {}  // No-arg constructor

    public UserDTO(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UserDTO{name='" + name + "', email='" + email + "'}";
    }
}