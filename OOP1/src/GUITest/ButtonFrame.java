package GUITest;

import javax.swing.*;
import java.awt.*;

public class ButtonFrame extends JFrame{
	ButtonFrame(){
		JPanel panel = new JPanel();
		
		
		
		setTitle("눌러보세요~");
		setSize(500,300);
		
		setResizable(false);

//		panel.setLayout(new FlowLayout());
		panel.setLayout(new GridLayout(4,0,5,5));
//		new GridLayout(세로필요 정렬 갯수, 가로정렬 갯수, 가로 간격, 세로 간격);
		
		this.add(panel);
		for(int i = 0;i<10;i++)
			panel.add(new JButton("눌러주세요~"+i));
		
		setVisible(true);
	}
	public static void main(String[] args) {
		ButtonFrame frame = new ButtonFrame();
	}
}
