package EventAction;

import javax.swing.*;
import java.awt.event.*;


public class MyListener extends JFrame{
	JLabel label = new JLabel("���� �Էµ��� �ʾҽ��ϴ�.");
	JButton button = new JButton("�����ּ���~");
	MyListener(){
		JPanel panel = new JPanel();
		
		
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		panel.setLayout(null);
		button.setBounds(300, 100, 120, 50);
		label.setBounds(200,200,150,70);
		button.addActionListener(new Listener());
		
		this.add(panel);
		panel.add(button);
		panel.add(label);
		
		setVisible(true);
	}
	public class Listener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button&&button.getText().equals("�������ϴ�")) {
				button.setText("�����ּ���~");
				label.setText("�Է����ּ���~");
			}else {
				button.setText("�������ϴ�");
				label.setText("�ԷµǾ����ϴ�");
			}
//			JButton button = (JButton)e.getSource();
			
		}
	}
	public static void main(String[] args) {
		MyListener box = new MyListener();
	}
}

