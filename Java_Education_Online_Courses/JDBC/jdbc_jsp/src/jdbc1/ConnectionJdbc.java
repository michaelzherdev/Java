package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class ConnectionJdbc {

	private Connection connect;
	
	public ConnectionJdbc(){}
	
	public void init(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/lesson",
						"root", "");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void close(){
		try {
			connect.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection(){
		return connect;
	}
}
