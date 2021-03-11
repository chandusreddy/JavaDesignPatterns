<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Flight Ticket Creation</title>
</head>
<body>
<form action="createTicket" method="post">
Airlines Name: <input type="text" name="airlines"/>
Arrival City Name: <input type="text" name="arrivalcity"/>
Departure City Name: <input type="text" name="departurecity"/>
<input type="submit" value="Book"/>
</form>
${msg}
</body>
</html>