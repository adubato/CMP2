
public abstract class Shape {
	
	private long id_;
	
	public Shape() {
		id_ = 0;
	}
	
	public Shape(long id) {
		id_ = id;
	}
	
	public Shape(Shape S) {
		id_ = S.id_;
	}
	
	public abstract double area();
	
}
