<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align = "center">JerryMouse Coffee Shop System</h1>
<br>
<br>
<form method="post" action="LoginServlet">
<table align="center">
<tr>
<td>Login</td>
<td>:</td>
<td><input type="text" name="name" size="20"></td>
</tr>
<tr>
<td>Password</td>
<td>:</td>
<td><input type="password" name="pass" size="20"></td>
</tr>
<tr>
<td>&nbsp;</td>
<td>&nbsp;</td>
<td align="center"><input type="submit" value="Login"></td>
</tr>
<tr>
<td align="center" colspan="3">
<font color="red">
<%
String error = request.getParameter("error");
if(error != null){
%>
Invalid Login and Password!
<%
}
%>
</font>
</td>
</tr>
</table>
</form>

<br>
<form action="register">
<table align="center">

<tr>
<td>Does not have an account yet?</td>

<td align ="center"><input  type="submit" value="Register"></td>
</tr>


</table>
</form>


</body>
</html>