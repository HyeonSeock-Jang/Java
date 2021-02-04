package GUITest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Counter extends JFrame implements ActionListener{
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JButton[] button = new JButton[2];
	public Counter () {
		button[0] = new JButton("increase");
		button[1] = new JButton("decrease");
		setSize(750,750);
		setTitle("д╚©Нем");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		label.setText("0");
		label.setFont(new Font("Serif",Font.BOLD|Font.ITALIC,100));
		button[0].addActionListener(this);
		button[1].addActionListener(this);
		add(panel);
		panel.add(label);
		panel.add(button[0]);
		panel.add(button[1]);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter ct = new Counter();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(((JButton)e.getSource()).getText().equals("increase")) {
			this.label.setText(Integer.toString((Integer.parseInt((label.getText()))+1)));
			
		}else {
			this.label.setText(Integer.toString((Integer.parseInt((label.getText()))-1)));
		}
		
	}

}
