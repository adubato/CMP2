
public class Circle {

		private double radius_;

		public Circle() {
			radius_ = 0;
		}
		
		public Circle(double r) {
			radius_ = r;
		}
		
		public Circle(Circle C) {
			radius_ = C.radius_;
		}
		
		public boolean equals(Circle C) {
			return radius_ == C.radius_;
		}
		
		public boolean equals(Object C) {
			if(C.getClass() != Circle.class)
				return false;
			return equals((Circle)C);
		}
		
		public String toString() {
			return new String("Circle " + radius_);
		}

	public static void main(String[] args) {
		Circle C0 = new Circle();
		System.out.format("%s", C0.toString());
		
		Circle C1 = new Circle(11.1);
		System.out.format("\n%s", C1.toString());
		
		Circle C1Copy = new Circle(C1);
		
		System.out.format("\n%s", C1Copy.toString());
		
		Object O1 = C1;
		Object O1Copy = C1Copy;

		System.out.format("\n%s", C1.equals(C1Copy));
	}

}
