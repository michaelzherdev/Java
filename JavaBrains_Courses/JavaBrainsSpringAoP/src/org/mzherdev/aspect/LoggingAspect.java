package org.mzherdev.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//@Aspect
public class LoggingAspect {
	
//	@Before("execution(public String getName())")
//	for concrete method:
//	@Before("execution(public String org.mzherdev.model.Circle.getName())")
//	for every getter:
//	@Before("execution(public * get*(..))")
//	@Before("allGetters()")
//	@Before("allGetters() && allCircleMethods()")
//	public void loggingAdvice() {
//		System.out.println("Advice run. Get method called.");
//	}
	
////	JoinPoints and Advice Arguments
//	@Before("allCircleMethods()")
//	public void loggingAdvice(JoinPoint joinPoint) {
//		System.out.println(joinPoint.getTarget());
//	}
//	
////	@Before("execution(* get*())")
//////	@Before("allGetters()")
////	public void secondAdvice() {
////		System.out.println("Second advice executed. Get method called.");
////	}
//	
//	@AfterReturning("args(String)")
//	public void stringArgumentMethod() {
//		System.out.println("a method that takes String argument has been called");
//	}
//	
//	@AfterThrowing("args(name)")
//	public void exceptionThrower() {
//		System.out.println("An exception has been thrown");
//	}
//	
//	@Around("execution(* get*())")
//	public void myAroundAdvice(ProceedingJoinPoint joinPoint) {
//		
//		try {
//			System.out.println("Before advice");
//			joinPoint.proceed();
//			System.out.println("After returning");
//		} catch (Throwable e) {
//			System.out.println("After throwing");
//		}
//		System.out.println("After finally");
//	}
	
//	@Around("allGetters()")
	public Object myAroundAdviceWithOnject(ProceedingJoinPoint joinPoint) {
		Object returningValue = null;
		
		try {
			System.out.println("Before advice");
			returningValue = joinPoint.proceed();
			System.out.println("After returning");
		} catch (Throwable e) {
			System.out.println("After throwing");
		}
		System.out.println("After finally");
		return returningValue;
	}
	
//	@Pointcut("execution(* get*())")
//	public void allGetters() {}
//	
////	@Pointcut("execution(* * org.mzherdev.model.Circle.*(..))") equals to:
//	@Pointcut("within(org.mzherdev.model.Circle)")
//	public  void allCircleMethods() {}
	

}
