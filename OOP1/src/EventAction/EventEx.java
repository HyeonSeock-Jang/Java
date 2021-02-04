package EventAction;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;

public class EventEx extends JFrame implements ActionListener{
	
	JPanel panel = new JPanel();
	JButton[] button=new JButton[3];
	public EventEx() {
//		Toolkit kit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<button.length;i++) {
			button[i]=new JButton((i+1)+"번째 Color");
			button[i].setFocusable(false);
			button[i].addActionListener(this);
			panel.add(button[i]);
		}
		this.setBackground(Color.BLACK);
		setTitle("배경 바꾸기 연습");
		setSize(500,400);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src\\GUITest\\7joun.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		panel.setBackground(new Color(255,15,0));
		panel.setOpaque(false);
		
		this.add(panel);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventEx ev = new EventEx();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i<this.button.length;i++) {
			if(e.getSource()==this.button[0]) {
				panel.setBackground(new Color(255,15,0));
				panel.setOpaque(false);
			}else if(e.getSource()==this.button[1]) {
				panel.setBackground(new Color(54,61,153));
				panel.setOpaque(true);
			}else if(e.getSource()==this.button[2]) {
				panel.setBackground(new Color(255,116,109));
				panel.setOpaque(true);
			}
		}
		
	}

}
