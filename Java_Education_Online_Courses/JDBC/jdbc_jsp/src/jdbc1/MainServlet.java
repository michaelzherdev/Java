package jdbc1;

import java.util.List;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MainServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private Connection conn;
	private ConnectionJdbc connJdbc;
	
	public void init(){
		connJdbc = new ConnectionJdbc();
		connJdbc.init();
		conn = connJdbc.getConnection();
		
		connJdbc.close();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		List<Book> books = new ArrayList<Book>();
		
		try(	Connection conn = connJdbc.getConnection();
				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM book");
				ResultSet rs = pstmt.executeQuery();
				){
			
			
			while(rs.next()){
				Book book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title"));
				book.setDescription(rs.getString("description"));
				book.setIsbn(rs.getInt("isbn"));
				
				books.add(book);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		req.setAttribute("books", books);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/list.jsp");
		dispatcher.forward(req, resp);
	}



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}



	public static void main(String[] args) {
	}

}
