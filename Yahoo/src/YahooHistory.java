import java.io.*;
import java.util.*;

public class YahooHistory {

	ArrayList<YahooRecord> prices;
	
	public YahooHistory() {}
	
	public YahooHistory(String fileName) {
		read(fileName);
	}
	
	public void read(String fileName) {
		prices = new ArrayList<YahooRecord>();
		
		try {
			File file = new File(fileName);
			Scanner scan = new Scanner(file);
			boolean isFirst = true;
			
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				if(isFirst) {
					isFirst = false;
					continue;
				}
				prices.add(new YahooRecord(line));
			}
			scan.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	
	public String [][] getData() {
		int rows = prices.size();
		int cols = 7;
		String [][] data = new String[rows][cols];
		
		for(int i = 0; i < rows; i++) {
			YahooRecord r = prices.get(i);
			int j = 0;
			data[i][j++] = r.date;
			data[i][j++] = Double.toString(r.open);
			data[i][j++] = Double.toString(r.high);
			data[i][j++] = Double.toString(r.low);
			data[i][j++] = Double.toString(r.close);
			data[i][j++] = Double.toString(r.volume);
			data[i][j++] = Double.toString(r.adjclose);
		}
		return data;
	}
	
	public String [] getCols() {
		String [] cols = {"Date", "High", "Low", "Close", "Volume", "Adjusted Close"};
		return cols;
	}
	
	static String getDefaultFile() {
		String dir = "C:/Users/adubato.michael41/CMP-129/Examples/src/";
		String file = "google_prices.csv";
		String s = dir + file;
		return s;
	}
	
	static public YahooHistory getHist(String [] args) {
		String fileName = args.length == 0 ? getDefaultFile()
				: args[0];
		YahooHistory hist = new YahooHistory(fileName);
		hist.read(fileName);
		return hist;
	}
	
	static public void main(String [] args) {	}
}
