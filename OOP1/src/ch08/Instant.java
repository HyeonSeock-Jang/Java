package ch08;

import javax.swing.*;
import java.awt.*;

public class Instant extends JFrame{
	Instant(){
		JPanel panel = new JPanel();
//		JFrame frame = new JFrame();
		JLabel label1 = new JLabel("�Ÿ��� �Է��Ͻÿ�(����:km)");
		JTextField tf1 = new JTextField(10);
		JLabel label2 = new JLabel("��ȯ�� �Ÿ�(����:����)");
		JTextField tf2 = new JTextField(10);
		JButton button = new JButton("��ȯ");
		
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
