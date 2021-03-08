package com.chandu.design.patterns.abstractfactory;

public class Test {

	public static void main(String[] args) {

		//Calling the AbstractFactory method to create the MaleFactory/FemaleFactory Class Object
		JobAbstractFactory daf = JobFactoryProducer.produce("female");
		// Calling the Factory class for Female/male
		Job job = daf.createJob("contractor");
		job.work();

	}

}
