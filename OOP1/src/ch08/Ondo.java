package ch08;

import javax.swing.*;
import java.awt.*;

public class Ondo extends JFrame{
	Ondo(){
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("È­¾¾ ¿Âµµ");
		JTextField tf1 = new JTextField(15);
		JLabel label2 = new JLabel("¼·¾¾ ¿Âµµ");
		JTextField tf2 = new JTextField(15);
		JButton button = new JButton("º¯È¯");
		
		setSize(300,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		tf2.setEnabled(false);
		
		
		this.add(panel);
		panel.add(label1);
		panel.add(tf1);
		panel.add(label2);
		panel.add(tf2);
		panel.add(button);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ondo ondo = new Ondo();
	}

}
