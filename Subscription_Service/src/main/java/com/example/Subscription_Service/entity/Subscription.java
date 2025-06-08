package main.java.com.example.Subscription_Service.entity;

import java.lang.annotation.Inherited;

@Entity
public class Subscription {

    @Entity
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subscriptionId;
    private String name;
    private Long price;
    private bool isRenewable;

}
