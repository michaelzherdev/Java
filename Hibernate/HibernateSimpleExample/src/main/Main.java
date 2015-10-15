package main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Expression;

import util.HibernateUtil;
import dao.impl.Factory;
import logic.Student;

public class Main {
	public static void main(String[] args) throws SQLException {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("Ivan");
		s1.setAge(28l);
		s2.setName("Marya");
		s2.setAge(24l);
		
//		Factory.getInstance().getStudentDAO().addStudent(s1);
//		Factory.getInstance().getStudentDAO().addStudent(s2);
		
		List<Student> students = Factory.getInstance().getStudentDAO().getAllStudents();
		System.out.println("========Все студенты=========");
		for(int i = 0; i < students.size(); ++i) {
            System.out.println("Имя студента : " + students.get(i).getName() +
            		", Возраст : " + students.get(i).getAge() + 
            		",  id : " + students.get(i).getId());
            System.out.println("=============================");              
    }   
		
		/*
		
		Session session = null;
		List<Student> studs = new ArrayList<Student>();
		try {
			session = HibernateUtil.getSessionFactory().openSession();
			studs = session.createCriteria(Student.class)
					.add(Expression.like("name", "Iv%"))
					.list();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error I/O", JOptionPane.OK_OPTION);
		} finally {
			if (session != null && session.isOpen()) {
				session.close();
			}
		}
		for(Student s :studs) {
			System.out.println(s.getId() + " " + s.getName() + " " + s.getAge());
		}
		
		*/
		
//		Example example = Example.create(s1).excludeZeroes()
//				.excludeProperty("name")
//				.ignoreCase().enableLike();
//		List results = session.createCriteria(Student.class).add(example).list();
	}
}
