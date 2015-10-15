package general;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.hibernate.HibernateConfiguration;

public class Project {

	public static void main(String[] args) {
		Session session = HibernateConfiguration.getSessionFactory().openSession();
		
		SQLQuery result = session.createSQLQuery("SELECT * FROM book");
		List<Object []> resultObj =result.list();
		
		for(Object [] obj : resultObj){
			for(Object ob : obj){
				System.out.println(ob + " ");
			}
		}
		session.close();
	}

}
