import java.awt.*;
import javax.swing.*;

public class YahooTable extends JFrame {

	private JTable table;
	
	public YahooTable() {
		
	}
	
	public YahooTable(YahooHistory yh) {
		super("Yahoo Price History");
		buildTable(yh);
		setSize(500, 500);
		setLocation(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	private void buildTable(YahooHistory yh) {
		table = new JTable(yh.getData(), yh.getCols());
		add(table);
	}
	
	private String [][] fakeData() {
		String [][] data = {{ "James" , "16" },
									{ "Alex", "18" },
									{ "Brian" , "15" }};
		return data;
		}
	
	private String [] fakeCol() {
		String [] cols = { "Name" , "Age" };
		return cols;
	}
	
	public static void main(String [] args) {
		YahooHistory yh = YahooHistory.getHist(args);
		YahooTable yt = new YahooTable(yh);
	}
	
	
}
