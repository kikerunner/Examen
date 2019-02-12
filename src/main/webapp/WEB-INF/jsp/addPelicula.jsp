<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserting New Film</title>
</head>
<body>
<form action="LoadFilmsList" method="post">
		<input type="submit" value="Show List">
</form>

	<form action="AddPelicula" method="post">
		<span>Title:</span><input type="text" name="title">
		<span>Director's Code:</span><input type="number" name="codDirector">
		<input type="submit" value="Send">
	</form>
	<table border="1">
		<thead>
			<tr>
				<td>Title</td>
				<td>CodDirector</td>
				<td>Erase</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="film" items="${listAllFilms}">
				<tr>
					<td><c:out value="${film.title}" /></td>
					<td><c:out value="${film.codDirector}" /></td>
					<td><a href="/deletePelicula?codPelicula=${film.cod}">DELETE</a>
					</td>
				</tr>
			</c:forEach>
				
		</tbody>
	</table>
</body>
</html>