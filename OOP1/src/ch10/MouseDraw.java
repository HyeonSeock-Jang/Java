package ch10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MouseDraw extends JFrame {
	public MouseDraw(){
		setSize(700,700);
		setTitle("마우스로 그리기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		add(new MouseDrag());
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		
	}

}
class MouseDrag extends JPanel implements MouseListener, MouseMotionListener{
	private int idx = 0;
	int x, y;
	public MouseDrag(){
		this.addMouseMotionListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
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