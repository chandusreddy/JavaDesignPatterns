package com.chandu.design.patterns.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleImpl implements Vehicle {

	// Object creation and injecting the object is done by the user as below.
	// Engine engine = new EngineImpl();

	// This enables the Inversion of Control and Dependency injection so that Spring
	// Container will
	// inject the required object or the class.
	@Autowired
	private Engine engine;

	/*
	 * This is the Constructor Injection
	 * 
	 * @Autowired 
	 * VehicleImpl(Engine engine) { 
	 * this.engine = engine;
	 * 
	 * }
	 */

	@Override
	public void produce() {

		getEngine().install();

	}

	public Engine getEngine() {
		return engine;
	}

	// Setter method injection
	// @Autowired
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

}
