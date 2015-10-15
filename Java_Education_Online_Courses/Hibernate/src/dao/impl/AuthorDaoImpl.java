package dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;

import com.hibernate.HibernateConfiguration;

import tables.Author;
import tables.Book;
import dao.AuthorDao;

public class AuthorDaoImpl implements AuthorDao{

	@Override
	public void addAuthor(Author author) throws SQLException {
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(author);
			session.getTransaction().commit();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
		
	}

	@Override
	public void deleteAuthor(Author author) throws SQLException {
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(author);
			session.getTransaction().commit();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
		
	}

	@Override
	public Author getAuthor(int id) throws SQLException {
		Author result = null;
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			result = (Author) session.get(Author.class, id);
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
		return result;
	}

	@Override
	public List<Author> addAuthors() throws SQLException {
		List<Author> authors = null;
		Session session = null;
		try{
			session = HibernateConfiguration.getSessionFactory().openSession();
			authors = session.createCriteria(Book.class).list();
		} catch(Exception e){
			e.printStackTrace();
		} finally{
			if((session != null) && (session.isOpen()))
				session.close();
		}
		
		return authors;
	}

}
