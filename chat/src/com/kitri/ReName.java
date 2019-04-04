package com.kitri;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Component;
import java.awt.Rectangle;
import java.awt.Insets;

public class ReName extends JFrame {

	private JPanel contentPane;
	private JTextField nntf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReName frame = new ReName();
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
	public ReName() {
		setTitle("\uB300\uD654\uBA85 \uBCC0\uACBD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		JPanel oname = new JPanel();
		contentPane.add(oname);
		oname.setLayout(new BorderLayout(0, 0));
		
		JLabel onl1 = new JLabel("Old Name : ");
		oname.add(onl1, BorderLayout.WEST);
		onl1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		onl1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		JLabel onl2 = new JLabel("oldname");
		oname.add(onl2, BorderLayout.CENTER);
		onl2.setHorizontalAlignment(SwingConstants.CENTER);
		onl2.setVerticalTextPosition(SwingConstants.BOTTOM);
		onl2.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		JPanel nname = new JPanel();
		contentPane.add(nname);
		nname.setLayout(new BorderLayout(0, 0));
		
		JLabel nnl = new JLabel("New Name : ");
		nname.add(nnl, BorderLayout.WEST);
		nnl.setHorizontalAlignment(SwingConstants.RIGHT);
		
		nntf = new JTextField();
		nname.add(nntf, BorderLayout.CENTER);
		nntf.setHorizontalAlignment(SwingConstants.CENTER);
		nntf.setText("gagamel");
		nntf.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton change = new JButton("\uBCC0\uACBD");
		change.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(change);
		
		JButton cancel = new JButton("\uCDE8\uC18C");
		cancel.setAlignmentX(Component.CENTER_ALIGNMENT);
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(cancel);
	}

}
