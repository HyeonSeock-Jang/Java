package EventAction;

import javax.swing.*;
import java.awt.event.*;


public class MyListener extends JFrame{
	JLabel label = new JLabel("아직 입력되지 않았습니다.");
	JButton button = new JButton("눌러주세요~");
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
			if(e.getSource()==button&&button.getText().equals("눌렀습니다")) {
				button.setText("눌러주세요~");
				label.setText("입력해주세요~");
			}else {
				button.setText("눌렀습니다");
				label.setText("입력되었습니다");
			}
//			JButton button = (JButton)e.getSource();
			
		}
	}
	public static void main(String[] args) {
		MyListener box = new MyListener();
	}
}

