<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="model.Coffee" %>
    
<% Coffee coffee = (Coffee) request.getAttribute("coffee"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coffee List - Update a Coffee</title>
</head>
<body>

<h1>Coffee List - Update a Coffee</h1>

<form name=updateForm action=updateCoffee method=get>
	
	<label>
		Coffee ID:
	</label>
	<input type=text name=coffeeID value="<%= coffee.getCoffeeID() %>" />
	<br />
	
	<label>
		Coffee name:
	</label>
	<input type=text name=name value="<%= coffee.getName() %>" />
	<br />
	<label>
		Coffee description:
	</label>
	<input type=text name=description value="<%= coffee.getDescription() %>" />
	<br />
	<label>
		Coffee price:
	</label>
	<input type=text name=price value="<%= coffee.getPrice() %>" />
	<br />
	
	<input type=submit name=submit value="Update the Coffee" />
	
</form>

</body>
</html>