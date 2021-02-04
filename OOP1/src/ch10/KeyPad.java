package ch10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class KeyPad extends JFrame{
//public class KeyPad extends JFrame implements ActionListener{
	private JTextField tf = new JTextField();
	private JButton[] button = new JButton[9];
	private JPanel panel = new JPanel();
	public KeyPad() {
		for(int i = 0;i<button.length;i++) {
			button[i] = new JButton(Integer.toString(i+1));
			button[i].addActionListener((e)->{
				this.tf.setText(this.tf.getText().concat(((JButton)e.getSource()).getText()));
				
//				for(int j = 0;j<button.length;j++) {
//					if(((JButton)e.getSource()).equals(button[j]))
//						this.tf.setText(this.tf.getText().concat(button[j].getText()));			
//					}
			});
			panel.add(button[i]);
		}
		
		setTitle("패널 테스트");
		setSize(500,600);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tf.setEnabled(false);
		panel.setLayout(new GridLayout(3,0,10,10));
		this.add(tf, BorderLayout.NORTH);
		this.add(panel, BorderLayout.CENTER);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeyPad pad = new KeyPad();
	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//		for(int i = 0;i<button.length;i++) {
//
//			if(((JButton)e.getSource()).equals(button[i]))
//				this.tf.setText(this.tf.getText().concat(button[i].getText()));			
//		}
//
//	}
	
}
