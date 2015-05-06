
public class Rectangle extends Shape {
	
	private double length, width;

	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle(double L, double W) {
		length = L;
		width = W;
	}
	
	public Rectangle(Rectangle R) {
		length = R.length;
		width = R.width;
	}

	public double area() {
		return length * width;
	}

	public double getLength() {
		return length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public static void printShape(Shape S) {
		Rectangle R = (Rectangle)S;
		System.out.println(R.getLength());
	}
	
	//Superclass takes on behavior of method in subclass
	
	public static void main(String[] args) {
		Shape S0 = new Rectangle(5, 5);
		Shape S1 = new Circle(5);

		System.out.println(S0.area() + " " + S1.area());
	}

}
