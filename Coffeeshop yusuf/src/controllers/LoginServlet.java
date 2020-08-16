package controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(
		description = "Controller for reading coffee table", 
		urlPatterns = { 
				"/LoginServlet", 
				"/login"
		})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Connection conn;
	private String name;
	private String password;
	
	private static final String url = "jdbc:mysql://localhost:3306/coffeeshop_db";
	private static final String uname = "Coffee.shop";
	private static final String pwd = "";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		name = request.getParameter("name");
		password = request.getParameter("pass");
		boolean result = validate(name,password);
		
		if(result == true) {
		response.sendRedirect("Welcome.jsp");
			
		}
			
	
		else {
			response.sendRedirect("index.jsp?error=1");
		}
		
	}
	
	
	protected boolean validate(String user, String password) {
		String validatePass = null;
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				this.conn = DriverManager.getConnection(url, uname, pwd); //use DriverManager to create the getConnection object
				conn.setAutoCommit(true);						
		}
			catch (Exception e){
				System.out.println("Connection failed " +e.toString());
				
			}
			
			Statement statement = conn.createStatement();
			statement.executeQuery("select password from login where username = '" + user + "'");
			ResultSet rs= statement.getResultSet();
			
			
			if(rs.next()){
				validatePass = rs.getString(1);
					
				}
				statement.close();
				
				if(validatePass.equals(password)) {
					return true;
				}
				
				else {
					return false;
				}
		
		}
			catch (Exception e) {
			
			System.out.println("Exception in validate() = "+ e.toString());
			return false;
		}
	
	}
}


