package com.chandu.design.patterns.abstractfactory;

public class FemaleJobFactory extends JobAbstractFactory {

	@Override
	public Job createJob(String type) {
		Job job = null;
		if (type.equals("employee")) {

			job = new FemaleEmpJob();
		} else if (type.equals("contractor")) {
			job = new FemaleContJob();
		}

		return job;
	}

}
