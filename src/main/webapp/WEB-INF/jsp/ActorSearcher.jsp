<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index page</title>
</head>
<body>
	<form action="ActorSearcher" method="post">
		<span>Looking By Actor: <input type="text" name="name"></span>
		<br /> <input type="submit" value="Send">
	</form>
	<br />
	<br />

	<table border="1">
		<thead>
			<tr>
				<td>Directors he worked with</td>
				<td>Film Title</td>
			</tr>
		</thead>
		<tbody>
			<tr>
					<c:forEach var="peliculaActor" items="${listFilterActor}">
					<tr>
					<td>
						<c:out value="${peliculaActor.name}" />
						</td>
					<td>
						<c:out value="${peliculaActor.peliculas.title}" />
					</td>
					</tr>
					</c:forEach>
			</tr>
		</tbody>
	</table>


</body>
</html> 