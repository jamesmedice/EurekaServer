package com.medici.app.eureka.feign.service;

import java.util.Map;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "Zuul-Service")
public interface RemoteEnvironmentProxy {

	@RequestMapping(value = "/gateway-Service/envVars", method = RequestMethod.GET)
	public Map<String, String> envVars();

	@RequestMapping(value = "/gateway-Service/activeProfiles", method = RequestMethod.GET)
	public String[] activeProfiles();

}
