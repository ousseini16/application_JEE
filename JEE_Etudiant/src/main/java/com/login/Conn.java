package com.login;

import java.sql.*;


public class Conn {

	public static void main(String[] args)  {

		try {
			    
			Class.forName("com.mysql.cj.jdbc.Driver");// chargement_pilot 
		
			// creation_des_connection//
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jee.etudiant","root","");
			// creation d'etat //
		
			Statement st = con.createStatement();
			
	
			ResultSet res= st.executeQuery("select * from etudiant");
			 
	
		
		
			
			while (	res.next()) {
				
				System.out.println("Nom: " +res.getString(2));
				
			}
			
		
		res.close();
			
			
		}
			
	 catch(Exception e) {
				// TODO: handle exception
			System.out.println(e);
	 
	 }
		
		
		
	}


}

