import java.util.Arrays;
import java.util.Random;
//this is a test for github
public class arrayTest 
{
	public static void arrayTest()
	{
	int[] x = {0, 1, 2, 3};
	int[] y = x;
	int[] B = Arrays.copyOf(x, x.length);
	Random rand = new Random();
	int[] z = new int[10];
	
	for(int i = 0; i < z.length; i++)
		z[i] = rand.nextInt(100);
	
	Arrays.sort(z);
	print(z);
	
	y[0] = -987;
	
	int first = x[0];
	int last = x[x.length - 1];
	
	int sum = 0;
	for (int i = 0; i < x.length; i++)
		sum += x[i];
	
	swap(x, 0, 1);
	
	System.out.println( "X[0]=" + x[0] + ",X[1]=" + x[1] );
	System.out.println(sum);
	System.out.println(x[0]);
	System.out.println(x.length);
	System.out.println(first + " " + last);
	}
	
	static public void swap(int[] A, int i, int j) 
	{
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
	
	static public void print(int[] A)
	{
		for (int a:A) System.out.println(a + " ");
		System.out.println(" ");
	}
	
	public static void main( String [] args)
	{
		arrayTest();
	}
}
