package com.angelsantander.admin_usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AdminUsuarios {

	public static void main(String[] args) {
		SpringApplication.run(AdminUsuarios.class, args);
	}
}