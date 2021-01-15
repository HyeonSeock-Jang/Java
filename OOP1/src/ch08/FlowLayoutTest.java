package ch08;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame{
	public FlowLayoutTest() {
		JPanel panel = new JPanel();
//		for(int i =0;i<10;i++) {
//			JButton button;
//			if(i == 5) {
//				button = new JButton("Long Button"+i);
//			}else if(i == 6) {
//				button = new JButton(""+i);
//			}else {
//				button = new JButton("Button"+i);
//			}
//			
//			panel.add(button);
//		}
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Long Name Button4");
		JButton button5 = new JButton("5");
		
		
		
		setLayout(new FlowLayout());
		
//		setSize(600, 600);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		this.add(panel);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		pack();
//		this.add(button1, BorderLayout.NORTH);
//		this.add(button2, BorderLayout.EAST);
//		this.add(button3, BorderLayout.SOUTH);
//		this.add(button4, BorderLayout.CENTER);
//		this.add(button5, BorderLayout.WEST);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlowLayoutTest frame = new FlowLayoutTest();
	}

}
