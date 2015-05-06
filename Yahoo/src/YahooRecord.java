import java.io.*;
import java.util.*;

public class YahooRecord {
	
	public String 		date;
	public double 	open;
	public double 	high;
	public double 	low;
	public double 	close;
	public long 		volume;
	public double 	adjclose;
	
	public YahooRecord() {}
	
	public YahooRecord(String line) {
		parse(line);
	}
	
	public String toString() {
		return new String("[" + date + "]: " + open + "  :  " + high + "  :  " + low + "  :  " + close + "  :  " + volume + "  :  " + adjclose);
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
	

}
