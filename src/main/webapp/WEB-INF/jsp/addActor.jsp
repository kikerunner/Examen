<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert New Actor</title>
</head>
<body>
<form action="LoadActorsList" method="post">
		<input type="submit" value="Show List">
</form>
	<form action="AddActor" method="post">
		<span>Name:</span><input type="text" name="NAME">
		<span>Year Of Birthdate</span><input type="number" name="YEAROFBIRTHDAY">
		<input type="submit">
	</form>
	<form action="AddActor" method="post">
		<span>From:</span>
		<input type="text" name="beginDate">
		<span>To:</span>
		<input type="text" name="endDate">
		<input type="submit">
	</form>
	<table border="1">
		<thead>
			<tr>
				<td>Name</td>
				<td>Year</td>
				<td>Erase</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="actor1" items="${LoadActorsList}">
				<tr>
					<td><c:out value="${actor1.name}" /></td>
					<td><c:out value="${actor1.yearofbirthday}" /></td>
					<td><a href="/deleteActor?codActor=${actor1.cod}">DELETE</a>
					</td>
				</tr>
			</c:forEach>
				
		</tbody>
	</table>
</body>
</html>