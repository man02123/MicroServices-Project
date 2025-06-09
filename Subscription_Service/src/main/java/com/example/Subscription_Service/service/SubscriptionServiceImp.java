package com.example.Subscription_Service.service;

import com.example.Subscription_Service.entity.Subscription;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImp implements  SubscriptionServiceInterface{

    @Override
    public Subscription getAllSubscription(Subscription subscription) {
        return null;
    }

    @Override
    public List<Subscription> saveSubscription() {
        return List.of();
    }
}
