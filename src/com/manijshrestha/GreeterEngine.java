package com.manijshrestha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.manijshrestha.service.GreeterService;

/**
 * Class to test the DI through Spring 3.2
 * 
 * @author manijshrestha
 * 
 */
public class GreeterEngine {

	public static void main(String... args) {
		ApplicationContext ctx = new GenericXmlApplicationContext(
				"com/manijshrestha/config/app-config.xml");

		GreeterService greeterService = ctx.getBean(GreeterService.class);

		System.out.println(greeterService.greet("World"));
	}

}
