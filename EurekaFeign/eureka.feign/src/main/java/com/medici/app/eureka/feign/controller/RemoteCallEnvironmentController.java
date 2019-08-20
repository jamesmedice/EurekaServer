package com.medici.app.eureka.feign.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medici.app.eureka.feign.service.RemoteEnvironmentProxy;

@RestController
@RequestMapping("/environment")
public class RemoteCallEnvironmentController {

	@Autowired
	RemoteEnvironmentProxy proxy;

	@RequestMapping(value = "/profiles", method = RequestMethod.GET)
	public String[] activeProfiles() {
		return proxy.activeProfiles();
	}

	@RequestMapping(value = "/vars", method = RequestMethod.GET)
	public Map<String, String> envVars() {
		return proxy.envVars();
	}

}
