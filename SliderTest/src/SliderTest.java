import javax.swing.*;
import java.awt.*;

public class SliderTest extends JFrame {
	
	SliderTest() {
		initFrame();
		slider();
		setVisible(true);
	}
	
	void initFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 150);
		setTitle("Slider Test");
		setLocation(500, 500);
	}
	
	void slider() {
		JPanel panel = new JPanel(new BorderLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 1000, 500);
		slider.setMajorTickSpacing(100);
		slider.setMinorTickSpacing(25);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		
		panel.add(slider, BorderLayout.CENTER);
		add(panel);
	}

	
	public static void main(String[] args) {
		SliderTest test = new SliderTest();
	}

}
