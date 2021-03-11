package com.chandu.design.patterns.frontcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewEmployeeCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		EmployeeVO vo = new EmployeeVO(1,"Sachin");
		request.setAttribute("employeeDetails", vo);
		return "showEmployeeDetails";
	}

}
