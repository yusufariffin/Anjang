package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.ReadQuery;

/**
 * Servlet implementation class ReadServlet
 */
@WebServlet(
		description = "Controller for reading coffee table", 
		urlPatterns = { 
				"/ReadServlet", 
				"/read"
		})
public class ReadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadServlet() {
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
		ReadQuery rq = new ReadQuery("coffeeshop_db", "Coffee.shop", "");
		
		// get html table from ReadQuery object
		rq.doRead();
		String table = rq.getHTMLTable();
		rq.doRead2();
		String table2 = rq.getHTMLTable2();
		
		// pass execution control to read.jsp along with the table
		request.setAttribute("table", table);
		request.setAttribute("table2", table2);
		String url = "/read.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
