package ch08;

import javax.swing.*;
import java.awt.*;

public class Instant extends JFrame{
	Instant(){
		JPanel panel = new JPanel();
//		JFrame frame = new JFrame();
		JLabel label1 = new JLabel("거리를 입력하시오(단위:km)");
		JTextField tf1 = new JTextField(10);
		JLabel label2 = new JLabel("변환된 거리(단위:마일)");
		JTextField tf2 = new JTextField(10);
		JButton button = new JButton("변환");
		
		setLayout(new BorderLayout());
		setSize(300,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
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
		Instant instantBox = new Instant();
	}

}
