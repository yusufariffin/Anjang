package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.UpdateQuery;
import model.Coffee;

/**
 * Servlet implementation class UpdateCoffeeServlet
 */
@WebServlet(description = "controller which starts the actual coffee update to the database", urlPatterns = { "/updateCoffee" })
public class UpdateCoffeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCoffeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the form data and set up a Coffee object
		int coffeeID = Integer.parseInt(request.getParameter("coffeeID"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		Double price = Double.parseDouble(request.getParameter("price"));
		
		Coffee coffee = new Coffee();
		coffee.setCoffeeID(coffeeID);
		coffee.setName(name);
		coffee.setDescription(description);
		coffee.setPrice(price);
		
		// create an UpdateQuery object and use it to update the book
		UpdateQuery uq = new UpdateQuery("coffeeshop_db", "Coffee.shop", "");
		uq.doUpdate(coffee);
		
		// pass control on to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
