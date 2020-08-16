<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<h1>New User</h1>

<form name=registerForm action=addUser method=get>

	<label>
		User ID:
	</label>
	<input type=text name=userID value="" />
	<br />
	<label>
		User name:
	</label>
	<input type=text name=userName value="" />
	<br />
	<label>
		Password:
	</label>
	<input type=password name=password value="" />
	<br />
	<label>
	
	<input type=submit name=submit value="Register" />

</form>

</body>
</html>