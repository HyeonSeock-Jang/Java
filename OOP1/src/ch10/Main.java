package ch10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener{
	private JButton button;
	private JLabel label;
	private boolean press = false;
	public Main() {
		button = new JButton("버튼을 누르시오");
		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		JPanel panel = new JPanel();
		
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("이벤트 예제");
		setLocationRelativeTo(null);
		setResizable(false);
		button.setFocusable(false);
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				button.setText("눌러졌습니다.");
//				label.setText("누가 눌렀어!!!");
//			}
//		});
		button.addActionListener((e)->{
			if(press) {
				button.setText("버튼을 누르시5");
				label.setText("왜 다시 눌렀지요?????");
				press = false;
			}else {
				button.setText("눌러졌습니다.");
				label.setText("누구야!!!! 누가 눌렀어!!!");
				press = true;
			}
			
		});
		
		add(panel);
		panel.add(button);
		panel.add(label);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
