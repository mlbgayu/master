package com.gayu.swingexample;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	

	/**
	 * Create the frame.
	 */
	public LoginFrame() {
		setFont(new Font("Stencil", Font.BOLD, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 609, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setBounds(179, 8, 104, 42);
		lblNewLabel.setFont(new Font("Stencil", Font.BOLD, 20));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Client DB");
		lblNewLabel_1.setBounds(51, 73, 104, 28);
		lblNewLabel_1.setFont(new Font("Stencil", Font.BOLD, 20));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("User Name");
		lblNewLabel_2.setBounds(179, 104, 104, 16);
		lblNewLabel_2.setFont(new Font("Stencil", Font.BOLD, 15));
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(280, 103, 187, 17);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(179, 128, -8, 16);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		lblNewLabel_4.setFont(new Font("Stencil", Font.BOLD, 15));
		lblNewLabel_4.setBounds(179, 145, 83, 28);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(280, 149, 187, 16);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("ok");
		btnNewButton.setFont(new Font("Stencil", Font.BOLD, 20));
		btnNewButton.setBounds(94, 248, 77, 42);
		contentPane.add(btnNewButton);
		
		JButton backButton = new JButton("Back");
		backButton.addActionListener(e -> {
	    	 this.setVisible(false);
	    	 new HomeFrame().setVisible(true);
	      });
		backButton.setFont(new Font("Stencil", Font.BOLD, 20));
		backButton.setBounds(258, 248, 131, 42);
		contentPane.add(backButton);
	}
}
