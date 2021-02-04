package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class carMove extends JFrame implements KeyListener{
	private JLabel label;
	public carMove(){
		label = new JLabel();
		ImageIcon img = new ImageIcon("src\\GUItest\\bang.png");
		
		label.setIcon(img);
		addKeyListener(this);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		add(label);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carMove mv = new carMove();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		/*
		 * 37аб
		 * 38╩С
		 * 39©Л
		 * 40го
		 */
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyCode()) {
			case KeyEvent.VK_UP:
				if(label.getY()>-150)
				label.setLocation(label.getX(), label.getY()-10);
				break;
			case KeyEvent.VK_LEFT:
				if(label.getX()>0)
				label.setLocation(label.getX()-10, label.getY());
				break;
			case KeyEvent.VK_RIGHT:
				if(label.getX()<300)
				label.setLocation(label.getX()+10, label.getY());
				break;
			case KeyEvent.VK_DOWN:
				if(label.getY()<150)
				label.setLocation(label.getX(), label.getY()+10);
				break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
