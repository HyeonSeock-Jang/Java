package EventAction;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Cal extends JFrame implements ActionListener{
	private JTextField tf = new JTextField();
	private JPanel panel = new JPanel();

	private JButton[] button = new JButton[10];
	private JButton plmi, dot, add, min, pro, div, eql, del, clr;
	private Font font = new Font(Font.SANS_SERIF,Font.BOLD,30);
	 
	private String calNum = "";
	private String opNum = "";
	private String op = "";
	private boolean calcul = false;
	
	Cal(){
		for(int i = 0; i<button.length;i++) {
			button[i]=new JButton(String.valueOf(i));
			button[i].setFocusable(false);
			button[i].setFont(font);
			button[i].addActionListener(this);
		}
		eql=new JButton("=");
		del=new JButton("Delete");
		clr=new JButton("Clear");
		
		setTitle("Calculator");
		setSize(500,750);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		tf.setBounds(50, 50, 400, 100);
		tf.setEnabled(false);
		tf.setFont(font);
		panel.setBounds(50, 160, 400, 400);
		panel.setLayout(new GridLayout(4,0,10,10));
		
		plmi=new JButton("+/-");
		plmi.setFocusable(false);
		plmi.setFont(font);
		plmi.addActionListener(this);
		dot=new JButton(".");
		dot.setFocusable(false);
		dot.setFont(font);
		dot.addActionListener(this);
		add=new JButton("+");
		add.setFocusable(false);
		add.setFont(font);
		add.addActionListener(this);
		min=new JButton("-");
		min.setFocusable(false);
		min.setFont(font);
		min.addActionListener(this);
		pro=new JButton("*");
		pro.setFocusable(false);
		pro.setFont(font);
		pro.addActionListener(this);
		div=new JButton("/");
		div.setFocusable(false);
		div.setFont(font);
		div.addActionListener(this);
		add=new JButton("+");
		add.setFocusable(false);
		add.setFont(font);
		add.addActionListener(this);
		
		
		eql.setBounds(50, 590, 120, 100);
		eql.setFocusable(false);
		eql.setFont(font);
		eql.addActionListener(this);
		del.setBounds(190, 590, 120, 100);
		del.setFocusable(false);
		del.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		del.addActionListener(this);
		clr.setBounds(330, 590, 120, 100);
		clr.setFocusable(false);
		clr.setFont(font);
		clr.addActionListener(this);
		
		
		this.add(tf);
		this.add(panel);
		this.add(eql);
		this.add(del);
		this.add(clr);
		panel.add(button[7]);
		panel.add(button[8]);
		panel.add(button[9]);
		panel.add(add);
		panel.add(button[4]);
		panel.add(button[5]);
		panel.add(button[6]);
		panel.add(min);
		panel.add(button[3]);
		panel.add(button[2]);
		panel.add(button[1]);
		panel.add(pro);
		panel.add(plmi);
		panel.add(button[0]);
		panel.add(dot);
		panel.add(div);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(int i = 0;i<10;i++) {
			if(calcul) {
				calcul = false;
			}
			if(e.getSource()==button[i]) {
				String str = tf.getText();
				if (tf.getText().equals("0")) {
					str = "";
			}
				
				tf.setText(str.concat(String.valueOf(i)));
			}
		}
		if(e.getSource()==add||e.getSource()==min||e.getSource()==pro||e.getSource()==div) {
			String str = tf.getText();
			if(calNum.equals("")) {
				op = ((JButton)(e.getSource())).getText();
				try {
					double test = Double.parseDouble(str);
					calNum = str;
				}catch(Exception a) {
					calNum = "0";
				}
				tf.setText("");
			}else {
				int a = 0;
				if(e.getSource()==add) {
					a=1;
				}else if(e.getSource()==min) {
					a=2;
				}else if(e.getSource()==pro) {
					a=3;
				}else if(e.getSource()==div) {
					a=4;
				}
				e.setSource(eql);
				this.actionPerformed(e);
				calNum = tf.getText();
				
				if(a==1) {
					e.setSource(add);
				}else if(a==2) {
					e.setSource(min);
				}else if(a==3) {
					e.setSource(pro);
				}else if(a==4) {
					e.setSource(div);
				}
				opNum = "";
				tf.setText("");
				calcul = false;
			}
			
		}else if(e.getSource()==dot) {
			String str = tf.getText();
			boolean find = true;
			for (int i = 0;i<str.length();i++) {
				if(str.charAt(i)=='.') {
					find = false;
					break;
				}
			}
			if(find)
				tf.setText(str.concat("."));
		}else if(e.getSource()==plmi) {
			String str = tf.getText();
			double num = 0;
			try {
				num = Double.parseDouble(str)*-1;
				tf.setText(String.valueOf(num));
			}catch(Exception f) {
				
			}
		}else if(e.getSource()==eql) {
			double num1;
			double num2;
			String str="";
			if(calcul) {
				num1=Double.parseDouble(calNum);
				num2=Double.parseDouble(opNum);
			}else {
				try {
					num1=Double.parseDouble(calNum);
				}catch(Exception a){
					num1=0;
				}
				try {
					num2=Double.parseDouble(tf.getText());
				}catch(Exception a){
					num2=0;
				}
//				num2=Double.parseDouble(tf.getText());
				opNum=tf.getText();
			}
			try {
				switch(op) {
				case "+":
					str = String.valueOf(num1+num2);
					break;
				case "-":
					str = String.valueOf(num1-num2);
					break;
				case "*":
					str = String.valueOf(num1*num2);
					break;
				case "/":
					str = String.valueOf(num1/num2);
					break;
				}
				tf.setText(str);
			}catch(ArithmeticException a) {
				tf.setText("0으로 나눌 수 없습니다.");
			}catch(Exception a) {
				tf.setText("문자로 연산 할 수 없습니다.");
			}
			
			calcul = true;
			
		}else if(e.getSource()==del) {
			String str = tf.getText();
			switch (str.length()){
			case 0:
				str = "";
				break;
			case 1:
				str = "";
				break;
			default:
				str=str.substring(0, str.length()-1);
			}
			tf.setText(str);
		}else if(e.getSource()==clr) {
			calNum = "";
			opNum = "";
			op = "";
			tf.setText("");
			calcul = false;
		}
		System.out.println("명령 호출됨");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cal cal = new Cal();
	}

}
