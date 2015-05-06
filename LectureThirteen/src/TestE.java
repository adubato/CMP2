import java.util.Scanner;
import java.io.*;

public class TestE {
	
	public static void fileInput(String filename) throws FileNotFoundException {
		File file = new File(filename);
		Scanner scanner = new Scanner(file);
		
		while(scanner.hasNext()) {
			String s = scanner.next();
			System.out.println(s);
		}
	}
	
	public static void fileIO(String filename) {
		try {
			fileInput(filename);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void test2() {
		int count = 0;
		Scanner scan = new Scanner( System.in );
		int sum = 0;
		
		while( count++ < 5 ) {
			String s = scan.next();
			try {
			Integer i = Integer.parseInt(s);
			sum += i;
			}
			catch(NumberFormatException e) {
				System.out.println(e + " exception caught in test1" );
			}
		}
		
		System.out.println(sum);
	}
	
//<<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>><<>>\\
	
	public static void main(String[] args) {
		//String filename = args.length == 0 ? "abc"
		fileIO(args[0]);
		test2();
	}
	
}
