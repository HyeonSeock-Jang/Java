package ch08;

import javax.swing.*;
import java.awt.*;

public class PizzaPanel extends JFrame{
	PizzaPanel(int size){
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel labelA = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		JButton buttonCom = new JButton("�޺�����");
		JButton buttonPot = new JButton("������������");
		JButton buttonFire = new JButton("�Ұ������");
		JLabel labelB = new JLabel("����");
		JTextField tf = new JTextField(10);
		
		setSize(750, 150);
		setTitle("JavaPizza");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		
		String str = ""+size;
		tf.setText(str);
		tf.setEnabled(false);
		
		this.add(panel);
		panel.add(panelA);
		panelA.add(labelA);
		panel.add(panelB);
		panelB.add(buttonCom);
		panelB.add(buttonPot);
		panelB.add(buttonFire);
		panelB.add(labelB);
		panelB.add(tf);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaPanel pizza = new PizzaPanel(50);
	}

}
