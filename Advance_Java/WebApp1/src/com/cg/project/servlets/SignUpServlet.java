package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.project.beans.Associate;

@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SignUpServlet() {
		super();

	}


	public void init(ServletConfig config) throws ServletException {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String phoneNo=request.getParameter("phoneNo");
		String emailId=request.getParameter("emailId");
		String [] hobbies=request.getParameterValues("hobbies");
		String dateOfBirth=request.getParameter("dateOfBirth");

		Associate associate =new Associate(name, phoneNo, emailId, hobbies, dateOfBirth);
		RequestDispatcher dispatcher;
		dispatcher=request.getRequestDispatcher("signUpSuccessPage.jsp");
		request.setAttribute("associate", associate);
		dispatcher.forward(request, response);
	}


}


