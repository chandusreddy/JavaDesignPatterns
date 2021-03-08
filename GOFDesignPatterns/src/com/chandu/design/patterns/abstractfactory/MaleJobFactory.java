package com.chandu.design.patterns.abstractfactory;

public class MaleJobFactory extends JobAbstractFactory {

	@Override
	public Job createJob(String type) {
		Job job = null;
		if (type.equals("employee")) {

			job = new MaleEmpJob();
		} else if (type.equals("contractor")) {
			job = new MaleContJob();
		}

		return job;
	}

}
