package com.manijshrestha.service;

import org.springframework.stereotype.Service;

@Service
public class AmericanGreeterService implements GreeterService {

	@Override
	public String greet(String name) {
		return "Hello, " + name + "!";
	}
}
