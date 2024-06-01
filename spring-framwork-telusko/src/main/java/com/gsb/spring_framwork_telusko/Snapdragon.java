package com.gsb.spring_framwork_telusko;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {
	
	public void process() {
		System.out.println("Snapdragon baby!");
	}

}
