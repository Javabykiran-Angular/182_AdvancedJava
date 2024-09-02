package com.tka.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import com.tka.dao.MainDao;
import com.tka.entity.User;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	System.out.println("U r in doPost Method");
		User user=new User();
		String username= request.getParameter("username");
		String password=request.getParameter("password");
		user.setUsername(username);
		user.setPassword(password);
		//System.out.println(user);
		
		MainDao dao=new MainDao();
		User u= dao.login(user);
		
		
		
		if(Objects.isNull(u)) {
			System.out.println("Invalid User");
			RequestDispatcher rd= request.getRequestDispatcher("login.jsp");
			PrintWriter pw= response.getWriter();
			response.setContentType("text/html");
			pw.write("<h2 style='color:red;' > Invalid User</h2>");
			rd.include(request, response);
		}else {
			System.out.println("Valid User");
			HttpSession session= request.getSession();
			session.setAttribute("myusername",u.getUsername() );
//			RequestDispatcher rd= request.getRequestDispatcher("DashboardServlet");
//			rd.forward(request, response);
			response.sendRedirect("DashboardServlet");
		}
		
		
	}

}
