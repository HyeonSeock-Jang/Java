package GUITest;

import javax.swing.*;
import java.awt.*;

public class ButtonFrame extends JFrame{
	ButtonFrame(){
		JPanel panel = new JPanel();
		
		
		
		setTitle("����������~");
		setSize(500,300);
		
		setResizable(false);

//		panel.setLayout(new FlowLayout());
		panel.setLayout(new GridLayout(4,0,5,5));
//		new GridLayout(�����ʿ� ���� ����, �������� ����, ���� ����, ���� ����);
		
		this.add(panel);
		for(int i = 0;i<10;i++)
			panel.add(new JButton("�����ּ���~"+i));
		
		setVisible(true);
	}
	public static void main(String[] args) {
		ButtonFrame frame = new ButtonFrame();
	}
}
