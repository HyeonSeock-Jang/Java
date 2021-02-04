package ch11;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class LinePaint extends JFrame{
	public LinePaint() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("¾ó±¼");
		this.add(new MyDrawingFace());
		
		
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinePaint lp = new LinePaint();
	}

}
class MyDrawingFace extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.YELLOW);
		g.fillOval(20, 30, 200,200);
		g.setColor(Color.BLACK);
		g.drawOval(20,30,200,200);
//		g.drawArc(60,80,50,50,180,-180);
//		g.drawArc(150,80,50,50,180,-180);
//		g.drawArc(70,130,100,70,180,180);
		g.drawArc(60,60,50,50,360,-180);
		g.drawArc(150,60,50,50,360,-180);
		g.drawArc(70,150,100,70,360,180);
	}
	
}