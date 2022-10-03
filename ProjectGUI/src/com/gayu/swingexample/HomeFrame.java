package com.gayu.swingexample;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class HomeFrame extends JFrame{
	
	private JPanel homePanel;
	static HomeFrame homeFrame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 homeFrame = new HomeFrame();
					homeFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public HomeFrame() {
		setFont(new Font("Stencil", Font.BOLD, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 385);
		homePanel = new JPanel();
		homePanel.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(homePanel);
		homePanel.setLayout(null);
		
		JLabel homeLabel = new JLabel("Home Page");
		homeLabel.setBounds(50,50, 200,40);
		homeLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		homePanel.add(homeLabel);
		

		JButton findButton = new JButton("Find");
		findButton.setBounds(50,150, 200,40);
		findButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		findButton.addActionListener(e -> {
	    	 this.setVisible(false);
	    	 new FindFrame().setVisible(true);
	      });
		homePanel.add(findButton);
		
		JButton loginButton = new JButton("Log In");
		loginButton.setBounds(50,250, 200,40);
		loginButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		loginButton.addActionListener(e -> {
		    	 this.setVisible(false);
		    	 new LoginFrame().setVisible(true);
		      });
		homePanel.add(loginButton);
		
		JButton contactButton = new JButton("Contact");
		contactButton.setBounds(300,150, 200,40);
		contactButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		contactButton.setFont(new Font("Verdana", Font.PLAIN, 20));
		contactButton.addActionListener(e -> {
			  this.setVisible(false);
			  new ContactFrame().setVisible(true);
	      });
		homePanel.add(contactButton);
		
		JButton closeButton = new JButton("Close");
		closeButton.setBounds(300,250, 200,40);
		closeButton.setBackground(Color.red);
		closeButton.setFont(new Font("Verdana", Font.PLAIN, 20));
	      closeButton.addActionListener(e -> {
	    	  homeFrame.dispose();
	      });
		homePanel.add(closeButton);
		
	
		
	}

}
