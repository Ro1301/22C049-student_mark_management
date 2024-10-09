package com.sjprogramming.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.sjprogramming.restapi.repository")
@EntityScan(basePackages = "com.sjprogramming.restapi.entity")
public class SpringBootRestApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiProjectApplication.class, args);
	}

}
