package com.chandu.design.patterns.ioc;

import org.springframework.stereotype.Component;

@Component
public class EngineImpl implements Engine {

	@Override
	public void install() {
		System.out.println("Engine Installation ");
	}

}
