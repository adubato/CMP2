/*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddGUI extends JFrame {

	JTextField xentry;
	JTextField yentry;
	JLabel result;
	
	
	public AddGUI() {
		super("Add 2 Numbers");
		initFrame();
		buildGUI();
		pack();
		setVisible(true);
	}
	
	private void initFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350, 100);
		setLocation(200, 200);
	}
	
	private void buildGUI() {
		JPanel aPanel = new JPanel();
		
		JLabel xlabel = new JLabel("X:");
		xentry = new JTextField(3);
		aPanel.add(xlabel);
		aPanel.add(xentry);
		
		JLabel ylabel = new JLabel("+ Y:");
		yentry = new JTextField(3);
		aPanel.add(ylabel);
		aPanel.add(yentry);
		
		JButton calc = new JButton("Calculate");
		calc.addActionListener(new ButtonL());
		aPanel.add(calc);
		
		aPanel.add(new JLabel("Result: "));
		result = new JLabel("            ");
		aPanel.add(result);
		
		add(aPanel);
	}
	
	private class ButtonL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String xText = xentry.getText();
			String yText = yentry.getText();
			int x = Integer.parseInt(xText);
			int y = Integer.parseInt(yText);
			int r = x + y;
			String rString = Integer.toString(r);
			result.setText(rString);
			System.out.println(xText + " + " + yText + " = " + rString);
		}
	}
	
	public static void main(String [] args) {
		new AddGUI();
	}
}
*/
