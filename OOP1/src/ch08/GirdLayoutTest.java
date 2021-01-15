package ch08;

import javax.swing.*;
import java.awt.*;

public class GirdLayoutTest extends JFrame{
	public GirdLayoutTest(){
//		JButton button1 = new JButton("Button1");
//		JButton button2 = new JButton("Button2");
//		JButton button3 = new JButton("Button3");
//		JButton button4 = new JButton("Long Name Button4");
//		JButton button5 = new JButton("5");
		for(int i = 1; i<51;i++) {
			JButton button;
			if(i%3==0) {
				button = new JButton(""+i);
			}else if(i%4==0) {
				button = new JButton("Long Button"+i);
			}else if(i%5==0) {
				button = new JButton("blasd");
			}else {
				button = new JButton("Button"+i);
			}
			this.add(button);
		}
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(0,5,5,5));
		
//		this.add(button1);
//		this.add(button2);
//		this.add(button3);
//		this.add(button4);
//		this.add(button5);
		
		pack();
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GirdLayoutTest grid = new GirdLayoutTest();
	}

}
