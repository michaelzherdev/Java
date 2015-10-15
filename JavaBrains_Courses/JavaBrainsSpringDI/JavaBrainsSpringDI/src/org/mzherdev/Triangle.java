package org.mzherdev;

public class Triangle {

	private String type;
	private int height;
	
	
	public Triangle(String type) {
		this.type = type;
	}

	public Triangle(int height) {
		super();
		this.height = height;
	}

	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}


	public void draw() {
		System.out.println(getType() + " Triangle draw of height " +getHeight());
	}

	
//	for constructor-arg param no setter need
//	public void setType(String type) {
//		this.type = type;
//	}
	
	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}
}
