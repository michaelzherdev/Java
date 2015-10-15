package com.oracle.jndi.tutorial;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;

//This example shows you how to write a program that retrieves
//attributes from a directory object. It uses an LDAP service provider
//to access an LDAP service.

public class Ex2_Getattr {
	public static void main(String[] args) throws NamingException {
		Hashtable env = new Hashtable();
		env.put(Context.INITIAL_CONTEXT_FACTORY,  "com.sun.jndi.ldap.LdapCtxFactory");
		env.put(Context.PROVIDER_URL, "ldap://localhost:389/o=JNDITutorial");
		
		DirContext ctx = new InitialDirContext(env);
		
		Attributes attrs = ctx.getAttributes("cn = Ted Geisel, ou=People");
		
		System.out.println("sn: " + attrs.get("sn").get());
		
	}

}
