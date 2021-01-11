package GUITest;

import javax.swing.*;
import java.awt.*;

public class ButtonDemo extends JFrame{
	ButtonDemo(){
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Disable middle button ¢º");
		JButton button2 = new JButton("Middle button");
		JButton button3 = new JButton("¢¸ Enable middle button");
		
		setSize(500,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		button3.setEnabled(false);
		button2.setPreferredSize(new Dimension(130,50));
		
		
		this.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonDemo demo = new ButtonDemo();

	}

}
