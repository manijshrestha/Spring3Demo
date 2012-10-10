package com.manijshrestha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AmericanGreeterService implements GreeterService {

	@Autowired
	TimeOfDayResolverService todResolver;

	@Override
	public String greet(String name) {
		return "Good " + todResolver.getTimeOfDay() + ", " + name + "!";
	}
}
