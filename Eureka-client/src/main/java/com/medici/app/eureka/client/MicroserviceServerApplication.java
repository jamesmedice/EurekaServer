package com.medici.app.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/***
 * 
 * @author a73s
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroserviceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceServerApplication.class, args);
	}

}
