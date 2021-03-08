package com.chandu.design.patterns.abstractfactory;

public class JobFactoryProducer {

	public static JobAbstractFactory produce(String factorytype) {
		JobAbstractFactory jaf = null;

		if (factorytype.equals("female")) {
			jaf = new FemaleJobFactory();

		}
		if (factorytype.equals("male")) {
			jaf = new MaleJobFactory();

		}
		return jaf;

	}
}
