// —оздание абстрактного класса
abstract class TwoDShape {
	private double width;
	private double height;
	private String name;
	
	TwoDShape() {
		width = height = 0.0;
		name = "null";
	}
	
	TwoDShape(double w, double h, String n) {
		width = w;
		height = h;
		name = n;
	}
	
	TwoDShape(double x, String n) {
		width = height = x;
		name = n;
	}
	// построение одного объекта на основании другого
	TwoDShape(TwoDShape ob) {
		width = ob.width;
		height = ob.height;
		name = ob.name;
	}
	
	// ћетоды доступа к переменным экземпл€ра width & height
	double getWidth() {return width;}
	double getHeight() {return height;}
	void setWidth(double w) {width = w; }
	void setHeight(double h) {height = h; }
	
	String getName() {return name;}
	
	void showDim() {
		System.out.println("Width and height are " + width + " and " + height);
	}
	
	abstract double area(); // абстрактный метод area()
}

//  ласс Triangle наследует от класса TwoDShape
class Triangle extends TwoDShape {
	private String style;
	
	Triangle() {
		super();
		style =  "null";
	}
	
	Triangle(String s, double w, double h) {
		super(w, h, "triangle");
		style = s;
	}
	
	Triangle(double x) {
		super(x, "triangle");
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

class Rectangle extends TwoDShape {
	Rectangle() {
		super();
	}
	
	Rectangle(double w, double h) {
		super(w, h, "rectangle");
	}
	
	Rectangle(double x) {
		super(x, "rectangle");
	}
	
	Rectangle(Rectangle ob) {
		super(ob);
	}
	
	boolean isSquare() {
		if(getWidth()==getHeight()) return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeight();
	}
}

class Circle extends TwoDShape{
	Circle() {
		super();
	}
	
	Circle(double x) {
		super(x, "circle");
	}
	
	Circle(Circle ob) {
		super(ob);
	}
	
	double area() {
		return Math.PI * (getHeight() * getHeight()) / 2;
	}
}

class AbsShape {
	public static void main(String[] args) {
		TwoDShape shapes[] = new TwoDShape[5];
		shapes[0] = new Triangle("right", 8.0, 12.0);
		shapes[1] = new Rectangle(10);
		shapes[2] = new Rectangle(10, 4);
		shapes[3] = new Triangle(7.0);
		shapes[4] = new Circle(2.0);
		
		for(int i = 0 ; i<shapes.length; i++) {
			System.out.println("Object is " + shapes[i].getName());
			System.out.println("Area is " + shapes[i].area());
			System.out.println();
		}
	}
}
