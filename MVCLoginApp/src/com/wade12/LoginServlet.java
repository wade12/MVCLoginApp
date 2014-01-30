package com.wade12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wade12.dto.User;
import com.wade12.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId;
		String password;
		userId = request.getParameter("userId");
		password = request.getParameter("password");
		
		// instantiate an object of the LoginService
		LoginService loginService = new LoginService();
		
		// now pass userId and password the the method of this loginService object
		// boolean is the Model part of the MVC
		// boolean is not used to generate the View itself
		// boolean is used to decide what happens to the View (i.e. go success or go back to login)
		boolean result = loginService.authenticate(userId, password);
		
		if (result) {
			User user = loginService.getUserDetails(userId);
			// request.getSession().setAttribute("user", user);
			request.setAttribute("user", user);
			// response.sendRedirect("success.jsp");
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			return;
		} // end if
		else {
			response.sendRedirect("login.jsp");
			return;

		} // end else
		
	} // end method doPost

} // end Class LoginServlet
