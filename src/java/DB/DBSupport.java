/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.*;
import java.util.Properties;

/**
 *
 * @author ervin
 */
public class DBSupport {
    public static Connection establishConnection() throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
	Connection connect = null;
	Properties connectProp = new Properties();
	connectProp.put("dbms","mysql");
	connectProp.put("user", "root");
	connectProp.put("password","Sqlroot1231#");
	connectProp.put("useSSL", "false");
		
	String P1 = "jdbc:";
	String P2 = "mysql";
	String P3 = "://";
	String P4 = "localhost:";
	int Port = 3306;
	String P5 = "/";
	String connectString = P1 + P2 + P3 + P4 + Port + P5;
	connect = DriverManager.getConnection(connectString,connectProp);
	System.out.println("Connected to Database");
	return connect;		
    }
        
}
