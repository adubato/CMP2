import java.util.ArrayList;
import java.io.*;

public class StockHistory {

	private String symbol_;
	private ArrayList<StockPrices> prices_;
	
	public StockHistory() {
		
	}
	
	public StockHistory(String symbol) {
		symbol_ = symbol;
		prices_ = new ArrayList<StockPrices>();
	}
	
	public static void main( String [] args ) {
		
	}
	
}
