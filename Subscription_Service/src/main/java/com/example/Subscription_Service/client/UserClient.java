package com.example.Subscription_Service.client;

import com.example.Subscription_Service.dto.UserDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class UserClient {

    private final RestTemplate restTemplate;

    public UserClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public UserDTO getClientById() {
        log.info("get user is fetched");
        String url = "http://localhost:8081/";
      // TODO : currently id is hardcoded , check a way to remove that

        UserDTO response = restTemplate.getForObject(url, UserDTO.class);
        log.info("request made with statuscode:" + response.toString());

        return  response;
    }
}