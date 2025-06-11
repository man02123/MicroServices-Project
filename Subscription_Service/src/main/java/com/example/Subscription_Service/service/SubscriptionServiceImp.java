package com.example.Subscription_Service.service;

import com.example.Subscription_Service.client.UserClient;
import com.example.Subscription_Service.dto.UserDTO;
import com.example.Subscription_Service.entity.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImp implements  SubscriptionServiceInterface{
    @Autowired
    private UserClient userClient;
    @Override
    public Subscription getAllSubscription(Subscription subscription) {
        return null;
    }

    @Override
    public List<Subscription> saveSubscription() {
        return List.of();
    }
    @Override
    public UserDTO getSubscriptionWithUser(){
        return userClient.getClientById();
    }
}
