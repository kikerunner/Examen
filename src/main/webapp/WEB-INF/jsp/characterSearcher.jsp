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
	<form action="/characterSearcher" method="post">
	<span>Searching by Character: <input type="text" name="role"></span>
	<br />
	<input type="submit" value="Send">
	</form>
	<br />
	<br />

	<table border="1">
		<thead>
			<tr>
				<td>Film Acted</td>
				<td>Actor's name</td>
				<td>Character's Name</td>
			</tr>
		</thead>
		<tbody>
				<tr>
					<td><c:out value="${selectfilmActor.title}" /></td>
					<td><c:out value="${selectfilmActor.name}" /></td>
					<td><c:out value="${selectfilmActor.year}" /></td>
				</tr>
		</tbody>
	</table>


</body>
</html> 