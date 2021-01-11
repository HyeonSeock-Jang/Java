package GUITest;

import javax.swing.*;
import java.awt.*;

public class JavaPizza extends JFrame{
	
	JavaPizza(){
		
		JPanel bigPanel = new JPanel();
		JPanel labelPanel = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		
		JLabel congratulation = new JLabel("자바 피자에 오신 것을 환영하옵고...");
		
		JButton comboButton = new JButton("콤보피자");
		JButton potatoButton = new JButton("포테이토피자");
		JButton firemeatButton = new JButton("불고기피자");
		JLabel object = new JLabel("개수");
		JTextField quantity = new JTextField(20);
		
		
		setTitle("피자 주문");
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
