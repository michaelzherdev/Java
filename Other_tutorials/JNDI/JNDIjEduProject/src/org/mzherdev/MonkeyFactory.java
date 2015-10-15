package org.mzherdev;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;

public class MonkeyFactory implements ObjectFactory{

	@Override
	public Object getObjectInstance(Object obj, Name name, Context nameCtx,
			Hashtable<?, ?> environment) throws Exception {
		if(!(obj instanceof Reference)) {
			return null;
		}
		Reference reference = (Reference) obj;
		if(!(Monkey.class.getName().equals(reference.getClassName()))) {
			return null;
		}
		Monkey monkey = new Monkey();
		
		Enumeration<RefAddr> addresses = reference.getAll();
		
		while(addresses.hasMoreElements()) {
			RefAddr address = addresses.nextElement();
			switch(address.getType()) {
			case Monkey.NAME :
				monkey.setName((String) address.getContent());
				break;
			case Monkey.FAVOURITE_FRUIT :
				monkey.setFavouriteFruit((String) address.getContent());
				break;
			case Monkey.LIKES_BANANAS :
				monkey.setLikesBananas(Boolean.valueOf((String) address.getContent()));
				break;
			}
			
		}
		
		return null;
	}
	
	

}
