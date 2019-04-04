package com.kitri.io;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Notepad222 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuBar menuBar = new JMenuBar();

	private JMenu file = new JMenu("\uD30C\uC77C");

	private JMenuItem open = new JMenuItem("\uC5F4\uAE30");

	private JMenuItem save = new JMenuItem("\uC800\uC7A5");

	private JMenuItem exit = new JMenuItem("\uC885\uB8CC");

	private JMenu help = new JMenu("\uB3C4\uC6C0\uB9D0");

//	private FileDialog opdl = new FileDialog(this, "열기", 0);
//	private FileDialog svdl = new FileDialog(this, "저장", 1);
	private final JTextArea ta = new JTextArea();

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public Notepad222() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Notepad");
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.add(menuBar, BorderLayout.NORTH);

		menuBar.add(file);

		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);

		menuBar.add(help);

		contentPane.add(ta, BorderLayout.CENTER);

		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad222 frame = new Notepad222();

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

		if (ob == open) {
			BufferedReader fin = null;
			JFileChooser jfc = new JFileChooser();
			jfc.setCurrentDirectory(new File("F:\\iotest"));
			jfc.showOpenDialog(this);
//			File file = jfc.getSelectedFile();
//			String infile = file.getPath();
//			try {
//				fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(infile))));
//			} catch (FileNotFoundException e2) {
//				e2.printStackTrace();
//			}
//			ta.setText("");
//			String str = null;
//			try {
//				while ((str = fin.readLine()) != null) {
//					ta.append(str + "\n");
//				}
//			} catch (IOException e1) {
//				e1.printStackTrace();
//			}


		

		}else if(ob==save){
			JFileChooser jfc = new JFileChooser();
			jfc.setCurrentDirectory(new File("F:\\iotest"));
			jfc.showSaveDialog(this);
			
			String data = ta.getText();
			FileWriter fw = null;
			File file = jfc.getSelectedFile();
			String outfile = file.getPath();
			
	
		
		}else if(ob==exit){
		exit();
	}
	}

	public void exit() {
		System.exit(0);
	}
}