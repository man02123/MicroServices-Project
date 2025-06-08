package main.java.com.example.Subscription_Service.controller;

import main.java.com.example.Subscription_Service.entity.Subscription;

@RestController
public class ServiceController {

    @Autowired
    private SubscriptionService subscriptionService;

    @GetMapping("/subscription")
    public Subscription getAllSubscriptions(@RequestBody Subscription subscription) {
        return subscriptionService.getAllSubscription(subscription);
    }

    @PostMapping("/")
    public List<User> saveSubscription() {
        return subscriptionService.saveSubscription();
    }

}
