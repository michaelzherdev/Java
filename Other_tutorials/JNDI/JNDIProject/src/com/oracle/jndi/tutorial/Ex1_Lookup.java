package com.oracle.jndi.tutorial;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Ex1_Lookup {
	public static void main(String[] args) throws NamingException {
		String name = "Temp";
		Hashtable env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
		Context ctx = new InitialContext(env);
		
//		Enumeration list = ctx.list("");
//		while(list.hasMoreElements())
//		System.out.println(list.nextElement());
		
		Object obj = ctx.lookup(name);
		System.out.println(name + " is bound to: " + obj);
	}

}
