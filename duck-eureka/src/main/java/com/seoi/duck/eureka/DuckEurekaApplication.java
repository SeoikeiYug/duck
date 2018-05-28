package com.seoi.duck.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DuckEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DuckEurekaApplication.class, args);
	}
}
