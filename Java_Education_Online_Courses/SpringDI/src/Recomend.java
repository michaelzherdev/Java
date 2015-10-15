import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class Recomend implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation inv) throws Throwable {
		
		System.out.println("Before the method");
		Object res = null;
		res = inv.proceed();
		System.out.println("After the method");
		return null;
	}

}
