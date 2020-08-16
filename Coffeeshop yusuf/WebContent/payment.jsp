<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
    <%@page import="java.text.DecimalFormat" %>
     
    
 <% DecimalFormat format = new DecimalFormat("RM #0.00");

 	String payment = request.getParameter("payment");
 	String total = session.getAttribute("total").toString();
 	double totals = Double.valueOf(total);
 	double GST = 0.06;
 	double Service = 0.10;
 	
 	if(payment.equals("1")){
 	double pay = totals*0.95;
 	out.println("The total amount is "+ format.format(totals));%> <br> <% 
 	out.println("GST: "+ GST);%> <br> <%
 	out.println("Service Tax "+ Service);%> <br> <%
 	out.println("The NEW total amount is "+ format.format(pay * (1+(GST + Service))));
 		
 	}


 	else{
 		out.println("The total amount is "+ format.format(totals));%> <br> <%
 		out.println("GST: "+ GST);%> <br> <%
 	 	out.println("Service Tax "+ Service);%> <br> <%
 	 	out.println("The NEW total amount is "+ format.format(totals + GST + Service));
 	}
 %>
 
 
 
