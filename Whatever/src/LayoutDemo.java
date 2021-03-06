import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutDemo extends JFrame {

	private final int nButtons = 6;
	private JButton [] buttons;
	
	public LayoutDemo(String ltype, int x, int y) {
		super(ltype);
		setSize(200, 300);
		setLocation(x, y);
		init(ltype);
		setVisible(true);
	}
	
	private void init(String ltype) {
		buttons = new JButton[nButtons];
		
		for(int i = 0; i < nButtons; i++) {
			buttons[i] = new JButton("Button " + i);
		}
		if(ltype.equals("Grid"))
			grid();
		else if(ltype.equals("Border"))
			border();
		else if(ltype.equals("Flow"))
			flow();
	}
	
	private void grid() {
		JPanel aPanel = new JPanel();
		GridLayout lo = new GridLayout(3, 3);
		aPanel.setLayout(lo);
		for(int i = 0; i < nButtons; i++)
			aPanel.add(buttons[i]);
		add(aPanel);
	}
	
	private void border() {
		JPanel aPanel = new JPanel();
		BorderLayout lo = new BorderLayout();
		aPanel.setLayout(lo);
		aPanel.add(buttons[0], BorderLayout.NORTH);
		aPanel.add(buttons[1], BorderLayout.EAST);
		aPanel.add(buttons[2], BorderLayout.SOUTH);
		aPanel.add(buttons[3], BorderLayout.WEST);
		aPanel.add(buttons[4], BorderLayout.CENTER);
		aPanel.add(buttons[5], BorderLayout.CENTER);
		add(aPanel);
	}
	 
	private void flow() {
		
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String [] args) {
		new LayoutDemo("Grid", 100, 200);
		new LayoutDemo("Border", 300, 200);
		new LayoutDemo("Flow", 500, 200);
	}
}
