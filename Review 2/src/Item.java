
public class Item {

	public String description;
	public double inventory;
	public double price;
	
	public Item() {
		description = "";
		inventory = 0;
		price = 0;
	}
	
	public Item(String d, double i, double p) {
		description = d;
		inventory = i;
		price = p;
	}
	
	public String toString() {
		String s = new String(description + " : " + inventory + " : $" + price);
		return s;
	}
	
	public boolean equals(Item A) {
		if(A.description == description)
			if(A.inventory == inventory)
				if(A.price == price)
					return true;
				else
					return false;
			else
				return false;
		else
			return false;
	}
	
	
	
	public static void main(String[] args) {
	
		Item test0 = new Item("Cat", 42.0, 100.5);
		Item test1 = new Item("Cat", 42.0, 100.5);

		System.out.println(test0.toString());
		System.out.println(test1.toString());
		System.out.println(test0.equals(test1));
		
		

	}

}
