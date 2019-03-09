package com.cihattekin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class sayiatama {

	private JFrame frame;
	private JTextField text1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sayiatama window = new sayiatama();
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
	public sayiatama() {
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
		
		JLabel labelsayi = new JLabel("Sayi=");
		labelsayi.setBounds(66, 89, 89, 14);
		frame.getContentPane().add(labelsayi);
		
		text1 = new JTextField();
		text1.setBounds(171, 86, 103, 20);
		frame.getContentPane().add(text1);
		text1.setColumns(10);
		
		JButton btnNewButton = new JButton("Buton");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random r=new Random();
				int sayi=r.nextInt(50);
			String sayitext=text1.getText();			
				// sayi =Byte.valueOf(sayitext);
			
				Byte sayi1=Byte.valueOf(sayitext);
				if(sayi1<0||sayi1>50) {				
					JOptionPane.showMessageDialog(frame, "sayý 0 ile 50 arasýnda olmalýdýr");
					}
				 if(sayi1<50 & sayi1>0) {
				if(sayi1%5==0) {
					JOptionPane.showMessageDialog(frame, "sayi 5 e tam bölünür");
				}
				if(sayi1%4==0) {
					JOptionPane.showMessageDialog(frame, "sayi 4 e tam bölünür");
				}
				if(sayi1%3==0) {
					JOptionPane.showMessageDialog(frame, "sayi 3 e tam bölünür");
				}
				if(sayi1%2==0) {
					JOptionPane.showMessageDialog(frame, "sayi 2 e tam bölünür");
				}
				JOptionPane.showMessageDialog(frame, "katý yok");

			}}
		});
		btnNewButton.setBounds(171, 140, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
