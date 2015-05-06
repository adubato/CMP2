

public class Rectangle {
	
	private double length_, width_;
	private static int count = 0;
	
	public Rectangle (double length, double width) {
		length_ = length;
		width_ = width;
		count++;
	}
	
	public Rectangle() {
		length_ = 0;
		width_ = 0;
		count++;
	}
	
	public void Reactangle(Rectangle R) {
		length_ = R.length_;
		width_ = R.width_;
		count++;
	}
	
	public double area() {
		return length_ * width_;
	}
	
	public double getLength() {
		return length_;
	}
	
	public double getWidth() {
		return width_;
	}
	
	public String toString() {
		String s = new String("Rectangle: " + length_ + " : " + width_);
		return s;
	}

	public boolean equals(Rectangle R) {
		return length_ == R.length_ && width_ == R.width_;
	}
	
	public int hashCode() {
		return new Double(length_).hashCode() ^ new Double(width_).hashCode();
	}
	
	public static int getCount() {
		return count;
	}
	
	//-----------------------------------------------------------------------
	
	public static void testRectangle() {
		Rectangle R = new Rectangle(5.0, 2.0);
		Rectangle R2 = new Rectangle(5.0, 2.0);
		System.out.println("Area of rectanlge with length " + R.getLength() + " and width " + R.getWidth() + " is " + R.area());
		System.out.println("toString R " + R.toString());
		System.out.println("toString R2 " + R2.toString());
		System.out.println("isEqual " + (R.equals(R2)));
		System.out.println("count = " + Rectangle.getCount());
	}
	
	public static void main(String [] args) {
		testRectangle();
	}
	
	
}
