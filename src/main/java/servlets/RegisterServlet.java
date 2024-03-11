package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


import Models.StaffSignUpModels;
import controller.StaffSignUpController;



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
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String name=request.getParameter("fullName");
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		String designation=request.getParameter("designation");
		String department=request.getParameter("department");
		String lectureTopic=request.getParameter("lectureTopic");
		String phoneno=request.getParameter("phoneNo");
		String avl=request.getParameter("availability");
		System.out.println(name+" "+email+" "+pass+" "+designation+" "+department+" "+lectureTopic+" "+phoneno+" "+avl);
		
		StaffSignUpModels sm=new StaffSignUpModels();
		sm.setName(name);
		sm.setEmail(email);
		sm.setPass(pass);
		sm.setDesignation(designation);
		sm.setDepartment(department);
		sm.setLectureTopic(lectureTopic);
		sm.setPhoneno(phoneno);
		sm.setAvail(avl);
		System.out.println(sm.getPass());
		StaffSignUpController sc=new StaffSignUpController(sm);
		sc.toStore();
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
