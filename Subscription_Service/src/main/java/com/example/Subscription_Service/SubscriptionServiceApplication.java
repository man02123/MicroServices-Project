package com.example.Subscription_Service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SubscriptionServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(SubscriptionServiceApplication.class, args);
		log.info("Subscription service is running");
	}

}
