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
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField nntf;
	private JTextField txtIptf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
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
		
		JLabel onl1 = new JLabel("         I     P :      ");
		oname.add(onl1, BorderLayout.WEST);
		onl1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		onl1.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txtIptf = new JTextField();
		txtIptf.setText("ipTF");
		txtIptf.setHorizontalAlignment(SwingConstants.CENTER);
		txtIptf.setColumns(10);
		oname.add(txtIptf, BorderLayout.CENTER);
		
		JPanel nname = new JPanel();
		contentPane.add(nname);
		nname.setLayout(new BorderLayout(0, 0));
		
		JLabel nnl = new JLabel("   \uB300   \uD654   \uBA85 :  ");
		nname.add(nnl, BorderLayout.WEST);
		nnl.setHorizontalAlignment(SwingConstants.RIGHT);
		
		nntf = new JTextField();
		nname.add(nntf, BorderLayout.CENTER);
		nntf.setHorizontalAlignment(SwingConstants.CENTER);
		nntf.setText("gagamel");
		nntf.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		contentPane.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton change = new JButton("\uD655\uC778");
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
