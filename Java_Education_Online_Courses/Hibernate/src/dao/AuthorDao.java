package dao;

import java.sql.SQLException;
import java.util.List;

import tables.Author;

public interface AuthorDao {
	public void addAuthor(Author author) throws SQLException;
	public void deleteAuthor(Author author) throws SQLException;
	public Author getAuthor(int id) throws SQLException;
	public List<Author> addAuthors() throws SQLException;
	
	
}
