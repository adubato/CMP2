import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdderGUI extends JFrame {

	JTextField xentry;
	JTextField yentry;
	JTextField result;
	
	public AdderGUI() {
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
		KeyL listener = new KeyL();
		
		JLabel xlabel = new JLabel("X:");
		xentry = new JTextField(3);
		xentry.addKeyListener(listener);
		aPanel.add(xlabel);
		aPanel.add(xentry);
		
		JLabel ylabel = new JLabel("+ Y:");
		yentry = new JTextField(3);
		yentry.addKeyListener(listener);
		aPanel.add(ylabel);
		aPanel.add(yentry);
				
		aPanel.add(new JLabel("Result: "));
		result = new JTextField("            ");
		result.setEditable(false);
		aPanel.add(result);
		
		add(aPanel);
	}
	
	private double getNumber(String text) {
		try{
			return Double.parseDouble(text);
		}
		catch(Exception e) {
			return 0;
		}
	}
	
	public void updateResult() {
		double x = getNumber(xentry.getText());
		double y = getNumber(yentry.getText());
		result.setText(Double.toString(x + y));
	}
	
	public class KeyL implements KeyListener {
		public void keyTyped(KeyEvent e) {}
		
		public void keyReleased(KeyEvent e) {
			updateResult();
		}
		
		public void keyPressed(KeyEvent e) {}
		
		/*public void whichField(KeyEvent e) {
			Component c = e.getComponent();
			if(c.equals(xentry))
				System.out.print("X");
			else
				System.out.print("Y");
		}*/
	}
	
	public static void main(String [] args) {
		new AdderGUI();
	}
}
