package ch08;
import javax.swing.*;
import java.awt.*;
public class Calcul extends JFrame{
	Calcul(){
		JTextField tf = new JTextField();
		JPanel panel = new JPanel();
		JButton[] button = new JButton[25];
		String[] str = {"Backspace","","","CE","C",
						"7","8","9","/","sqrt",
						"4","5","6","x","%",
						"1","2","3","-","1/x",
						"0","+/-",".","+","="};
		
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
//		setSize(750, 250);
		panel.setLayout(new GridLayout(5,0,5,5));
		
		tf.setText("0.");
		tf.setEnabled(false);
		int idx = 0;
		for(int rows = 0;rows<5;rows++) {
			for(int cols = 0;cols<5;cols++) {
				button[idx]=new JButton(str[idx]);
				button[idx].setBackground(Color.YELLOW);
//				button[idx].setOpaque(true);//불투명도
//				button[idx].setBackground(new Color(R,G,B);
				if(cols<3)
					button[idx].setForeground(Color.BLUE);
				else
					button[idx].setForeground(Color.RED);
				
				panel.add(button[idx]);
				idx++;
			}
			
		}
		
		this.add(tf,BorderLayout.NORTH);
		this.add(panel);
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcul cal = new Calcul();
	}

}
