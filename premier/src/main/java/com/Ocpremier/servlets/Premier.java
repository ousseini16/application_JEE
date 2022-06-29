package com.Ocpremier.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.models.User;


@WebServlet("/Premier")
public class Premier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Premier() {
        super();
      
    } 

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		request.getRequestDispatcher("/WEB-INF/loging.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println("Email :"+ email + "Password :"  + password);
		
		if (email.equals("ousseinioudo16@gmail.com") && password.equals("123456")) {
			System.out.println("Bonne authentification");
			request.getSession().setAttribute("User", new User(email,password));
			response.sendRedirect("converter");
		}
		 else {
			
			System.out.println("Mauvaise authentification");
			response.sendRedirect("loging");
		}
	}

}
