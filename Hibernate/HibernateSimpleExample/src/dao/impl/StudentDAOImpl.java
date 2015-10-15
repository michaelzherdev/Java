package dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;

import util.HibernateUtil;
import logic.Student;
import dao.StudentDAO;

public class StudentDAOImpl implements StudentDAO{

	@Override
	public void addStudent(Student student) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	@Override
	public void updateStudent(Student student) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(student);
			session.getTransaction().commit();
		}	catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
			} finally {
				if (session != null && session.isOpen()) {
					session.close();
				}
			}
	}

	@Override
	public Student getStudentById(Long id) throws SQLException {
		Session session = null;
		Student student = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			student = (Student) session.load(Student.class, id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return student;
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		Session session = null;
		List<Student> students = new ArrayList<Student>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			students = session.createCriteria(Student.class).list();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		return students;
	}

	@Override
	public void deleteStudent(Student student) throws SQLException {
		Session session = null;
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			session.beginTransaction();
			session.delete(student);
			session.getTransaction().commit();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
	}

	
}
