package com.angelsantander.servermetrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;


@EnableAdminServer
@SpringBootApplication
public class ServerMetricsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerMetricsApplication.class, args);
	}

}
