package EventAction;

import javax.swing.*;
import java.awt.event.*;

public class RamdaListener extends JFrame{
	RamdaListener(){
		JPanel panel = new JPanel();
		JButton button = new JButton("눌러주세요");
		JLabel label = new JLabel("입력되지 않았습니다");
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(e.getSource()==button) {
//					button.setText("입력되었습니다.");
//					label.setText("입력하셨습니다");
//				}
//			}
//		});
		button.addActionListener((e)->{
			if(e.getSource()==button) {
				button.setText("입력되었습니다.");
				label.setText("입력하셨습니다");
			}
		});
		
		
		this.add(panel);
		panel.add(button);
		panel.add(label);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RamdaListener ramda = new RamdaListener();
	}

}
