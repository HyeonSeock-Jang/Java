package GUITest;

import javax.swing.*;
import java.awt.*;

public class Calcul extends JFrame{
	Calcul(){
		JPanel panel1 = new JPanel();
		JTextField field = new JTextField(500);
		String[] buttonLabel = {
				"Backspace", "", "", "CE", "C",
				"7","8","9","/","sqrt",
				"4","5","6","x","%",
				"1","2","3","-","1/x",
				"+/-","0",".","+","="
		};
		JButton[] button= new JButton[buttonLabel.length];
		int idx = 0;
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++,idx++) {
				button[idx] = new JButton(buttonLabel[idx]);
				button[idx].setBackground(Color.YELLOW);
				if(j<3) {
					button[idx].setForeground(Color.RED);
				}else {
					button[idx].setForeground(Color.BLUE);
				}
				panel1.add(button[idx]);
			}
			
		}
		
		setSize(1000, 300);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		field.setEnabled(false);
		panel1.setLayout(new GridLayout(5,0,5,5));
		
		this.add(field, BorderLayout.NORTH);
		this.add(panel1, BorderLayout.CENTER);
//		for(int i = 0;i<button.length;i++)
			
		setVisible(true);
	}

	public static void main(String[] args) {
		Calcul cal = new Calcul();
	}
}
