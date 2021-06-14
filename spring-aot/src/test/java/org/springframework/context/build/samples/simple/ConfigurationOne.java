package org.springframework.context.build.samples.simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class ConfigurationOne {

	@Bean
	String beanOne() {
		return "one";
	}

}
