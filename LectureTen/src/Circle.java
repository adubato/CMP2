
public class Circle extends Shape {

	private double radius;
	
	public Circle() {
		radius = 0;
	}
	
	public Circle(double r) {
		radius = r;
	}
	
	public Circle(double r, long id) {
		super(id);
	}
	
	public Circle(Circle C) {
		radius = C.radius;
	}

	public double area() {
		return Math.PI * (radius * radius);
	}
	
	public double getRadius() {
		return radius;
	}

	public static void main(String[] args) {
		Shape S0 = new Circle(5);
		System.out.println(S0.area());
	}

}
