import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JListEx extends JFrame {

	private JList<String> monthList;
	private String [] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};
	private JTextField monthSel;
	
	public JListEx() {
		initFrame();
		initList();
		pack();
		setVisible(true);
	}
	
	
	private void initFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Months");
		setSize(300, 300);
		setLocation(300, 300);
	}
	
	private void initList() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		
		monthList = new JList<String>(months);
		monthList.addListSelectionListener(new ListL());
		monthList.setVisibleRowCount(6);
		monthSel = new JTextField(10);
		monthSel.setEditable(false);
		
		JScrollPane scroll = new JScrollPane(monthList);
		
		panel.add(scroll, BorderLayout.PAGE_START);
		panel.add(monthSel, BorderLayout.PAGE_END);
		
		add(panel);
	}
	
	private class ListL implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent e) {
			String sel = monthList.getSelectedValue();
			monthSel.setText(sel);
		}
	}
	
	public static void main(String [] args) {
		new JListEx();
	}
}
