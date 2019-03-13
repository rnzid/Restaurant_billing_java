/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurants;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Rn zid
 */
public class DBConnect {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/billrecords";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "";
	            // Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/java_class","root","");

	private static Connection connection = null;
	
	public static Connection getConnection(){
		if(connection==null){
			try{
                            	            // Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/projct","root","");

//				//Loading The Driver Class
				Class.forName(DRIVER);
				
				//Getting the connection Object
				connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			}catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		}
		
		return connection;
	}
}
