package com.zen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class AdminStartApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8080 );
		SpringApplication.run(AdminStartApplication.class, args);
	}

}
