package com.kitri.io;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

import java.awt.Component;

public class Notepad extends JFrame implements ActionListener {

	private JPanel panel;
	JMenuBar menuBar = new JMenuBar();

	JMenu file = new JMenu("\uD30C\uC77C");

	JMenuItem open = new JMenuItem("\uC5F4\uAE30");

	JMenuItem save = new JMenuItem("\uC800\uC7A5");

	JMenuItem exit = new JMenuItem("\uC885\uB8CC");

	JMenu help = new JMenu("\uB3C4\uC6C0\uB9D0");

	JScrollPane scrollPane = new JScrollPane();

	JTextArea ta = new JTextArea();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notepad frame = new Notepad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Notepad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);

		setJMenuBar(menuBar);

		menuBar.add(file);

		file.add(open);

		file.add(save);

		file.add(exit);

		menuBar.add(help);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(panel);
		panel.setLayout(new BorderLayout(0, 0));

		panel.add(scrollPane, BorderLayout.CENTER);

		scrollPane.setViewportView(ta);

		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		JFileChooser jfc = new JFileChooser();
		BufferedReader br;
		if (ob == open) {
			try {
				jfc.setCurrentDirectory(new File("F:\\iotest"));
				jfc.showOpenDialog(this);
				File file = jfc.getSelectedFile();
				br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
				String str;
				try {
					while ((str = br.readLine()) != null)
						ta.append(str + "\n");

				} catch (IOException e1) {
					e1.printStackTrace();
				}

			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}

		} else if (ob == save) {
			jfc.setCurrentDirectory(new File("F:\\iotest"));
			jfc.showSaveDialog(this);
			jfc.getCurrentDirectory();
//			getName();
			
			if(file != null) {
				
			String str = ta.getText();
			System.out.println(str);
			}else {
				
			}
				File file = new File();
		} else if (ob == exit) {

			exit();

		}
	}

	public void exit() {
		System.exit(0);
	}

}
