import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.*;

public class StockURLReader {

	private static SimpleDateFormat dateFmt = new SimpleDateFormat( "yyyy-MM-dd");    
    private static SimpleDateFormat yearFmt = new SimpleDateFormat("yyyy");
    private static SimpleDateFormat monthFmt = new SimpleDateFormat("MM");
    private static SimpleDateFormat dayFmt = new SimpleDateFormat("dd");

    public static void readUrl() {
    	String host = "http://real-chart.finance.yahoo.com/table.csv";
    	String sym = "s=GOOGL&";
    	String d1 = "d=2&e=22&f=2015";
    	String d2 = "a=0&b=1&c=2014";
    	String urlString = host + "?" + sym + "&" + d1 + "&" + d2;
    	//?s=GOOGL&d=2&e=23&f=2015&g=d&a=7&b=19&c=2004&ignore=.csv
    	try {
		    URL url = new URL( urlString );
		    URLConnection conn = url.openConnection();
		    HttpURLConnection httpConn = null;
		    if ( conn instanceof HttpURLConnection ) {
			httpConn = (HttpURLConnection)conn;
		    }
		    else {
			return;
		    }
    	 BufferedReader in = new BufferedReader( new InputStreamReader(httpConn.getInputStream()));
 	    String line = null;
 	    long count = 0;
 	    while( (line = in.readLine()) != null ) {
 		System.out.println(line);
 	    }
    	}
 	   catch( IOException e ) {
 		    System.out.println(e);
 		}
    }
    
    public static StockHistory GetHistory( String symbol , Date begin , Date end ) {
    	String urlString = formUrl( symbol, begin ,end );
    	StockHistory history = new StockHistory( symbol );
    	try {
		    URL url = new URL( urlString );
		    URLConnection conn = url.openConnection();
		    HttpURLConnection httpConn = null;
		    if ( conn instanceof HttpURLConnection ) {
		    	httpConn = (HttpURLConnection)conn;
		    }
		    else {
		    	return history;
	    }
	    BufferedReader in = new BufferedReader( new InputStreamReader(httpConn.getInputStream()));
	    String line = null;
	    long count = 0;
	    while( (line = in.readLine()) != null ) {
	    	if ( count++ == 0 ) continue;
	    		StockPrices prices = new StockPrices();
	    		prices.parse(line);
	    		//history.add(prices);
	    		//System.out.println(line);
	    }
	}
    	catch( IOException e ) {
    		System.out.println(e);
	}
    	return history;
    }

    public static String formUrl( String symbol , Date begin ,Date end ) {
    	String l = getHost();
    	l += "s=" + symbol;
    	l += "&d=" + (GetMonth(end)-1);
    	l += "&e=" + GetDay(end);
    	l += "&f=" + GetYear(end);
    	l += "&a=" + (GetMonth(begin)-1);
    	l += "&b=" + GetDay(begin);
    	l += "&c=" + GetYear(begin);
    	return l;
    }

    //
    //
    
    public static String getHost() {
	return "http://real-chart.finance.yahoo.com/table.csv?";
    }

    public static Date GetDate( String dateString ) {
    	try {
    		return dateFmt.parse(dateString);
    	} 
		catch( java.text.ParseException e ) {
	    return new Date();
		}
    }

    public static int GetYear( Date d ) {
    	return Integer.parseInt( yearFmt.format(d));
    }

    public static int GetMonth( Date d ) {
    	return Integer.parseInt( monthFmt.format(d));
    }
    public static int GetDay( Date d ) {
    	return Integer.parseInt( dayFmt.format(d));
    }

    public static String Format( Date d ) {
    	return dateFmt.format(d);
   }

    //---------------------------------------------------------------
    // 
    //---------------------------------------------------------------
    public static void main( String [] args ) {
    	/*
		StockHistory hist = GetHistory( "GOOGL" , GetDate("2014-01-01") , GetDate("2015-03-22") );
		int minix = hist.getMinPrice();
		int maxix = hist.getMaxPrice();
		StockPrices minPrice = hist.get(minix);
		StockPrices maxPrice = hist.get(maxix);
		System.out.println( "Symbol : " + hist.getSymbol() );
		System.out.println( "Low    : " + minPrice.getAdjClose()  + " : Date = " + Format(minPrice.getDate())); 
		System.out.println( "High   : " + maxPrice.getAdjClose()  + " : Date = " + Format(maxPrice.getDate()));
    */
    	readUrl();
    }

}
