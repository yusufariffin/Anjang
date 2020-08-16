package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.RegisterQuery;
import model.User;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(description = "controller for adding a new coffee to the database", urlPatterns = { "/addUser" })
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get data
		int userID = Integer.parseInt(request.getParameter("userID"));
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		// set up book object
		User user = new User();
		user.setUserID(userID);
		user.setName(userName);
		user.setPassword(password);
	
		
		// set up addQuery object
		RegisterQuery rq = new RegisterQuery("coffeeshop_db", "Coffee.shop", "");
		
		// pass book to addQuery to add to the database
		rq.doAdd(user);
		
		// pass execution control to ReadServlet
		String url = "/successRegister.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
