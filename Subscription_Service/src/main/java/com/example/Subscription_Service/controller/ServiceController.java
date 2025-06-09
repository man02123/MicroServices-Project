package com.example.Subscription_Service.controller;

import com.example.Subscription_Service.entity.Subscription;
import com.example.Subscription_Service.service.SubscriptionServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    private SubscriptionServiceInterface subscriptionService;

    @GetMapping("/subscription")
    public Subscription getAllSubscriptions(@RequestBody Subscription subscription) {
        return subscriptionService.getAllSubscription(subscription);
    }

    @PostMapping("/")
    public List<Subscription> saveSubscription() {
        return subscriptionService.saveSubscription();
    }

}
