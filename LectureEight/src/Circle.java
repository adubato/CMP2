
public class Circle extends Shape{
		private double rad_;
	
	public Circle() {
		rad_ = 0;
	}
	
	public Circle(double R) {
		rad_ = R;
	}
	
	public String toString() {
		return new String("Circle " + rad_);
	}
	
	public double area() {
		return Math.PI * (rad_ * rad_);
	}

	public static void main(String[] args) {
		Shape C = new Circle(10);
		Shape R = new Rectangle(5, 5);
		
		System.out.println(C.toString());
		System.out.println(R.toString());
		
	}

}
