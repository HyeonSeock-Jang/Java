package GUITest;

import javax.swing.*;
import java.awt.*;

public class Nansu extends JFrame{
	Nansu(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		JPanel panel = new JPanel();
		
		setSize(700,500);
		setTitle("난수생성중...");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panel.setLayout(null);
//		Image img = kit.getImage("src\\GUITest\\7joun.png");
		panel.setBackground(Color.YELLOW);
		

		this.add(panel);
		for(int i = 0; i<50; i++) {
			JLabel label = new JLabel(""+i);
			label.setBounds((int)(700*Math.random()), (int)(500*Math.random()), 20,20);
			label.setForeground(Color.MAGENTA);
			panel.add(label);
//			try {
//				Thread.sleep(1000);
//			}catch(InterruptedException e){
//				System.out.println("방해되었습니다.");
//			}
		}
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nansu nansu = new Nansu();
	}

}
