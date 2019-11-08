/**
 * 
 */
package com.pillion.service;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Component;


/**
 * @author Hektor
 *
 */
@Component
public class LoginService {
	
	public boolean authenticate(String usr, String pwd) {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/testlogin","root","root");  
			PreparedStatement ps = con.prepareStatement("select * from user where name = ? and password = ?");
			ps.setString(1, usr);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				return true;
			}
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return false;
	}
}
