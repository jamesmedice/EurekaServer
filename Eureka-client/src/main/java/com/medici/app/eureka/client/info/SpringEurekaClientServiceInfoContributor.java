package com.medici.app.eureka.client.info;

import java.util.Collections;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

/**
 * 
 * @author a73s
 *
 */
@Component
public class SpringEurekaClientServiceInfoContributor implements InfoContributor {

	@Override
	public void contribute(Info.Builder builder) {
		builder.withDetail("details", Collections.singletonMap("description", "This is the Environment Service [Microservice]"));
	}

}
