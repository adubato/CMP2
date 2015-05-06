import java.awt.*;
import javax.swing.*;
import java.util.*;

public class PriceDisplay extends JFrame {

	public ArrayList<PriceRecord> prices;
	
	public PriceDisplay(String filename) {
		
	}
	
	private void getData(String filename) {
		prices = PriceRecord.readFile(filename);
	}
	
}
