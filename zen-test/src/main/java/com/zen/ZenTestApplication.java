package com.zen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZenTestApplication {

	public static void main(String[] args) {
		System.getProperties().put( "server.port", 8083 );
		SpringApplication.run(ZenTestApplication.class, args);
	}

}
