<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FillPeliculaActor</title>
</head>
<body>



	<form action="fillPeliculaActor?codFilm=${codFilm}&codActor=${codActor}" method="post">
		<span>Cache:</span> <input type="number" name="cache"> <br /> 
		<span>Rol:</span> <input type="text" name="role"> <br />
		<input type="submit">
	</form>

</body>
</html>