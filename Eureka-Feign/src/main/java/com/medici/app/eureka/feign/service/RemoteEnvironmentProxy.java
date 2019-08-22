package com.medici.app.eureka.feign.service;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "Environment-Service")
public interface RemoteEnvironmentProxy {

	@RequestMapping(value = "/envVars", method = RequestMethod.GET)
	public Map<String, String> envVars();

	@RequestMapping(value = "/activeProfiles", method = RequestMethod.GET)
	public String[] activeProfiles();

}
