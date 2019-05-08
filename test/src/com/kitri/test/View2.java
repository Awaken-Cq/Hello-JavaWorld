package com.kitri.test;

import javax.swing.JPanel;
import java.awt.Rectangle;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JCheckBox;

public class View2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public View2() {
		setAlignmentY(Component.BOTTOM_ALIGNMENT);
		setAlignmentX(Component.RIGHT_ALIGNMENT);
		setBounds(new Rectangle(12, 60, 444, 358));
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		add(panel, BorderLayout.NORTH);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		add(panel_1, BorderLayout.WEST);
		
		JCheckBox chckbxLarm = new JCheckBox("L_Arm");
		panel_1.add(chckbxLarm);
		
		JPanel panel_2 = new JPanel();
		add(panel_2, BorderLayout.EAST);
		
		JCheckBox chckbxRarm = new JCheckBox("R_Arm");
		panel_2.add(chckbxRarm);
		
		JPanel panel_3 = new JPanel();
		add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(1, 0, 0, 0));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("groove");
		panel_3.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("shose");
		panel_3.add(chckbxNewCheckBox_1);
		
		JPanel panel_4 = new JPanel();
		add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(1, 0, 0, 0));
		
		JCheckBox checkBox = new JCheckBox("");
		panel_4.add(checkBox);

	}

}
