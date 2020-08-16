<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Coffee List - add a coffee</title>
</head>
<body>

<h1>Coffee List - add a coffee</h1>

<form name=addForm action=addCoffee method=get>

	<label>
		Coffee ID:
	</label>
	<input type=text name=coffeeID value="" />
	<br />
	<label>
		Coffee name:
	</label>
	<input type=text name=name value="" />
	<br />
	<label>
		Coffee description:
	</label>
	<input type=text name=description value="" />
	<br />
	<label>
		Coffee price:
	</label>
	<input type=text name=price value="" />
	<br />
	
	<input type=submit name=submit value="Add the Coffee" />

</form>

</body>
</html>