package com.jitesh.spring.eureka.springbooteurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServerApplication.class, args);
		System.out.println("test... ******.... ------  ******");
	}

}
