package EventAction;

import javax.swing.*;
import java.awt.event.*;

public class RamdaListener extends JFrame{
	RamdaListener(){
		JPanel panel = new JPanel();
		JButton button = new JButton("�����ּ���");
		JLabel label = new JLabel("�Էµ��� �ʾҽ��ϴ�");
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
//		button.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				if(e.getSource()==button) {
//					button.setText("�ԷµǾ����ϴ�.");
//					label.setText("�Է��ϼ̽��ϴ�");
//				}
//			}
//		});
		button.addActionListener((e)->{
			if(e.getSource()==button) {
				button.setText("�ԷµǾ����ϴ�.");
				label.setText("�Է��ϼ̽��ϴ�");
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
