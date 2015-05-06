public class Point {
	
		public int x;
		public int y;
		public static int z;

	public Point() {
		x = 0;
		y = 0;
		z++;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		z++;
	}
	
	public Point(Point o) {
		this.x = o.x;
		this.y = o.y;
		z++;
	}
       
	public static void setZ(int p) {
		z = p;
	}

	public static void main(String [] args){
		Point p0 = new Point();
        Point p1 = new Point(11, 3);
        Point pCopy = new Point(p1);
        System.out.println("p0: " + p0.x + " " + p0.y);
        System.out.println("p1: " + p1.x + " " + p1.y);
        System.out.println("pCopy: " + pCopy.x + " " + pCopy.y);
        setZ(100);
	}
	
/*
 * Static variables are initialized to 0 and there is only one of them.
	(i) How many instances of z are there? 1
	(ii) What is(are) the value(s) of z? 0, 1, 2, 3
	(iii) How many instances of x are there? 3
	(iv) What is(are) the value(s) of x? 0, 11
*/
}
