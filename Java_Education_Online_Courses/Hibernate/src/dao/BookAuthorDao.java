package dao;

import java.sql.SQLException;
import java.util.List;

import com.hibernate.BookAuthors;

public interface BookAuthorDao {
	public void addBookAuthors(BookAuthors bookAuthor) throws SQLException;
	public List<BookAuthors> getBookAuthors() throws SQLException;
}
