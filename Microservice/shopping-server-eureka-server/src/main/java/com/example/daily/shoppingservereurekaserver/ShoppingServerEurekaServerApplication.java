package com.example.daily.shoppingservereurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShoppingServerEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingServerEurekaServerApplication.class, args);
	}

}
