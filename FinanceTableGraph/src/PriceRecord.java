import java.io.*;
import java.util.*;

public class PriceRecord {
	
	public String 		date;
	public double 	open;
	public double 	high;
	public double 	low;
	public double 	close;
	public long 		volume;
	public double 	adjclose;
	
	public PriceRecord() {	
		
	}
	
	public PriceRecord(String line) {
		parse(line);
	}
	
	public void parse(String line) {
		String [] fields = line.split(",");
		if(fields.length != 7) return;
		int i = 0;
		date = fields[i++];
		open = Double.parseDouble(fields[i++]);
		high = Double.parseDouble(fields[i++]);
		low = Double.parseDouble(fields[i++]);
		close = Double.parseDouble(fields[i++]);
		volume = Long.parseLong(fields[i++]);
		adjclose = Double.parseDouble(fields[i++]);
	}

	static public ArrayList<PriceRecord> readFile(String filename) {
		
		ArrayList<PriceRecord> prices = new ArrayList<PriceRecord>();
		
		try {
			File file = new File(filename);
			Scanner scan = new Scanner(file);
			
			boolean isFirst = true;
			
			while(scan.hasNextLine()) {
				//String line = scan.nextLine();
				if(isFirst) {
					isFirst = false;
					continue;
				}
				
				PriceRecord rec = new PriceRecord();
				prices.add(rec);
			}
			scan.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		return prices;
	}
	
//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//
	
	static public void main(String [] args) {
		if(args.length == 0) return;
		String filename = args[0];
		readFile(filename);
	}
}
