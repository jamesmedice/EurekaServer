package com.medici.app.eureka.zuul.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaZuulClientController {

	protected Logger logger = Logger.getLogger(EurekaZuulClientController.class.getName());

	@Autowired
	DiscoveryClient discoveryClient;

	@GetMapping(value = "/env/servers")
	public List<ServiceInstance> listEnvServers() {
		return discoveryClient.getInstances("ENVIRONMENT-SERVICE");
	}
	@GetMapping(value = "/feign/servers")
	public List<ServiceInstance> listFeignServers() {
		return discoveryClient.getInstances("FEIGN-SERVICE");
	}

}
