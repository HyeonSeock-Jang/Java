package ch08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Cal extends JFrame implements ActionListener{
	private JTextField tf = new JTextField();
	private JPanel panel1 = new JPanel();
	private JButton plmi = new JButton("(-)");
	private JButton del = new JButton("Delete");
	private JButton cle = new JButton("Clear");
	private JButton add, min, mul, div, dec, equ;
	private JButton[] numButton= new JButton[10]; 
	private Font myFont = new Font(Font.SANS_SERIF, Font.BOLD | Font.ITALIC, 30);
	private ImageIcon img = new ImageIcon("src\\GUITest\\7joun.png");
	
	private double num1;
	private double num2;
	private double result;
	private String operation;

	public Cal() {
		add = new JButton("+");
		min = new JButton("-");
		mul = new JButton("*");
		div = new JButton("/");
		dec = new JButton(".");
		equ = new JButton("=");
		
		
		setTitle("Calculator");
		setSize(420,550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLayout(null);
		setLocationRelativeTo(null);
//		JPanel back = new JPanel() {
//			public void paintCompopent(Graphics g) {
//				g.drawImage(img.getImage(),0,0,null);
//				setOpaque(false);
//				super.paintComponent(g);
//			}
//		};
//		JScrollPane scp=new JScrollPane(back);
//		setContentPane(scp);
		
		
		tf.setEnabled(false);
		tf.setFont(myFont);
		tf.setBounds(50,25,300,50);
		panel1.setLayout(new GridLayout(4,0,10,10));
		panel1.setBounds(50, 100, 300, 300);
		for(int i =0;i<numButton.length;i++) {
			numButton[i]=new JButton(String.valueOf(i));
			numButton[i].setFont(myFont);
			numButton[i].setFocusable(false);
			numButton[i].addActionListener(this);
//			numButton[i].setIcon(img);
			//눌렀을때 재 사용될 수 있게 남는거 있잖아...
			//enter누르면 재실행 되는거 등...
		}
		
		
		
		add.setFont(myFont);
		add.setFocusable(false);
		add.addActionListener(this);
		min.setFont(myFont);
		min.setFocusable(false);
		min.addActionListener(this);
		mul.setFont(myFont);
		mul.setFocusable(false);
		mul.addActionListener(this);
		div.setFont(myFont);
		div.setFocusable(false);
		div.addActionListener(this);
		dec.setFont(myFont);
		dec.setFocusable(false);
		dec.addActionListener(this);
		equ.setFont(myFont);
		equ.setFocusable(false);
		equ.addActionListener(this);
		plmi.setFont(myFont);
		plmi.setFocusable(false);
		plmi.addActionListener(this);
		del.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		del.setFocusable(false);
		del.addActionListener(this);
		cle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		cle.setFocusable(false);
		cle.addActionListener(this);
		plmi.setBounds(50, 430, 100, 50);
		del.setBounds(150, 430, 100, 50);
		cle.setBounds(250, 430, 100, 50);
		
		this.add(tf);
		this.add(panel1);
		panel1.add(numButton[1]);
		panel1.add(numButton[2]);
		panel1.add(numButton[3]);
		panel1.add(add);
		panel1.add(numButton[4]);
		panel1.add(numButton[5]);
		panel1.add(numButton[6]);
		panel1.add(min);
		panel1.add(numButton[7]);
		panel1.add(numButton[8]);
		panel1.add(numButton[9]);
		panel1.add(mul);
		panel1.add(dec);
		panel1.add(numButton[0]);
		panel1.add(equ);
		panel1.add(div);
		this.add(plmi);
		this.add(del);
		this.add(cle);
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0; i <numButton.length;i++) {
			if(e.getSource()==numButton[0]&&tf.getText().equals(""))
				break;
			if(e.getSource()==numButton[i]) {
				System.out.println(i+" 버튼이 클릭되었습니다.");
				String str = tf.getText();
				tf.setText(str.concat(String.valueOf(i)));
				break;
			}
		}
		if(e.getSource() == dec) {
			String str = tf.getText();
			if(str.contains(".")) {
				
			}else {
				tf.setText(str.concat("."));
			}
			
			System.out.println("decimal 버튼이 클릭되었습니다");
		}else if(e.getSource() == add||e.getSource() == min||e.getSource() == mul||e.getSource() == div) {
			String str = tf.getText();
			if(str.equals("")==false) {
				num1 = Double.parseDouble(str);
				operation = ((JButton)(e.getSource())).getText();
				tf.setText("");
			}
			System.out.println(((JButton)(e.getSource())).getText()+" 버튼이 클릭되었습니다");
			
		}else if(e.getSource() == equ) {
			System.out.println("= 버튼이 클릭되었습니다");
			String str = tf.getText();
			if(str!=null&&operation!=null) {
				num2 = Double.parseDouble(str);
				switch(operation) {
				case "+":
					result=num1+num2;
					break;
				case "-":
					result=num1-num2;
					break;
				case "*":
					result=num1*num2;
					break;
				case "/":
					if(num2!=0)
						result=num1/num2;
					break;
					
				}
				tf.setText(String.valueOf(result));
			}
		}else if(e.getSource() == cle) {
			tf.setText("");
			operation = null;
			System.out.println("clear 버튼이 클릭되었습니다");
		}else if(e.getSource() == del) {
			
			String str = tf.getText();
			
			
			if(str!=null) 
				tf.setText(str.substring(0, str.length()-1));
			
			
			System.out.println("Delete 버튼이 클릭되었습니다");
		}else if(e.getSource() == plmi) {
			String str = tf.getText();
			double tmp;
			if(!str.equals("")) {
				tmp = Double.parseDouble(str);
				tmp *= -1;
				tf.setText(String.valueOf(tmp));
			}
			
			
			System.out.println("네거티브 버튼이 클릭되었습니다");
		}
		/*
		 * GUI에서 내부적으로 try catch가 있어 멀쩡하게 실행은 됨...
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal cal = new Cal();
	}

}
