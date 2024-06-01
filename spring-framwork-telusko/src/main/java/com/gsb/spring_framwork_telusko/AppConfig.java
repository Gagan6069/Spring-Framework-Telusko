package com.gsb.spring_framwork_telusko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// This class will be responsible for spring configuration

@Configuration
@ComponentScan(basePackages = "com.gsb.spring_framwork_telusko")
public class AppConfig {
	
	
	/*
	 * To not this step we can mention @ComponentScan and mention the package name and give each class @Component tag.
	@Bean
	public Samsung getPhone() {
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}
	*/

}
