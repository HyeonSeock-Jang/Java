package ch10;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.Image.*;
import java.io.*;

public class Car2 extends JFrame{
	public Car2() {		
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		add(new MyPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car = new Car2();
	}

}
class MyPanel extends JPanel implements KeyListener{
	private BufferedImage img = null;
	private int imgX = 100, imgY = 100;
	
	public MyPanel() {
		try {
			img = ImageIO.read(new File("src\\GUITest\\bang.png"));
		}catch(IOException e) {
			System.exit(1);
		}
		addKeyListener(this);
		
		setFocusable(true);
		requestFocus();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
//		switch(e.getKeyCode()) {
//		case KeyEvent.VK_UP:
//			if(label.getY()>-150)
//			label.setLocation(label.getX(), label.getY()-10);
//			break;
//		case KeyEvent.VK_LEFT:
//			if(label.getX()>0)
//			label.setLocation(label.getX()-10, label.getY());
//			break;
//		case KeyEvent.VK_RIGHT:
//			if(label.getX()<300)
//			label.setLocation(label.getX()+10, label.getY());
//			break;
//		case KeyEvent.VK_DOWN:
//			if(label.getY()<150)
//			label.setLocation(label.getX(), label.getY()+10);
//			break;
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawImage(img,imgX,imgY,null);
		System.out.println("component");
	}
	
}