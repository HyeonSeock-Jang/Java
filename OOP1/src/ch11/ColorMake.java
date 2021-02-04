package ch11;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.*;
import java.util.*;
public class ColorMake extends JFrame implements ChangeListener, ActionListener{
	private JColorChooser colorChooser = new JColorChooser();
	private JPanel panel = new JPanel();
	private JButton btn = new JButton("선택");
	private MyColorDrawingPanel mdPanel = new MyColorDrawingPanel();
	public ColorMake(){
		this.setSize(700, 400);
		this.setTitle("색상선택기");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		colorChooser.getSelectionModel().addChangeListener(this);
//		ColorSelectionModel cl = colorChooser.getSelectionModel();
//		cl.addChangeListener(this);
		btn.addActionListener(this);
		panel.add(colorChooser);
		this.add(panel, BorderLayout.CENTER);
		this.add(btn, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		ColorMake cm = new ColorMake();
	}
	
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		System.out.println(colorChooser.getColor());
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand();
		if(action.equals("선택")) {
			this.remove(panel);
			this.add(mdPanel, BorderLayout.CENTER);
			mdPanel.color = colorChooser.getColor();
			btn.setText("선택완료");
			repaint();
		}else {
			this.add(panel, BorderLayout.CENTER);
			this.remove(mdPanel);
			btn.setText("선택");
		}
		repaint();
	}
	
}

class MyColorDrawingPanel extends JPanel implements MouseMotionListener{
	Color color = Color.BLACK;
	ArrayList<Point> points = new ArrayList<>();
	
	class Point{
		int x, y;
		Color color;
	}
	public MyColorDrawingPanel() {
		this.addMouseMotionListener(this);
	}
	
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(color);
		
		
		for(int i = 0;i<points.size();i++) {
			g.setColor(points.get(i).color);
			g.drawRect(points.get(i).x, points.get(i).y, 1, 1);
		}
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		Point p = new Point();
		// TODO Auto-generated method stub
		p.x = e.getX();
		p.y = e.getY();
		p.color = color;
		points.add(p);
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

class MyColorPanel extends JPanel implements MouseMotionListener{
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
