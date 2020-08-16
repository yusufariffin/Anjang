<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String table1 = (String) request.getAttribute("table1");
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

	<%= table1%>
	<br>
<h1>Add ons</h1>
	<%= table2 %>

 <h2>Customize Your Coffee</h2>

        <form method="post" action="CalculateCoffee.jsp">
            COFFEE TYPE:
            <select name="type">
                <option value="americano">AMERICANO (RM5.00)</option>
                <option value="latte">LATTE (RM4.00)</option>
                <option value="cappuccino">CAPPUCCINO (RM5.50)</option>
                <option value="espresso">ESPRESSO (RM6.00)</option>
                <option value="mocha">MOCHA (RM5.00)</option>
            </select>
            <br>
            <br>
            SIZE: 
            <select name="size">
                <option value="short">Short (-RM2.00)</option>
                <option value="tall">Tall (-RM1.00)</option>
                <option value="grande">Grande (+RM0.00)</option> 
                <option value="venti">Venti (+RM1.00)</option> 
                <option value="trenta">Trenta (+RM2.00)</option> 
            </select>
            <br>
            <br>
            ICE LEVEL: 
            <select name="ice">
                <option value="normal">Normal (+RM0.00)</option>
                <option value="light">Light ice (-RM0.30)</option>
                <option value="noice">No ice (-RM0.50)</option> 
            </select>
            <br>
            <br>
            ESPRESSO SHOT: 
            <select name="shot">
                <option value="oneshot">1x shot (+RM1.00)</option>
                <option value="twoshot">2x shots (+RM2.00)</option>
                <option value="threeshot">3x shots (+RM3.00)</option> 
            </select>
            <br>
            <br>
            SYRUP PUMP: 
            <select name="syrup">
                <option value="onepump">One pump (+RM0.50)</option>
                <option value="twopump">Two pump (+RM1.00)</option>
                <option value="threepump">Three pump (+RM1.50)</option> 
            </select>
            <br>
            <br>
            
            
            AMOUNT: 
            <select name="amount">
                <option value="1">One</option>
                <option value="2">Two</option>
                <option value="3">Three</option> 
            </select>
          
            <br>
            <br>
              <input type="submit" value="Calculate Price">
            </form>

</body>
</html>