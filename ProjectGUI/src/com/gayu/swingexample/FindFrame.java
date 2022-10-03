package com.gayu.swingexample;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FindFrame extends JFrame {

	 FindFrame findFrame;
	 private JPanel findPanel;
	
	public FindFrame() {
		
		
		this.setPanel();
		
		JLabel findLabel = new JLabel("Find");
		findLabel.setBounds(179, 103, 104, 42);
		findLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		findPanel.add(findLabel);
		
		JTextField findtext = new JTextField();
		findtext.setBounds(179, 150, 187, 17);
		findPanel.add(findtext);
		findtext.setColumns(10);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(e -> {
	    	 this.setVisible(false);
	    	 new HomeFrame().setVisible(true);
	      });
		backButton.setFont(new Font("Stencil", Font.BOLD, 20));
		backButton.setBounds(258, 248, 131, 42);
		findPanel.add(backButton);
		
	
	}
	
	void setPanel() {
		setFont(new Font("Stencil", Font.BOLD, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 385);
		findPanel = new JPanel();
		findPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(findPanel);
		findPanel.setLayout(null);
		}
	
	
	
}
