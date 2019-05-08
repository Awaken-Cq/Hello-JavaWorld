package com.kitri.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class BaseBall extends JFrame {

	private JPanel contentPane;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaseBall frame = new BaseBall();
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
	public BaseBall() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tf = new JTextField();
		tf.setHorizontalAlignment(SwingConstants.CENTER);
		tf.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		tf.setBounds(65, 374, 345, 42);
		contentPane.add(tf);
		tf.setColumns(10);
		
		JLabel label = new JLabel("\uC785\uB825 : ");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("±¼¸²", Font.PLAIN, 14));
		label.setBounds(12, 374, 60, 42);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(422, 10, 97, 406);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 1, 0, 10));
		
		JButton newG = new JButton("\uC0C8 \uAC8C\uC784");
		newG.setBackground(Color.PINK);
		newG.setForeground(Color.BLACK);
		newG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(newG);
		
		JButton clear = new JButton("\uC9C0\uC6B0\uAE30");
		clear.setBorder(null);
		panel.add(clear);
		
		JButton dap = new JButton("\uC815\uB2F5");
		panel.add(dap);
		
		JButton fontC = new JButton("\uAE00\uC790\uC0C9");
		panel.add(fontC);
		
		JButton exit = new JButton("\uC885\uB8CC");
		panel.add(exit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(238, 154, 2, 2);
		contentPane.add(scrollPane);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(12, 10, 398, 354);
		contentPane.add(scrollPane_1);
		
		JTextArea textArea = new JTextArea();
		scrollPane_1.setViewportView(textArea);
	}
}
