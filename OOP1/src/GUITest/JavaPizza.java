package GUITest;

import javax.swing.*;
import java.awt.*;

public class JavaPizza extends JFrame{
	
	JavaPizza(){
		
		JPanel bigPanel = new JPanel();
		JPanel labelPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		
		JLabel congratulation = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���Ͽɰ�...");
		
		JButton comboButton = new JButton("�޺�����");
		JButton potatoButton = new JButton("������������");
		JButton firemeatButton = new JButton("�Ұ������");
		JLabel object = new JLabel("����");
		JTextField quantity = new JTextField(20);
		
		
		setTitle("���� �ֹ�");
		setSize(600,150);
		setResizable(false);
//		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		bigPanel.setBackground(Color.BLUE);
		labelPanel.setBackground(Color.getHSBColor(100, 98, 80));
		buttonPanel.setBackground(Color.MAGENTA);
		buttonPanel.setLayout(new GridLayout());
		
		this.add(bigPanel);
		bigPanel.add(labelPanel);
		labelPanel.add(congratulation);
		bigPanel.add(buttonPanel);
		buttonPanel.add(comboButton);
		buttonPanel.add(potatoButton);
		buttonPanel.add(firemeatButton);
		buttonPanel.add(object);
		buttonPanel.add(quantity);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JavaPizza a = new JavaPizza();
	}
}
