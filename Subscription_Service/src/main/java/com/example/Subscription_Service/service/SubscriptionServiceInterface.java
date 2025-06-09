package  com.example.Subscription_Service.service;

import com.example.Subscription_Service.entity.Subscription;

import java.util.List;

public interface SubscriptionServiceInterface {

    Subscription getAllSubscription(Subscription subscription);

    List<Subscription> saveSubscription();
}
