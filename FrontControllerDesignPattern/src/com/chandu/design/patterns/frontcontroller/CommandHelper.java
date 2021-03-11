package com.chandu.design.patterns.frontcontroller;

public class CommandHelper {

	public Command getCommand(String requestURI) {

		if (requestURI.contains("viewEmployeeDetails.do")) {
			return new ViewEmployeeCommand();
		}
		return null;

	}

}
