<%@page import="java.util.List"%>
<%@page import="com.cg.entity.BusDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"  errorPage="error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bus Details</title>
</head>
<body>
<%List<BusDetails> buses = (List) request.getAttribute("buses");%>
<h1>Bus Details:</h1>
<table border="1">
	<tr>
		<th>Bus ID</th>
		<th>Bus Travel Name</th>
		<th>Source</th>
		<th>Destination</th>
		<th>Seats Availability</th>
	</tr>
	<% for(BusDetails bus : buses) { %>
	<tr>
		
			<td><%= bus.getBusId() %></td>
			<td><%= bus.getBusTravelName() %> </td>
			<td><%= bus.getSource() %> </td>
			<td><%= bus.getDestination() %></td>
			<td><%= bus.getAvailableSeats() %></td>
		
	</tr>
	<% } %>	
</table>
</body>
</html>