package com.medici.app.eureka.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

/***
 * 
 * @author a73s
 *
 */
@SpringBootApplication
@EnableZipkinServer
public class EurekaZipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZipkinApplication.class, args);
	}

}
