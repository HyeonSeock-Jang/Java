package ch08;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		JButton button1 = new JButton("¾È³ç!");
		JButton button2 = new JButton("¾È³ç!");
		JButton button3 = new JButton("¾È³ç!");
		JButton button4 = new JButton("¾È³ç!");
		JButton button5 = new JButton("¾È³ç!");
		
		setLayout(null);
		setSize((int)(Math.random()*300)+500,(int)(Math.random()*200)+400);
		button1.setBounds((int)(this.getWidth()*Math.random()*0.8), (int)(this.getHeight()*Math.random()*0.8), (int)(Math.random()*10)+100, (int)(Math.random()*10)+50);
		button2.setBounds((int)(this.getWidth()*Math.random()*0.8), (int)(this.getHeight()*Math.random()*0.8), (int)(Math.random()*10)+100, (int)(Math.random()*10)+50);
		button3.setBounds((int)(this.getWidth()*Math.random()*0.8), (int)(this.getHeight()*Math.random()*0.8), (int)(Math.random()*10)+100, (int)(Math.random()*10)+50);
		button4.setBounds((int)(this.getWidth()*Math.random()*0.8), (int)(this.getHeight()*Math.random()*0.8), (int)(Math.random()*10)+100, (int)(Math.random()*10)+50);
		button5.setBounds((int)(this.getWidth()*Math.random()*0.8), (int)(this.getHeight()*Math.random()*0.8), (int)(Math.random()*10)+100, (int)(Math.random()*10)+50);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		setTitle("¾Æ¾Æ¾Æ¾Ç");
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame my = new MyFrame();
	}

}
