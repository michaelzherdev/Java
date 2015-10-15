package general;

import java.sql.SQLException;
import java.util.List;

import tables.Book;
import dao.AuthorDao;
import dao.BookDao;

public class Main {

	public static void main(String[] args) throws SQLException{
		Factory factory = Factory.getInstance();
		BookDao bookDao = factory.getBookDao();
		AuthorDao authorDao = factory.getAuthorDao();
		
		
		Book book = new Book();
		book.setTitle("java tutorial");
		book.setDescription("java description");
		book.setIsbn(32456);
		bookDao.addBook(book);
		/*
		List<Book> books = bookDao.getBooks();
		
		System.out.println();
		
		for(Book book: books){
			System.out.println(book.getId() + " "
		+ book.getIsbn() + " " + book.getTitle() + " " + book.getDescription());
		}
		*/
	}

}
