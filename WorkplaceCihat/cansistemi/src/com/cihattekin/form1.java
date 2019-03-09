package com.cihattekin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class form1 {

	private JFrame frmCanSistemi;
	private JTextField txtogrenci1;
	private JTextField txtogrenci2;
	private JTextField txtogrenci3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					form1 window = new form1();
					window.frmCanSistemi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public form1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCanSistemi = new JFrame();
		frmCanSistemi.setTitle("Can Sistemi");
		frmCanSistemi.setBounds(100, 100, 505, 398);
		frmCanSistemi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCanSistemi.getContentPane().setLayout(null);
		
		txtogrenci1 = new JTextField();
		txtogrenci1.setBounds(146, 63, 164, 20);
		frmCanSistemi.getContentPane().add(txtogrenci1);
		txtogrenci1.setColumns(10);
		
		txtogrenci2 = new JTextField();
		txtogrenci2.setBounds(146, 109, 164, 20);
		frmCanSistemi.getContentPane().add(txtogrenci2);
		txtogrenci2.setColumns(10);
		
		txtogrenci3 = new JTextField();
		txtogrenci3.setBounds(146, 160, 164, 20);
		frmCanSistemi.getContentPane().add(txtogrenci3);
		txtogrenci3.setColumns(10);
		
		JLabel lbl3 = new JLabel("Ogrenci3");
		lbl3.setBounds(57, 163, 69, 14);
		frmCanSistemi.getContentPane().add(lbl3);
		
		JLabel lbl2 = new JLabel("Ogrenci2");
		lbl2.setBounds(57, 112, 69, 14);
		frmCanSistemi.getContentPane().add(lbl2);
		
		JLabel lbl1 = new JLabel("Ogrenci1");
		lbl1.setBounds(57, 66, 69, 14);
		frmCanSistemi.getContentPane().add(lbl1);
		
		JButton btnNewButton = new JButton("Hesapla");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String ogrenci1txt=txtogrenci1.getText();
				String ogrenci2txt=txtogrenci2.getText();
				String ogrenci3txt=txtogrenci3.getText();
				
				Byte ogrenci1not = Byte.valueOf(ogrenci1txt);
				Byte ogrenci2not = Byte.valueOf(ogrenci2txt);
				Byte ogrenci3not = Byte.valueOf(ogrenci3txt);
				
				float ort_not=(ogrenci1not+ogrenci2not+ogrenci3not)/3f;
				if (ogrenci1not>= ort_not) {
					JOptionPane.showMessageDialog(frmCanSistemi, "geçti");
				}else {float kalma_notu =ort_not-ogrenci1not;
				JOptionPane.showMessageDialog(frmCanSistemi,kalma_notu+ "puan altýnda kaldý "+ " Öðrenci 1");
				}
				if (ogrenci2not>= ort_not) {
					JOptionPane.showMessageDialog(frmCanSistemi, "geçti");
				}else {float kalma_notu =ort_not-ogrenci2not;
				JOptionPane.showMessageDialog(frmCanSistemi,kalma_notu+ "puan altýnda kaldý "+" Öðrenci 2");
				}
				if (ogrenci3not>= ort_not) {
					JOptionPane.showMessageDialog(frmCanSistemi, "geçti");
				}else {float kalma_notu =ort_not-ogrenci3not;
				JOptionPane.showMessageDialog(frmCanSistemi,kalma_notu+ "puan altýnda kaldý "+ " Öðrenci 3");
				}
				 
			}
		});
		btnNewButton.setBounds(163, 215, 89, 23);
		frmCanSistemi.getContentPane().add(btnNewButton);
	}
}
