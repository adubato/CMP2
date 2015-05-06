import javax.swing.*;
import java.awt.event.*;
import java.io.*; 

public class MenuE extends JFrame {

	private JFileChooser fchoose;
	private JTextArea text;
	
	public MenuE() {
		super("MENU EXAMPLE");
		init();
		buildMenu();
		buildChooser();
		buildDisplay();
		setVisible(true);
	}
	
	private void init() {
		setSize(750, 500);
		setLocation(200, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private class MenuL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String action = e.getActionCommand();
			if(action.equals("Open"))
				openSelected();
			else if(action.equals("Save"))
				saveSelected();
		}
	}
	
	private class FileL implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String action = e.getActionCommand();
			if(action.equals("ApproveSelection"))
				fileOpenSelected();
		}
	}
	
	private void fileOpenSelected() {
		try {
		File file = fchoose.getSelectedFile();
		System.out.println(file.getName());
		FileInputStream fstream = new FileInputStream(file);
		DataInputStream dstream = new DataInputStream(fstream);
		String contents = new String();
		while(dstream.available() > 0) {
			int nBytes = dstream.available();
			byte [] buffer = new byte[nBytes];
			dstream.read(buffer);
			contents += new String(buffer);
		}
		//System.out.println(contents);
		text.setText(contents);
		dstream.close();
		} catch(IOException e) {
			
		}
	}
	
	private void openSelected() {
		fchoose.showOpenDialog(getParent());
	}
	
	private void saveSelected() {
		fchoose.showSaveDialog(getParent());
	}
	
	private void buildMenu() {
		JMenuBar bar = new JMenuBar();
		
		JMenu fileM = new JMenu("File");
		JMenuItem openi = new JMenuItem("Open");
		JMenuItem savei = new JMenuItem("Save");
		
		openi.addActionListener(new MenuL());
		savei.addActionListener(new MenuL());
		
		fileM.add(openi);
		fileM.addSeparator();
		fileM.add(savei);
		bar.add(fileM);
		
		setJMenuBar(bar);
	}
	
	private void buildDisplay() {
		JPanel panel = new JPanel();
		text = new JTextArea("", 25, 65);
		text.setLineWrap(true);
		JScrollPane scroll = new JScrollPane(text);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		panel.add(scroll);
		add(panel);
	}
	
	private void buildChooser() {
		fchoose = new JFileChooser();
		fchoose.addActionListener(new FileL());
	}
		
	//
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//
	
	public static void main(String [] args) {
		new MenuE();
	}
}
