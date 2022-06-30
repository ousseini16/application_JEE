package com.login;
import java.sql.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		

		     
			
//			Class.forName("com.mysql.cj.jdbc.driver");
//			Connection con = DriverManager.getConnection(url,user,pwd);
//			PreparedStatement pst = con.prepareStatement("SELECT id FROM users WHERE login=? AND password=? ");
//			pst.setString(1, login);
//			pst.setString(2, password);
//			ResultSet rs = pst.executeQuery();
//			if(rs.next()) {
//				session.setAttribute("login",login);
//				response.sendRedirect("index.jsp");
//				
//				
//			} else response.sendRedirect("auth.jsp");
//			pst.close();
//			con.close();
//			rs.close();
			
		
				
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		request.getRequestDispatcher("/WEB-INF/auth.jsp").forward(request, response);
	}

}
