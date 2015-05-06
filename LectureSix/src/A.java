
public class A {

	public static int X;
	public int a;
	
	public void changeA() {
		a++;
	}
	
	public static void changeX() {
		X++;
	}
	
	public static void main(String[] args) {
		A.X = 5;
		
		A a0 = new A();
		a0.a = 3;
		
		A a1 = new A();
		a1.a = 33;
		
		a1.changeA();
		
		changeX();
		
		System.out.format("%2d %2d %2d", A.X, a0.a, a1.a);
	}

}
