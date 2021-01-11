package ch08;

import javax.swing.*;
import java.awt.*;

public class PizzaPanel extends JFrame{
	PizzaPanel(int size){
		JPanel panel = new JPanel();
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		
		JLabel labelA = new JLabel("자바 피자에 오신 것을 환영합니다. 피자의 종류를 선택하시오.");
		JButton buttonCom = new JButton("콤보피자");
		JButton buttonPot = new JButton("포테이토피자");
		JButton buttonFire = new JButton("불고기피자");
		JLabel labelB = new JLabel("개수");
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
