package com.gsb.spring_framwork_telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/*
@Primary 
 * Now here there are 2 classes which are implementing the MobileProcessor Interface.
 * And Samsung Mobile Class is using the object of MobileProcessor,
 * If @Primary is not mentioned, then we will get NoUniqueBeanException.
 */
public class Mediatek implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("2nd best CPU");
	}

}
