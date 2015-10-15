package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class DBConnection {
	
	private String host;
	private String root;
	private String password;
	private String nameDb;
	private String url;
	
	private Properties properties = new Properties();
	private Connection mysqlConnection;
	
	public DBConnection(String host, String root, String password, String nameDb) {
		this.host = host;
		this.root = root;
		this.password = password;
		this.nameDb = nameDb;
	}
	
	public DBConnection(String url, Properties properties){
		this.properties = properties;
		this.url = url;
	}
	
	public void initProperties(){
		
		url = "jdbc:mysql://" + host + "/" + nameDb;
		
		properties.setProperty("user", root);
		properties.setProperty("password", password);
		properties.setProperty("characterEncoding", "UTF-8");
		properties.setProperty("useUnicode", "true");
		
		System.out.println("URL: " + url);
	}
	
	public void init(){
		if(mysqlConnection == null){
			try {
				Class.forName("com.mysql.jdbc.Driver");
				mysqlConnection = DriverManager.getConnection(url);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void finalize(){
		try {
			mysqlConnection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet query(String query){
		ResultSet resultSet = null;
		try {
			Statement stmt = mysqlConnection.createStatement();
			resultSet = stmt.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return resultSet;
	}
	
	public void updateQuery(String query){
		try {
			Statement stmt = mysqlConnection.createStatement();
			stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
