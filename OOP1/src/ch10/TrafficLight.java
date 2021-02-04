package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrafficLight extends JFrame{
	
//	JPanel panel = new JPanel();
	public TrafficLight(){
		setSize(350,500);
		setTitle("신호등");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		add(new MyPanel2());
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrafficLight tl = new TrafficLight();
	}

}
class MyPanel2 extends JPanel implements ActionListener{
	private int lightNumber = 0;
	public MyPanel2() {
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic light turn on");
		b.addActionListener(this);
		add(b,BorderLayout.SOUTH);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		g.setColor(Color.black);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		System.out.println("그려짐");
		if(lightNumber ==0) {
			g.setColor(Color.GREEN);
			g.fillOval(100,100,100,100);
		}else if (lightNumber ==1) {
			g.setColor(Color.YELLOW);
			g.fillOval(100,200,100,100);
		}else {
			g.setColor(Color.RED);
			g.fillOval(100,300,100,100);
		}
//		switch(lightNumber){
//		case 0:
//			g.setColor(Color.GREEN);
//			g.fillOval(100,100,100,100);
//			break;
//		case 1:
//			g.setColor(Color.YELLOW);
//			g.fillOval(100,200,100,100);
//			break;
//		case 2:
//			g.setColor(Color.RED);
//			g.fillOval(100,300,100,100);
//			break;
//		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		(e.getSource()).
		System.out.println("Arg");
		if(lightNumber++>=2)lightNumber = 0;
		this.repaint();
	}
	
}