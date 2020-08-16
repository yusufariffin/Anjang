package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.AddQuery;
import model.Coffee;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet(description = "controller for adding a new coffee to the database", urlPatterns = { "/addCoffee" })
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
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
		int coffeeID = Integer.parseInt(request.getParameter("coffeeID"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Double price = Double.parseDouble(request.getParameter("price"));
		
		// set up book object
		Coffee coffee = new Coffee();
		coffee.setCoffeeID(coffeeID);
		coffee.setName(name);
		coffee.setDescription(description);
		coffee.setPrice(price);
		
		// set up addQuery object
		AddQuery aq = new AddQuery("coffeeshop_db", "Coffee.shop", "");
		
		// pass book to addQuery to add to the database
		aq.doAdd(coffee);
		
		// pass execution control to ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
		
	}

}
