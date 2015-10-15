package org.mzherdev;

import javax.naming.NamingException;
import javax.naming.Reference;
import javax.naming.Referenceable;
import javax.naming.StringRefAddr;

public class Monkey implements Referenceable {
	private String name;
	private String favouriteFruit;
	private boolean likesBananas;
	
	public static final String NAME = "name";
	public static final String FAVOURITE_FRUIT = "favouriteFruit";
	public static final String LIKES_BANANAS = "likesBananas";
	
	public Monkey(String name, String favouriteFruit, boolean likesBananas) {
		super();
		this.name = name;
		this.favouriteFruit = favouriteFruit;
		this.likesBananas = likesBananas;
	}
	
	public Monkey() {
		super();
	}



	public String getName() {
		return name;
	}
	public String getFavouriteFruit() {
		return favouriteFruit;
	}
	public boolean isLikesBananas() {
		return likesBananas;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFavouriteFruit(String favouriteFruit) {
		this.favouriteFruit = favouriteFruit;
	}
	public void setLikesBananas(boolean likesBananas) {
		this.likesBananas = likesBananas;
	}

	@Override
	public Reference getReference() throws NamingException {
		Reference reference = new Reference(Monkey.class.getName(), MonkeyFactory.class.getName(), null);
		reference.add(new StringRefAddr(NAME, this.name));
		reference.add(new StringRefAddr(FAVOURITE_FRUIT, this.favouriteFruit));
		reference.add(new StringRefAddr(LIKES_BANANAS, Boolean.toString(this.likesBananas)));
		return reference;
	}

	@Override
	public String toString() {
		return "Monkey(" + "name: " + name + ", favouriteFruit: " +
				favouriteFruit + ", likesBananas: " + likesBananas + ")";
	}
	
	
	
	
}
