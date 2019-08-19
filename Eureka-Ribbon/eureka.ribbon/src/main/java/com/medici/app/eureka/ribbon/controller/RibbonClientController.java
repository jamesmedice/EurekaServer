package com.medici.app.eureka.ribbon.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonClientController {

	protected Logger logger = Logger.getLogger(RibbonClientController.class.getName());

	@Autowired
	LoadBalancerClient loadBalancer;

	@Autowired
	DiscoveryClient discoveryClient;

	@GetMapping(value = "/balance")
	public String loadBalancing() {
		ServiceInstance serviceInstance = loadBalancer.choose("Environment-Service");
		return serviceInstance.getUri().toString();
	}

	@GetMapping(value = "/servers")
	public List<String> listServers() {
		List<ServiceInstance> servers = discoveryClient.getInstances("Environment-Service");

		List<String> payload = new ArrayList<>();

		for (ServiceInstance serviceInstance : servers) {
			payload.add(serviceInstance.getUri().toString());
			payload.add(serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/");
		}
		return payload;
	}

}
