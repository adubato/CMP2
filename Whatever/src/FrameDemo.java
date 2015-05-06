import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FrameDemo extends JFrame {

	JTextField field_;
	
	public FrameDemo() {
		super("Frame Demo");
		init();
		initStuff();
		setVisible(true);
	}
	
	private void initStuff() {
		JPanel aPanel = new JPanel();
		JLabel label = new JLabel("Input:");
		field_ = new JTextField(15);
		field_.addKeyListener(new KeyL());
		JButton aButton = new JButton("Press");
		aButton.addActionListener(new ButtonL());
		aPanel.add(label);
		aPanel.add(field_);
		aPanel.add(aButton);
		add(aPanel);
	}
	
	class KeyL implements KeyListener {
		public void keyPressed(KeyEvent e) {
			System.out.println("Pressed: " + e.getKeyChar());
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("Released: " + e.getKeyChar());
		}
		public void keyTyped(KeyEvent e) {
			System.out.println("Typed: " + e.getKeyChar());
		}
	}
	
	class ButtonL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand());
			String text = field_.getText();
			System.out.println("You Entered: " + text);
			String msg = "You Entered: " + text;
		}
	}
	
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocation(100, 100);
	}
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static void main(String [] args) {
		new FrameDemo();
	}
}
