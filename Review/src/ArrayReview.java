
public class ArrayReview {

	//mid-term question
	public static String getLast(String[] x) {
		return x[x.length - 1];
	}
	
	//mid-term question
	public static String getFirst(String[] x) {
		return x[0];
	}
	
	//mid-term question
	public static int find(String [] x, String pattern) {
		for(int i = 0; i < x.length ; i++ ) {
		    if(x[i].equals(pattern))
		    	return i;
		}
		return -1;
	}
	
	//mid-term question
	public static int sum(int [] x) {
		int sum = 0;
		for(int i : x) {
			sum += i;
		}
		return sum;
	}
	
	//mid-term question
	public static int maxValue(int [] x) {
		int max = x[0];
		for(int i = 1 ; i < x.length ; i++) {
		    if (x[i] > max)
		    	max = x[i];
		}
		return max;
	}
	
	
	public static void walk(int [] x) {
		for(int i : x) {
			System.out.println(x[i] + " ");
		}
	}
	
	
	public static void main(String[] args) {

	}

}
