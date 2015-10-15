// Применение методов доступа для установки и 
// получения значений закрытых переменных

class TwoDShape {
	private double width;
	private double height;
	
	TwoDShape() {
		width = height = 0.0;
	}
	
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	
	TwoDShape(double x) {
		width = height = x;
	}
	// построение одного объекта на основании другого
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
	}
	
	// Методы доступа к переменным экземпляра width & height
	double getWidth() {return width;}
	double getHeight() {return height;}
	void setWidth(double w) {width = w; }
	void setHeight(double h) {height = h; }
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
}

// Класс Triangle наследует от класса TwoDShape
class Triangle extends TwoDShape {
	// Constructor:
	private String style;
	
	Triangle() {
		super();
		style =  "null";
	}
	
	Triangle(String s, double w, double h) {
		super(w, h);
		style = s;
	}
	
	Triangle(double x) {
		super(x);
		style = "isoscales";
	}
	// построить один объект на основании другого
	Triangle(Triangle ob) {
		super(ob);
		style = ob.style;
	}
	
	double area() {
		return getWidth() * getHeight() / 2;
	}
	
	void showStyle() {
		System.out.println("Triangle is " + style);
	}
}

class Shapes2 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle("isoscales", 4.0, 4.0);
		Triangle t2 = new Triangle("right", 8.0, 12.0);
		Triangle t3 = new Triangle(t2);
		/*
		t1.setWidth(4.0);
		t1.setHeight(4.0);
		t1.style = "isoscales";
		
		t2.setWidth(8.0);
		t2.setHeight(12.0);
		t2.style = "right";
		*/
		System.out.println("Info for t1: ");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		
		System.out.println();
		
		System.out.println("Info for t2: ");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		
		System.out.println();
		
		System.out.println("Info for t3: ");
		t3.showStyle();
		t3.showDim();
		System.out.println("Area is " + t3.area());
		
	}

}
