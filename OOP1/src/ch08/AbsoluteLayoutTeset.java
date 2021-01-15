package ch08;

import javax.swing.*;
import java.awt.*;

public class AbsoluteLayoutTeset extends JFrame{
	public AbsoluteLayoutTeset(){
		JPanel panel = new JPanel();
		JButton[] button = new JButton[10];
		
		
		
		
		for(int i = 0;i<button.length;i++) {
			button[i]= new JButton("Button"+i);
			button[i].setBounds((int)(400*Math.random()), (int)(525*Math.random()), 100, 25);
//			this.add(button[i]);
			panel.add(button[i]);
		}
		
		
		setTitle("AbsoluteLayoutTest");
		setResizable(false);
		setSize(500,600);
		panel.setPreferredSize(new Dimension(500,550));
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(null);
		
//		pack();
		
		this.add(panel);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbsoluteLayoutTeset absolute = new AbsoluteLayoutTeset();
	}

}
