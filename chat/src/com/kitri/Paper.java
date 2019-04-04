package com.kitri;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Paper extends JFrame {

	private JPanel contentPane;
	private JTextField txtFrom;
	private JTextField txtTo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paper frame = new Paper();
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
	public Paper() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 0, 20, 0));
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("     From : ");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(lblNewLabel, BorderLayout.WEST);
		
		txtFrom = new JTextField();
		txtFrom.setText("From");
		txtFrom.setHorizontalAlignment(SwingConstants.CENTER);
		panel_2.add(txtFrom, BorderLayout.CENTER);
		txtFrom.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("T o :      ");
		lblNewLabel_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1, BorderLayout.WEST);
		
		txtTo = new JTextField();
		txtTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTo.setText("To");
		panel_3.add(txtTo, BorderLayout.CENTER);
		txtTo.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
		
		JButton btnNewButton = new JButton("\uBCF4\uB0B4\uAE30");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCDE8  \uC18C");
		panel_1.add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
	}

}
