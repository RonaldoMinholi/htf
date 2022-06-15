<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix = "c" url = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Usuario</h1>

	<br>

	<a href="usuario-novo">Novo Usuario</a>

	<br>
	<br>
	
	<table>
		<tr>
			<th>cd_usuario</th>
			<th>nm_usuario</th>
			<th>ds_email</th>
		</tr>


		<c:forEach item="${listaUsuarios}" var="usuario">
		<tr>
			<td>${usuario.cd_usuario}#</td>
			<td>${usuario.nm_usuario}</td>
			<td>${usuario.ds_email}</td>
			<td><a href="usuario-excluir?cd=${usuario.cd_usuario}">Excluir</a></td>
		</tr>
		</c:forEach>
		<tr>
			<td>#2</td>
			<td>Maria das Gracas</td>
			<td>mariadasgracas@email.com</td>
		</tr>

	</table>


</body>
</html>