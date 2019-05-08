package com.kitri.test;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.*;

import javax.swing.JButton;
import javax.swing.JScrollPane;

public class View1 extends JPanel {
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton b7;
	/**
	 * Create the panel.
	 */
	public View1() {
		setBounds(new Rectangle(12, 60, 444, 358));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();

		
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton b1 = new JButton("status");
		panel.add(b1);
		
		JButton b2 = new JButton("skill");
		panel.add(b2);
		
		JButton b3 = new JButton("item");
		panel.add(b3);
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		b4 = new JButton("attack");
		panel_1.add(b4);
		
		b5 = new JButton("magic");
		panel_1.add(b5);
		
		b6 = new JButton("use");
		panel_1.add(b6);
		
		b7 = new JButton("run");
		panel_1.add(b7);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.CENTER);

	}

}
