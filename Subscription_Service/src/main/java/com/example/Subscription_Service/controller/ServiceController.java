package com.example.Subscription_Service.controller;

import com.example.Subscription_Service.dto.UserDTO;
import com.example.Subscription_Service.entity.Subscription;
import com.example.Subscription_Service.service.SubscriptionServiceInterface;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
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

    @GetMapping(value = "/sub", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserDTO> getSubscription() {
        log.info("resquest made with id");
        UserDTO result = subscriptionService.getSubscriptionWithUser();

        log.info(result.toString());
        return ResponseEntity.ok(result);
    }

}
