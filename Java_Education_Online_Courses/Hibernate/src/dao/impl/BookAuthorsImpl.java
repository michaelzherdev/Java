package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import tables.Book;

import com.hibernate.BookAuthors;
import com.hibernate.HibernateConfiguration;

import dao.BookAuthorDao;

public class BookAuthorsImpl implements BookAuthorDao{

	@Override
	public void addBookAuthors(BookAuthors bookAuthor) throws SQLException {
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(bookAuthor);
			session.getTransaction().commit();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
	}

	@Override
	public List<BookAuthors> getBookAuthors() throws SQLException {
		List<BookAuthors> bookAuthors = null;
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			bookAuthors = session.createCriteria(Book.class).list();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
		
		return bookAuthors;
	}
	
}
