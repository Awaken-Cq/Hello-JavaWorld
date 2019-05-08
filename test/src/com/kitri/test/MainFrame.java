package com.kitri.test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//5.임플레먼츠 액션리스너 및 오버라이딩
public class MainFrame extends JFrame implements ActionListener{
//	1.전역변수 선언
	

//	2.뷰패널 객체생성
	View1 v1 = new View1();
	View2 v2 = new View2();
//	3.카드레이아웃생성
	CardLayout cl_panel = new CardLayout();
	private JPanel panel;
	private JPanel contentPane;
	private final JButton bb1 = new JButton("\uBA54\uC778");
	private final JButton bb2 = new JButton("\uC7A5\uBE44");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 466);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		
		panel = new JPanel();
//		4.카드레이아웃세팅
		panel.setLayout(cl_panel);
		panel.add("view1",v1);
		panel.add("view2",v2);
		
		cl_panel.show(panel, "view2");
		panel.setBounds(12, 60, 444, 358);
		contentPane.add(panel);
		bb1.setBounds(12, 10, 97, 23);
		
		contentPane.add(bb1);
		bb2.setBounds(121, 10, 97, 23);
		
		contentPane.add(bb2);
//		6.액션리스너 등록
		bb1.addActionListener(this);
		bb2.addActionListener(this);
//		v1.b3.addAction
		
	}
//	7.오버라이딩된 메소드에 버튼별 행동 코딩
	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object ob = e.getSource();
		if(ob == bb1) {
			cl_panel.show(panel, "view1");
		}else if (ob == bb2) {
			cl_panel.show(panel, "view2");
		}	
			
			
		}
		
	}
	



