package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Draw2 extends JFrame{
//	recPanel rec = new recPanel();
	public Draw2() {
		setSize(700,700);
		setTitle("사각형 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
//		rec.setSize(700, 700);
//		add(rec);
		add(new recPanel());
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectanglesMake rect = new rectanglesMake();
	}

}
class Rectangle2{
	int x,y,w,h;
	public Rectangle2() {
		
	}
	public Rectangle2(int x, int y, int w, int h) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
	}
}
class recPanel2 extends JPanel{
	Rectangle2[] rectangles = new Rectangle2[100];
	
	int idx = 0;
	public recPanel2() {
		rectangles[0]=new Rectangle2();
		addMouseListener(new MyMouseListener());
	}
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
//		super.paintComponents(g);
		
//		for(Rectangle r: rectangles) {
//			if (r == null)break;
//			g.drawRect(r.x, r.y, r.w, r.h);
//		}
		if(rectangles[0]==null)return;
		System.out.println(rectangles[0].x);
		g.drawRect(rectangles[idx].x, rectangles[idx].y, 50, 50);
	}
	class MyMouseListener extends MouseAdapter {
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
//				rectangles[idx] = (e.getX(),e.getY(), 50, 50);
			rectangles[idx].x=e.getX();
			rectangles[idx].y=e.getY();
			rectangles[idx].w=50;
			rectangles[idx].h=50;
//				idx++;
			System.out.println(rectangles[0].x);
			repaint();
		}
	}
}