package GUITest;

import javax.swing.*;
import java.awt.*;

public class LayoutManager extends JFrame{
	JButton b1;
	private JButton b2, b3;
	
	public LayoutManager() {
			
		JPanel panel = new JPanel();
		JButton button = new JButton();
		JTextField field = new JTextField(20);
		
		b1 = new JButton("Button #1");
		b2 = new JButton("Button #2");
		b3 = new JButton("Button #3");
		
		
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("아니야 안돼!");
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		panel.setLayout(null);
		panel.setBackground(Color.BLUE);
		button.setText("눌러주세요~");
		field.setText("안돼!");

		
		
		b1.setBounds(20, 5, 95, 30);
		b2.setBounds(55, 45, 105, 70);
		b3.setBounds(180, 15, 105, 90);
		button.setBounds(20, 150, 105, 30);
		field.setBounds(240, 100, 50, 150);
		panel.setBounds(10, 10, 400, 250);
		
		this.add(panel);
		panel.add(field);
		panel.add(button);
		panel.add(b1);
		panel.add(b2);
		panel.add(b3);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		LayoutManager layout = new LayoutManager();
	}
}
