package ch08;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame{

	public BorderLayoutTest() {
		JButton button1 = new JButton("Button1");
		JButton button2 = new JButton("Button2");
		JButton button3 = new JButton("Button3");
		JButton button4 = new JButton("Long Name Button4");
		JButton button5 = new JButton("5");
		
//		this.add(button1);
//		this.add(button2);
//		this.add(button3);
//		this.add(button4);
//		this.add(button5);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.add(button1, BorderLayout.NORTH);
		this.add(button2, BorderLayout.EAST);
		this.add(button3, BorderLayout.SOUTH);
		this.add(button4, BorderLayout.CENTER);
		this.add(button5, BorderLayout.WEST);
		pack();
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BorderLayoutTest border = new BorderLayoutTest();
	}

}
