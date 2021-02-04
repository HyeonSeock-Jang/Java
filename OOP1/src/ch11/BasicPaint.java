package ch11;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
//public class BasicPaint extends JFrame{
public class BasicPaint{
//	public BasicPaint() {
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLocationRelativeTo(null);
//		setResizable(false);
//		setSize(500, 500);
//		add(new MyDrawingPanel());
//		setVisible(true);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BasicPaint BP = new BasicPaint();
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.add(new MyDrawingPanel());
		f.setSize(500, 500);
		
		f.setVisible(true);
	}

}
class MyDrawingPanel extends JPanel{
	private int squareX = 50;
	private int squareY = 50;
	private int squareW = 20;
	private int squareH = 20;
	public MyDrawingPanel() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				drawSquare(e.getX(), e.getY());
			}
			
		});
		this.addMouseMotionListener(new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				drawSquare(e.getX(), e.getY());
			}
			
		});
	}
	private void drawSquare(int x, int y) {
		repaint(squareX,squareY,20+2,20+2);
		squareX = x;
		squareY = y;
		repaint(x,y,20,20);
		
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.drawString("마우스를 클릭하면 사각형이 그려집니다.", 10, 20);
		g.setColor(Color.BLUE);
		g.fillRect(squareX, squareY, squareW, squareH);
		
		g.setColor(Color.BLACK);
		g.drawRect(squareX, squareY, squareW, squareH);
	}
	
}