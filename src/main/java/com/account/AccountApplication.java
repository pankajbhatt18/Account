package com.account;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

/**
 * The Class AccountApplication.
 */
@SpringBootApplication
@ComponentScan(basePackages = { "com.demo", "com.demo.controller", "com.demo.servlet" })
@EnableJpaRepositories(basePackages = { "com.demo" })
@EntityScan(basePackages = { "com.demo.entity", "com.demo.model" })
@OpenAPIDefinition(info = @Info(title = "Account/Login MS", version = "1.0.0", description = "Account/Login for performing account/login related queries"))
public class AccountApplication {
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}
}
