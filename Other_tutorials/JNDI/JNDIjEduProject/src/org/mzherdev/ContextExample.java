package org.mzherdev;

import java.io.File;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

import javax.naming.Binding;
import javax.naming.CompositeName;
import javax.naming.CompoundName;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;

public class ContextExample {

	public static void main(String[] args) throws NamingException {
		Hashtable<String, String> enviroment = new Hashtable<String, String>();
		enviroment.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
		enviroment.put(Context.PROVIDER_URL, "file:/E:/");
		
		Context context = new InitialContext(enviroment);
		
		/*********************/
		
//		Monkey monkeySteven = new Monkey("steven", "banana", true);
//		context.bind("monkey steven", monkeySteven);
//		
////		Monkey monkeySteven = new Monkey("another steven", "orange", false); 
//		context.rebind("monkeysteven", new Monkey("steven", "banana", true));
		
//		context.unbind("monkeysteven");
		
		/*********************/
//		Object monkeySteven = context.lookup("monkeysteven");
//		System.out.println(monkeySteven.getClass().getName());
//		System.out.println(monkeySteven);
		
		/*********************/

//		context.createSubcontext("a new one");
//		context.destroySubcontext("a new one");
		
		/*********************/
		
//		Enumeration<NameClassPair> contentData = context.list(""); // for all
//		while(contentData.hasMoreElements()) {
//			NameClassPair classPair = contentData.nextElement();
//			System.out.format("%s | %s\n", classPair.getName(), classPair.getClassName());
//		}
		
//		NamingEnumeration<Binding> contData = context.listBindings("Books");
//		while(contData.hasMore()) {
//			Binding binding = contData.next();
//			System.out.format("%s | %s", binding.getName(), binding.getClassName());
//			if(binding.getObject() instanceof File) {
//				System.out.format(" | size %s bytes", ((File)binding.getObject()).length());
//			}
//			System.out.println();
//		}
		
		/********** NAME ***********/
		
//		CompositeName name = new CompositeName();
//		name.add("first.name");
//		name.add("second\\name");
//		System.out.println(name);		
////		context.lookup("first.name/second\name");
		
		
//		Properties properties = new Properties();
//		properties.put("jndi.syntax.direction", "right_to_left");
//		properties.put("jndi.syntax.separator", ",");
//		properties.put("jndi.syntax.escape", ":");
//		
//		CompoundName compoundName = new CompoundName("someComponent,another::Component,and:another:one", properties);
//		Enumeration<String> components = compoundName.getAll();
//		while(components.hasMoreElements()) {
//			System.out.println(components.nextElement());
//		}
		
		/********** NAME ***********/
//		Context dropbox = (Context) context.lookup("Books");
//		Context photos = (Context) dropbox.lookup("Code");
//		System.out.println(photos.getNameInNamespace());
//		
//		String name = dropbox.composeName("Code", "Books");
//		System.out.println(name);
//		
//		name = photos.composeName("Sample Album", name);
//		System.out.println(name);
//		
//		Context sampleAlbum = (Context) photos.lookup("Sample Album");
//		name = sampleAlbum.composeName("Some Name.txt", name);
//		System.out.println(name);
	}

}
