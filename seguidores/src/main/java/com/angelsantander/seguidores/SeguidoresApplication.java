package com.angelsantander.seguidores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SeguidoresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeguidoresApplication.class, args);
	}

}
