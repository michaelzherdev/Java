import org.apache.log4j.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainS {
	
	private static String LOG_PROPERTIES_FILE = "./conf/log4j.properties";
	private static Logger logger = Logger.getLogger(MainS.class);

	public static void main(String[] args) {
		Config conf = new Config(LOG_PROPERTIES_FILE);
		conf.init();

		logger.info("Program runs...");
		
		ApplicationContext actx = new ClassPathXmlApplicationContext("bean.xml"); 
		
		IPrintf ptr = (IPrintf) actx.getBean("print");
//		Single single = (Single) actx.getBean("single");
		Single single = (Single) actx.getBean("proxy");
								
		ptr.printf();
		double res = single.pow(7);
		System.out.println(res);
		
		single.printList();
	}

}
