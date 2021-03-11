<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Details</title>
</head>
<body>
	<jsp:useBean id="employeeDetails"
		type="com.chandu.design.patterns.frontcontroller.EmployeeVO" scope="request"/>
	Employee ID:
	<jsp:getProperty property="id" name="employeeDetails" />
	Employee Name:
	<jsp:getProperty property="name" name="employeeDetails" />
</body>
</html>
