package local.tagavatar.server;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.*;

public class default_settings {
	
	/**
	 * @param args
	 */
	private String mysql_username="";
	private String mysql_password="";
	private String mysql_db="";
	private String mysql_url="jdbc:mysql://localhost:3306/"+mysql_db;
	private Connection con;
	
	public default_settings(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			this.con=DriverManager.getConnection(this.mysql_url,this.mysql_username,this.mysql_password);
		}catch(Exception e){
			
		}
	}
	
	public Connection get_connection(){
		return this.con;
	}
}
