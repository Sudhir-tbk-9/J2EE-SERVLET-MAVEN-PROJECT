package com.qspyder.jdbc_Student_InsertController;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.qspyder.jdbc_Student_Registration.Dto.StudentDto;
import com.qspyder.jdbc_Student_Registration.Services.StudentServices;

public class StudentInsertController implements Servlet {
StudentServices studService = new StudentServices();
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"))  ;
		
		String name = req.getParameter("name");
		
		String email = req.getParameter("email");
		
		long phone= Long.parseLong(req.getParameter("phone"));
		
		String gender = req.getParameter("gender");
		
		System.out.println("Student Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Email-id : " + email);
		System.out.println("Phone no : " + phone);
		System.out.println("Gender : " + gender);
		
		/*Service.saveStudentService(id,name,email,phone,gender);*/
		
		StudentDto studSaved = new StudentDto(id , name ,email ,phone ,gender);
		
		/*StudentDto studSavedCheck = */
		studService.saveStudentService(studSaved);
	
		
		PrintWriter pw  =res.getWriter();
		
		pw.write("<html><body><h4> *** STUDENT REGISTERED SUCCESSFULLY ***<h4></body></html>");
		
		RequestDispatcher rd = req.getRequestDispatcher("RegistrationWeb.jsp");
		
		rd.include(req, res);

//		pw.write("<html><body>");
//
//		pw.write("<h4>STUDENT REGISTERED SUCCESSFULLY</h4>");
//
//		pw.write("<div class=\"Register-box\">");
//		pw.write("<form action=\"register\" method=\"get\">");
//		pw.write("<h2>~ ~ Register ~ ~</h2>");
//
//		pw.write("</form>");
//		pw.write("</div>");
//
//		pw.write("</body></html>");


		
	
		}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

}
