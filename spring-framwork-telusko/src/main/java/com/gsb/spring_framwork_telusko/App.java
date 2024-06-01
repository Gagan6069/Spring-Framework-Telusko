package com.gsb.spring_framwork_telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	// XML based Spring Configuration
//    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//        Vehicle obj = (Vehicle) context.getBean("car");
//        obj.drive();
    	
//    	Tyre t = (Tyre) context.getBean("tyre");
//    	System.out.println(t);
    	
    	// Annotation based Spring configuration
    	
    	ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	Samsung s7 = factory.getBean(Samsung.class);
    	s7.config();
    }
}
