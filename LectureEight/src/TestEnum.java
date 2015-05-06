
public class TestEnum {
	
	static double Temp(Seasons S) {
		switch (S) {
			case Winter : return 20.0;
			case Spring : return 55.0;
			case Summer : return 80.0;
			case Fall : return 45.0;
			default : return 50.0;
		}
	}
	
	static void print(Seasons s) {
		System.out.println(s.toString() + " average temp " + Temp(s));
	}

	public static void main(String[] args) {
		System.out.println(Seasons.Fall.toString() + " " + Seasons.Fall.ordinal());
		print(Seasons.Winter);
		print(Seasons.Spring);
		print(Seasons.Summer);
		print(Seasons.Fall);

	}

}
