
public class Rectangle extends Shape{
	private double len_, wid_;
	
	public Rectangle () {
		len_ = 0;
		wid_ = 0;
	}
	
	public Rectangle(double L, double W) {
		len_ = L;
		wid_ = W;
	}
	
	public String toString() {
		return new String("Rectangle " + len_ + " " + wid_);
	}
	
	public double area() {
		return len_ * wid_;
	}

}
