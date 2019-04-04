package com.kitri;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Chat extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat frame = new Chat();
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
	public Chat() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 349, 342);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(10, 10));
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(2, 1, 0, 5));
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_3.add(panel_4);
		panel_4.setLayout(new BorderLayout(40, 0));
		
		JLabel lblNewLabel = new JLabel("\uADD3\uC18D\uB9D0");
		lblNewLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_4.add(lblNewLabel, BorderLayout.WEST);
		
		textField_1 = new JTextField();
		panel_4.add(textField_1, BorderLayout.CENTER);
		textField_1.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(373, 10, 99, 342);
		contentPane.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 20));
		
		JList list = new JList();
		panel_1.add(list, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(0, 1, 0, 10));
		
		JButton btnNewButton = new JButton("\uB300\uD654\uBA85\uBCC0\uACBD");
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uCABD\uC9C0\uBCF4\uB0B4\uAE30");
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uB098 \uAC00 \uAE30");
		panel_2.add(btnNewButton_2);
	}
}
