
public class DynamicCircle extends Shape implements Scale {

	private double radius_;
	
	public DynamicCircle(double r) {
		radius_ = r;
	}
	
	public String toString() {
		return new String("DynamicCircle radius: " + radius_ + " area: " + area());
	}
	
	public void increase(double pct) {
		radius_ *= 1.0 + pct;

	}

	public void decrease(double pct) {
		radius_ *= 1.0 - pct;
	}

	public double area() {
		return Math.PI * (radius_ * radius_);
	}
	
	public static void print(Object C) {
		System.out.println(C);
	}
	
	public static void scaleOut(Scale s) {
		for(double x = 0; x <= .5; x += .1) {
			s.increase(x);
			print(s);
		}
	}
	
	public static void main(String[] args) {
		DynamicCircle C = new DynamicCircle(5);
		print(C);
		
		scaleOut(C);
	}

}
