	public class Number implements Arithmetic {
	         public int X;
	
	         public Number() {
	        	 X = 0;
	         }
	         
	         public Number( int X ) {            
	                 this.X = X;         
	         }
	
	         public void add( int x ) {
		    this.X += x;
		 }
	
	
		 public void subtract( int x ) {
		    this.X -= x;
		 }
		 
		    public String toString() {
		    	return new String("X: " + X);
		    }
		    
		    public void print() {
		    	System.out.println(toString());
		    }
		    
		    public static void main(String [] args) {
		    	
		    }
		 
		 }