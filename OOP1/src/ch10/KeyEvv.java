package ch10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyEvv extends JFrame implements KeyListener{
	private JPanel panel;
	private JTextField field;
	private JTextArea area;
	public KeyEvv(){
		panel = new JPanel(new GridLayout(0,2));
		panel.add(new JLabel("문자를 입력하시오"));
		field = new JTextField(10);
		field.addKeyListener(this);
		
		area = new JTextArea(3,15);
		area.setEnabled(false);
		setSize(400,800);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setResizable(false);
		
		add(panel, BorderLayout.NORTH);
		add(area, BorderLayout.CENTER);
		panel.add(field);
		setVisible(true);
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("눌렀습니다");
		display(e);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("눌렀습니다!");
		display(e);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("눌렀습니다@");
		display(e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyEvv ev = new KeyEvv();
	}
	public void display(KeyEvent e) {
		char ch = e.getKeyChar();
		int keyCode = e.getKeyCode();
		area.append(ch+", "+keyCode+", shift: "+e.isShiftDown()+", ctrl: "+e.isControlDown()+", alt: "+e.isAltDown()+"\n");
	}
}
