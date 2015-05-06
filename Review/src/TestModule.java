
public class TestModule {

	public static void print(Object ... objects) {
		for(int i = 0; i < objects.length; i++) {
			System.out.print(objects[i] + " ");
		}
		System.out.println("");
	}
	
	public static void StringTest() {
		String[] fruits = {"Apple", "Banana", "Pear", "Blueberry", "Kiwi"};
		print(fruits);
		print("Fruits.length is",new Integer(fruits.length));
		print("First Element is",ArrayReview.getFirst(fruits),"index is",new Integer(0));
		print("Last  Element is",ArrayReview.getLast(fruits),"index is" , new Integer(fruits.length-1));
		
		int ix = ArrayReview.find(fruits , "Pear");
		if (ix != -1) {
		    print(fruits[ix],"is at index",new Integer(ix));
		}
	}
	
	public static void intTest() {
		int [] x = {10, 28, 43, 14, 55, 68, 74, 82, 91, 10};
		
		print("Sum is " + ArrayReview.sum(x));
		print("Max value is " + ArrayReview.maxValue(x));
		ArrayReview.walk(x);
	}
	
	
	
	
	//**********************************************************************
	public static void main(String[] args) {
		StringTest();
		intTest();
		
	}

}
