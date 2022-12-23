package com.stockorganizer.stockorganizerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class StockOrganizerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockOrganizerConfigServerApplication.class, args);
	}

}
