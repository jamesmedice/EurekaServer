package com.medici.app.eureka.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/***
 * 
 * @author a73s
 *
 */
@SpringBootApplication
@EnableFeignClients
public class EurekaFeignMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignMicroserviceApplication.class, args);
	}

}
