package com.medici.app.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author a73s
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaDiscoveryMicroserviceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaDiscoveryMicroserviceServerApplication.class, args);
	}
}
