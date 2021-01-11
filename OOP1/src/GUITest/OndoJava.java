package GUITest;

import java.util.*;
import javax.swing.*;
import java.awt.*;

public class OndoJava extends JFrame{
	
	OndoJava(){
//		JFrame a = new JFrame();
		setSize(300,150);
		setTitle("È­¾¾¸¦ ¼·¾¾·Î ¹Ù²Ù±â");
//		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JPanel panel = new JPanel();
		JLabel label1 = new JLabel("È­¾¾ ¿Âµµ");
		JLabel label2 = new JLabel("¼·¾¾ ¿Âµµ");
		JTextField field1 = new JTextField(15);
		JTextField field2 = new JTextField(15);//Textfield±æÀÌ
		JButton button = new JButton("º¯È¯");
		
		this.add(panel);
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		OndoJava a = new OndoJava();
	}
}
