<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String table = (String) request.getAttribute("table");
String table2 = (String) request.getAttribute("table2");
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coffee List</title>
</head>
<body>

<h1>Coffee List</h1>

<%= table %>
<br />
<a href="add">add a coffee</a>

<h1>Add on List</h1>

<%= table2 %>
<br />
<a href="add">add an ingredient</a>


</body>
</html>