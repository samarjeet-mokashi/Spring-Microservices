package com.lt.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan("com.lt.*")
@EnableWebMvc
@SpringBootApplication
@EnableDiscoveryClient
public class CrsLtG4StudentConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrsLtG4StudentConsumerApplication.class, args);
	}

}
