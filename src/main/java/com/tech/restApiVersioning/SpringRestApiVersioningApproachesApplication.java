package com.tech.restApiVersioning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * 
 * @author jasleen.khurana
 *
 */
@SpringBootApplication
@ComponentScan("com.tech.restApiVersioning.*")
public class SpringRestApiVersioningApproachesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApiVersioningApproachesApplication.class, args);
	}
}
