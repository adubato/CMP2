import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class NumPad extends JFrame {
	
	//this is a phone pad layout, not a keyboard which would be 789,456,123
	private final String [] pad = {"1", "2", "3"
												, "4", "5", "6"
												, "7", "8", "9"
												, "*", "0", "#"};
	public JLabel display;
	
	public NumPad() {
		super("Number Pad");
		initFrame();
		buildGUI();
		pack();
		setVisible(true);
	}
	
	private void initFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(0, 0);
		setLocation(400, 300);
	}
	
	public void init() {
		
	}
	
	public void buildGUI() {
		//build number display
		JPanel displayPanel = new JPanel();
		
		display = new JLabel(" ");
		
		displayPanel.add(display);
		
		//build number pad
		JPanel padPanel = new JPanel();
		padPanel.setLayout(new GridLayout(4, 3));
		
		JButton [] buttons  = new JButton[12];
				
		for(int i = 0; i < 12; i++) {
			buttons[i] = new JButton(pad[i]);
			buttons[i].addActionListener(new ButtonL());
			padPanel.add(buttons[i]);
		}
		
		//add both panels to frame
		add(displayPanel, BorderLayout.NORTH);
		add(padPanel);
	}
	
	private class ButtonL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			display.setText(display.getText() + e.getActionCommand());
		}
	}
		
	public static void main(String [] args) {
		new NumPad();
	}
}
