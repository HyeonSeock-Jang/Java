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
		button = new JButton("��ư�� �����ÿ�");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		JPanel panel = new JPanel();
		
		setSize(250, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�̺�Ʈ ����");
		setLocationRelativeTo(null);
		setResizable(false);
		button.setFocusable(false);
//		button.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				button.setText("���������ϴ�.");
//				label.setText("���� ������!!!");
//			}
//		});
		button.addActionListener((e)->{
			if(press) {
				button.setText("��ư�� ������5");
				label.setText("�� �ٽ� ��������?????");
				press = false;
			}else {
				button.setText("���������ϴ�.");
				label.setText("������!!!! ���� ������!!!");
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
