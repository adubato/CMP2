import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Reader 
{

public void ReadFile(String file) 
{
	ArrayList<String> aList = new ArrayList<String>();
	File fileHandle = new File(file);
	if ( !fileHandle.exists() ) 
	{
		System.out.println("Going to throw an exception" );
	}
	try {
		Scanner scan = new Scanner(fileHandle);
	while( scan.hasNextLine()) {
		aList.add( scan.nextLine());
	}
		scan.close();
	}
	catch ( java.io.FileNotFoundException e) {
		System.out.println(e.toString());
	}
	String [] sArray = new String[aList.size()];
	aList.toArray(sArray);
}

public static void main(String[] args)
{
	Reader reader = new Reader();
	reader.ReadFile(args[0]);
}

}