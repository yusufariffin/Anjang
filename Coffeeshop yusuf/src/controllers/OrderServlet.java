package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.OrderQuery;

/**
 * Servlet implementation class ReadServlet
 */
@WebServlet(
		description = "Controller for reading coffee table", 
		urlPatterns = { 
				"/OrderServlet", 
				"/order"
		})
public class OrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// create a ReadQuery helper object
		OrderQuery rq = new OrderQuery("coffeeshop_db", "Coffee.shop", "");
		
		// get html table from ReadQuery object
		rq.doRead1();
		String table1 = rq.getHTMLTable1();
		rq.doRead2();
		String table2 = rq.getHTMLTable2();
		
		// pass execution control to read.jsp along with the table
		request.setAttribute("table1", table1);
		request.setAttribute("table2", table2);
		String url = "/order.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
