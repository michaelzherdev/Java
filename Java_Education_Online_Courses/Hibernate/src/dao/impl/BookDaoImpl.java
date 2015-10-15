package dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.Id;

import org.hibernate.Session;

import com.hibernate.HibernateConfiguration;

import dao.BookDao;
import tables.Book;

public class BookDaoImpl implements BookDao{
	public void addBook(Book book) throws SQLException{
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(book);
			session.getTransaction().commit();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
	}
	
	public void deleteBook(Book book) throws SQLException{
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(book);
			session.getTransaction().commit();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
	}
	public Book getBook(int id) throws SQLException{
		Book result = null;
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			result = (Book) session.get(Book.class, id);
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
		return result;
	}
	public List<Book> getBooks() throws SQLException{
		List<Book> books = null;
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			books = session.createCriteria(Book.class).list();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
		
		return books;
	}
}
