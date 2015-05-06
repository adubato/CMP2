
public class CmdArgs 
{
	public static void printArgs(String[] args)
	{
		for(String a : args)
		{
			System.out.println(a);
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("Starting...");
		printArgs(args);
	}
}
