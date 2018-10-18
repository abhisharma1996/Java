package com.cg.project.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginPage")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<html><body>");
		out.println("<div><font color=red size=8>Login Successful</font></div>");
		out.print("</html></body>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginId=request.getParameter("loginId");
		String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		out.print("<html><body><div align='center'>");
		if(loginId.equals("101406013")&& password.equals("143002abhi"))
			out.println("<font color=red size=8>Welcome"+loginId+"</font>");
		else
			out.println("<font color=red size=8>Authenication Failed</font>");
		out.print("</div></body></html>");
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
