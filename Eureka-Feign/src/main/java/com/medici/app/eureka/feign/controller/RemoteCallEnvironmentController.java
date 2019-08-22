package com.medici.app.eureka.feign.controller;

import java.util.Map;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.medici.app.eureka.feign.service.RemoteEnvironmentProxy;

@RestController
public class RemoteCallEnvironmentController {

	protected Logger logger = Logger.getLogger(RemoteCallEnvironmentController.class.getName());

	@Autowired
	RemoteEnvironmentProxy proxy;

	@RequestMapping(value = "/profiles", method = RequestMethod.GET)
	public String[] activeProfiles() {
		logger.info("REMOTE CALL FEIGN:  /profiles");
		return proxy.activeProfiles();
	}

	@RequestMapping(value = "/vars", method = RequestMethod.GET)
	public Map<String, String> envVars() {
		logger.info("REMOTE CALL FEIGN:  /envVars");
		return proxy.envVars();
	}

}
