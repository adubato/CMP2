import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class StudentInfo {

	public String lastName_;
	public String firstName_;
	public long id_;
	public double gpa_;
	public int gradYear_;
	
	public StudentInfo() {
		//id_;
		//gpa_;
		//gradYear_;
	}
	
	public void setFromInput( String input ) throws StudentInfoException {
		String [] fields = input.split( "," );
		
		if( fields.length != 5 ) {
			throw new StudentInfoException( "Expecting 5 Fields" ); 
		}
		
		int i = 0;
		lastName_ = fields[i++];
		firstName_ = fields[i++];
		try {
		id_ = Long.parseLong( fields[i++] );
		gpa_ = Double.parseDouble( fields[i++] );
		gradYear_ = Integer.parseInt( fields[i++] );
		}
		catch(NumberFormatException e) {
			throw new StudentInfoException( "Bad Field " + e.toString() );
		}
	}
	
	public static ArrayList<StudentInfo> read( String file ) {
		ArrayList<StudentInfo> students = new ArrayList<StudentInfo>();
		try {
			File f = new File( file );
			Scanner scan = new Scanner( f );
			while( scan.hasNextLine() ) {
				String line = scan.nextLine();
				students.add(student);
			}
			catch( StudentInfoException e ) {
				System.out.println( "Bad data " + line );
			}
		}
	}
	
	public String toString() {
		String s = new String();
		s += "Last:" + lastName_;
		s += " First:" + firstName_;
		s += " ID:" + id_;
		s += " GPA:" + gpa_;
		s += " Year:" + gradYear_;
		return s;
	}
	
	public static void main(String[] args) {
		try {
		StudentInfo s = new StudentInfo();
		s.setFromInput( "Adubato,Michael,bad1205,4.0,2016" );
		System.out.println( s.toString() );
		}
		catch( Exception e ) {
			System.out.println( e );
		}
	}

}
