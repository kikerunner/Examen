<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserting new Director</title>
</head>
<body>
<form action="LoadDirectorsList" method="post">
		<input type="submit" value="Show List">
</form>
	<form action="AddDirector" method="post">
		<span>Director's Name</span><input type="text" name="name">
		<input type="submit" value="Send">
	</form>
	<table border="1">
		<thead>
			<tr>
				<td>Director's Name</td>
				<td>Erase</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="director" items="${listAllDirectors}">
				<tr>
					<td><c:out value="${director.name}" /></td>
					<td><a href="/deleteDirector?codDirector=${director.cod}">DELETE</a>
					</td>
				</tr>
			</c:forEach>
				
		</tbody>
	</table>
</body>
</html>