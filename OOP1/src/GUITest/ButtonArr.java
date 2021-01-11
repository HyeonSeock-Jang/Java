package GUITest;

import javax.swing.*;
import java.awt.*;

public class ButtonArr extends JFrame{
	
	ButtonArr(){
		this(10);
	}

	ButtonArr(int length){
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JLabel label = new JLabel("자동생성중...");
		JButton[] button = new JButton[length];
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(new FlowLayout());
		panel2.setLayout(null);
//		panel2.setSize(500, 400);
		panel2.setPreferredSize(new Dimension(500,400));
		
		this.add(panel1);
		panel1.add(label);
		this.add(panel2);
		setVisible(true);
		for(int i = 0;i<length;i++) {
			
			if(i%2==0)
				button[i] = new JButton("☆");
			else
				button[i] = new JButton("★");
			button[i].setBounds((int)(500*Math.random()*0.8), (int)(400*Math.random()*0.8), 50, 50);
			panel2.add(button[i]);
//			try {
//				Thread.sleep(100);
//			}
//			catch(InterruptedException e){
//				e.printStackTrace();
//			}
//			setVisible(true);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonArr arr = new ButtonArr(30);
	}

}
