package com.gayu.swingexample;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ContactFrame extends JFrame {

	 ContactFrame findFrame;
	 private JPanel contactPanel;
	
	
	public ContactFrame() {
		
		this.setPanel();
		
		
		JLabel firstNameLabel = new JLabel("First Name");
		firstNameLabel.setBounds(160, 104, 170, 16);
		firstNameLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		contactPanel.add(firstNameLabel);
		
		JTextField firstNametext = new JTextField();
		firstNametext.setBounds(280, 103, 187, 17);
		contactPanel.add(firstNametext);
		firstNametext.setColumns(10);
		
		
		JLabel lastNameLabel = new JLabel("Last Name");
		lastNameLabel.setBounds(160, 134, 170, 16);
		lastNameLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		contactPanel.add(lastNameLabel);
		
		JTextField lastNametext = new JTextField();
		lastNametext.setBounds(280, 133, 187, 17);
		contactPanel.add(lastNametext);
		lastNametext.setColumns(10);
		
		
		JLabel ageLabel = new JLabel("Age");
		ageLabel.setBounds(160, 164, 170, 16);
		ageLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		contactPanel.add(ageLabel);
		
		JTextField ageText = new JTextField();
		ageText.setBounds(280, 163, 187, 17);
		contactPanel.add(ageText);
		ageText.setColumns(10);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(e -> {
	    	 this.setVisible(false);
	    	 new HomeFrame().setVisible(true);
	      });
		backButton.setFont(new Font("Stencil", Font.BOLD, 20));
		backButton.setBounds(258, 248, 131, 42);
		contactPanel.add(backButton);

	}
	
	void setPanel() {
		setFont(new Font("Stencil", Font.BOLD, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 385);
		contactPanel = new JPanel();
		contactPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contactPanel);
		contactPanel.setLayout(null);
		}
}
