package com.gsb.spring_framwork_telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration // 
@Component // To specify class object
public class Samsung {
	
	@Autowired
//	@Qualifier("snapdragon")
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println("Ye le mere samsoong ka no...");
		cpu.process();
	}

}
