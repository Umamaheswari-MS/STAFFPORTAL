package servlets;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import controller.StaffLoginController;

/**
 * Servlet implementation class LoginServlet
 */
public class StaffDashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffDashboardServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	    String bio,avail;
	    bio=request.getParameter("bio");
	    avail=request.getParameter("avail");
	    System.out.println(bio+avail);
	    StaffLoginController lc=new StaffLoginController(bio,avail);
	    if(lc.toStore()) {
	    	request.setAttribute("bio", bio);
	    	request.getRequestDispatcher("dashBoardView.jsp").forward(request, response);
	    }else {
	    	System.out.println("error");
	    }
	    System.out.println(bio+avail);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}