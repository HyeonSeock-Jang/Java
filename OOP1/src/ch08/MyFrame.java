package ch08;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
	
	public MyFrame() {
		JButton button1 = new JButton("�ȳ�!");
		JButton button2 = new JButton("�ȳ�!");
		JButton button3 = new JButton("�ȳ�!");
		JButton button4 = new JButton("�ȳ�!");
		JButton button5 = new JButton("�ȳ�!");
		
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
		
		setTitle("�ƾƾƾ�");
		
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
