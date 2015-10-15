import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Enumeration;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


public class SimpleJndi {

	public static void main(String[] args) throws NamingException {
		Properties props = new Properties();
		props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.dns.DnsContextFactory");
		props.put ( Context.PROVIDER_URL, "dns://8.8.8.8" ) ; 
		Context context = new InitialContext(props);
		Enumeration names = context.list("");
		while(names.hasMoreElements())
			System.out.println(names.nextElement());
		System.out.println("DONE!");
		
		LocalDateTime date = LocalDateTime.now();
		LocalDateTime date2 = date.plusDays(1000);
		System.out.println(date2);
	}

}
