package com.example.daily.shoppingpaymenteurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShoppingPaymentEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingPaymentEurekaClientApplication.class, args);
	}

}
