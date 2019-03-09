package com.cihattekin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class hesaplama {

	private JFrame frame;
    private JComboBox comboBox;
    private JTextField textField;
    private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hesaplama window = new hesaplama();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hesaplama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Toplama", "\u00C7\u0131karma", "\u00C7arpma", "B\u00F6lme"}));
		comboBox.setBounds(277, 62, 131, 28);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(114, 39, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(114, 83, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Sayi1");
		lblNewLabel.setBounds(33, 42, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sayi2");
		lblNewLabel_1.setBounds(33, 86, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("sec");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String islemTipi =comboBox.getSelectedItem().toString();
				//JOptionPane.showMessageDialog(frame, islemTipi);
				String sayitext1=textField.getText();
				String sayitext2=textField2.getText();
				
				float sayi1=Byte.valueOf(sayitext1);
				float sayi2=Byte.valueOf(sayitext2);
				if(islemTipi=="Toplama"){
					float toplam=sayi1+sayi2;
					JOptionPane.showMessageDialog(frame, toplam);
				}
				if(islemTipi=="Çýkarma"){
					float cikarma=sayi1-sayi2;
					JOptionPane.showMessageDialog(frame, cikarma);
				}
				if(islemTipi=="Çarpma"){
					float carpma=sayi1*sayi2;
					JOptionPane.showMessageDialog(frame, carpma);
				}
				if(islemTipi=="Bölme"){
					float bölme=sayi1/sayi2;
					JOptionPane.showMessageDialog(frame, bölme);
				}
				
			}
		});
		btnNewButton.setBounds(111, 145, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
