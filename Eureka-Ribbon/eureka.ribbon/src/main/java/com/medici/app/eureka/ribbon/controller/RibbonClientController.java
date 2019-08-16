package com.medici.app.eureka.ribbon.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonClientController {

	protected Logger logger = Logger.getLogger(RibbonClientController.class.getName());

	@Autowired
	LoadBalancerClient loadBalancer;

	@GetMapping(value = "/fetch")
	public String loadBalancing() {
		ServiceInstance serviceInstance = loadBalancer.choose("Environment-Service");
		return serviceInstance.getUri().toString();
	}

}
