<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<% 
    String type = request.getParameter("type");
    String size = request.getParameter("size");
    String ice = request.getParameter("ice");
    String shot = request.getParameter("shot");
    String syrup = request.getParameter("syrup");
    int units = Integer.parseInt(request.getParameter("amount"));
    double Price = 0;
    
    if(type.equals("americano") || type.equals("mocha")) {
    	Price = Price + 5.00;
    	
    	if(size.equals("short")) {
    		Price = Price - 2.00;
    	}
    	else if(size.equals("tall")) {
    		Price = Price - 1.00;
    	}
    	else if(size.equals("grande")) {
    		Price = Price + 0.00;
    	}
    	else if(size.equals("venti")) {
    		Price = Price + 1.00;
    	}
    	else if(size.equals("trenta")) {
    		Price = Price + 2.00;
    	}
    	
    	if(ice.equals("normal")) {
    		Price = Price + 0.00;
    	}
    	else if(ice.equals("light")) {
    		Price = Price - 0.30;
    	}
    	else if(ice.equals("noice")) {
    		Price = Price - 0.50;
    	}
    	
    	if(shot.equals("oneshot")) {
    		Price = Price + 1.00;
    	}
    	else if(shot.equals("twoshot")) {
    		Price = Price + 2.00;
    	}
    	else if(shot.equals("threeshot")) {
    		Price = Price + 3.00;
    	}
    	
    	if(syrup.equals("onepump")) {
    		Price = Price + 0.50;
    	}
    	else if(syrup.equals("twopump")) {
    		Price = Price + 1.00;
    	}
    	else if(syrup.equals("threepump")) {
    		Price = Price + 1.50;
    	}
    }
    else if(type.equals("latte")) {
    	Price = Price + 4.00;
    	
    	if(size.equals("short")) {
    		Price = Price - 2.00;
    	}
    	else if(size.equals("tall")) {
    		Price = Price - 1.00;
    	}
    	else if(size.equals("grande")) {
    		Price = Price + 0.00;
    	}
    	else if(size.equals("venti")) {
    		Price = Price + 1.00;
    	}
    	else if(size.equals("trenta")) {
    		Price = Price + 2.00;
    	}
    	
    	if(ice.equals("normal")) {
    		Price = Price + 0.00;
    	}
    	else if(ice.equals("light")) {
    		Price = Price - 0.30;
    	}
    	else if(ice.equals("noice")) {
    		Price = Price - 0.50;
    	}
    	
    	if(shot.equals("oneshot")) {
    		Price = Price + 1.00;
    	}
    	else if(shot.equals("twoshot")) {
    		Price = Price + 2.00;
    	}
    	else if(shot.equals("threeshot")) {
    		Price = Price + 3.00;
    	}
    	
    	if(syrup.equals("onepump")) {
    		Price = Price + 0.50;
    	}
    	else if(syrup.equals("twopump")) {
    		Price = Price + 1.00;
    	}
    	else if(syrup.equals("threepump")) {
    		Price = Price + 1.50;
    	}
    }
    else if(type.equals("cappuccino")) {
    	Price = Price + 5.50;
    	
    	if(size.equals("short")) {
    		Price = Price - 2.00;
    	}
    	else if(size.equals("tall")) {
    		Price = Price - 1.00;
    	}
    	else if(size.equals("grande")) {
    		Price = Price + 0.00;
    	}
    	else if(size.equals("venti")) {
    		Price = Price + 1.00;
    	}
    	else if(size.equals("trenta")) {
    		Price = Price + 2.00;
    	}
    	
    	if(ice.equals("normal")) {
    		Price = Price + 0.00;
    	}
    	else if(ice.equals("light")) {
    		Price = Price - 0.30;
    	}
    	else if(ice.equals("noice")) {
    		Price = Price - 0.50;
    	}
    	
    	if(shot.equals("oneshot")) {
    		Price = Price + 1.00;
    	}
    	else if(shot.equals("twoshot")) {
    		Price = Price + 2.00;
    	}
    	else if(shot.equals("threeshot")) {
    		Price = Price + 3.00;
    	}
    	
    	if(syrup.equals("onepump")) {
    		Price = Price + 0.50;
    	}
    	else if(syrup.equals("twopump")) {
    		Price = Price + 1.00;
    	}
    	else if(syrup.equals("threepump")) {
    		Price = Price + 1.50;
    	}
    }
    else if(type.equals("espresso")) {
    	Price = Price + 6.00;
    	
    	if(size.equals("short")) {
    		Price = Price - 2.00;
    	}
    	else if(size.equals("tall")) {
    		Price = Price - 1.00;
    	}
    	else if(size.equals("grande")) {
    		Price = Price + 0.00;
    	}
    	else if(size.equals("venti")) {
    		Price = Price + 1.00;
    	}
    	else if(size.equals("trenta")) {
    		Price = Price + 2.00;
    	}
    	
    	if(ice.equals("normal")) {
    		Price = Price + 0.00;
    	}
    	else if(ice.equals("light")) {
    		Price = Price - 0.30;
    	}
    	else if(ice.equals("noice")) {
    		Price = Price - 0.50;
    	}
    	
    	if(shot.equals("oneshot")) {
    		Price = Price + 1.00;
    	}
    	else if(shot.equals("twoshot")) {
    		Price = Price + 2.00;
    	}
    	else if(shot.equals("threeshot")) {
    		Price = Price + 3.00;
    	}
    	
    	if(syrup.equals("onepump")) {
    		Price = Price + 0.50;
    	}
    	else if(syrup.equals("twopump")) {
    		Price = Price + 1.00;
    	}
    	else if(syrup.equals("threepump")) {
    		Price = Price + 1.50;
    	}
    }
    
    double total = Price * units;

 %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill</title>
</head>
<body>
&lt;h3&gt;Coffee Type   &lt;/h3&gt;= &lt;%= type %&gt;
 &lt;h3&gt;Cup Size      &lt;/h3&gt;= &lt;%= size %&gt;
 &lt;h3&gt;Ice Level     &lt;/h3&gt;= &lt;%= ice %&gt;
 &lt;h3&gt;Espresso Shot &lt;/h3&gt;= &lt;%= shot %&gt;
 &lt;h3&gt;Syrup Pump    &lt;/h3&gt;= &lt;%= syrup %&gt;
 &lt;h3&gt;Amount    &lt;/h3&gt;= &lt;%= units %&gt;
 <br>
  <h2>Total Price = <%= total %></h2> <br>
  
   &lt;p&gt; Payment &lt;/p&gt;
  <br>
  <p>5% Discount for paying using credit card !!</p>
  
  <form method="post" action="payment.jsp"> 
            &lt;select name="payment"&gt;
                &lt;option value="1"&gt;Credit&lt;/option&gt;
                &lt;option value="2"&gt;Debit&lt;/option&gt;
               
            &lt;/select&gt;
<%  session.setAttribute("total", total); %>
  
<input type="submit" value="Pay !">
  </form>
  
 <br>
 
 
</body>
</html>