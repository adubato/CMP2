import javax.swing.*;

public class Display extends JFrame {

	public Display() {
		super("Display Test");
		init();
		setVisible(true);
	}
	
	private void init() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		setLocation(200, 200);
	}

	public static void main(String [] args) {
		new Display();
	}
}
