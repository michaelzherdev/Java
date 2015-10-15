package org.mzherdev;

public class Triangle {

	private String type;
	
	public void draw() {
		System.out.println(getType() + " Triangle draw");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
