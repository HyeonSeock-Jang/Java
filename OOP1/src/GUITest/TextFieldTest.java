package GUITest;

import javax.swing.*;
import java.awt.*;

public class TextFieldTest extends JFrame{
	public TextFieldTest() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension screenSize = tool.getScreenSize();
		JFrame a = new JFrame();
		
		//들어갈 것 만들고
		JPanel panel = new JPanel();//포함시킬 panel
		JButton button = new JButton();
		JButton button2 = new JButton();
		JLabel label = new JLabel();
		JTextField text = new JTextField(20);
		//배열처럼 적을 수 있는 글자길이 제한(20);
		
		JFormattedTextField text2 = new JFormattedTextField("공주 구할거야 안구할거야?");
		//입력 문자 제한, 이미 적힌 문자의 길이에 맞춰 창이 생성됨
		
		JPasswordField text3 = new JPasswordField(20);
		//패스워드
		
		
		String[] gongJu = {"공주","푸용이","뿌용이","말랑이","왕자"};
		JComboBox<String> text4 = new JComboBox<String>(gongJu);
		//JComboBox<타입> 변수명 = new JComboBox<타입>(입력된 배열);
		
		
		JSpinner text5 = new JSpinner();
		//입력해야 함... 리스트 입력
		
//		JCheckBoxMenuItem check = new JCheckBoxMenuItem();
		ButtonGroup check = new ButtonGroup();
		JCheckBox check1 = new JCheckBox("공주");
		JCheckBox check2 = new JCheckBox("푸용이");
		JCheckBox check3 = new JCheckBox("뿌용이");
		JCheckBox check4 = new JCheckBox("말랑이");
		JCheckBox check5 = new JCheckBox("왕자");
		
		//체크박스 버튼
//		JRadioButtonMenuItem radio = new JRadioButtonMenuItem();
		ButtonGroup radio = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("공주");
		JRadioButton radio2 = new JRadioButton("푸용이");
		JRadioButton radio3 = new JRadioButton("뿌용이");
		JRadioButton radio4 = new JRadioButton("말랑이");
		JRadioButton radio5 = new JRadioButton("왕자");
		
		Image img = tool.getImage("src\\GUITest\\7joun.png");
		
		
		//설정하고
		setTitle("집들이 나간 공주 구하기.");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		button.setText("구하기");
		button2.setText("안 구해");
		button2.setEnabled(false);
		text.setText("당신이 구할 공주는??");
		text.setEditable(false);
		check2.setText("푸용푸용이");
		setIconImage(img);
		setLayout(new FlowLayout());
		
		
		//삽입하고
		this.add(panel);
		panel.add(button);
		panel.add(button);
		panel.add(button2);
		panel.add(label);
		panel.add(text);
		panel.add(text2);
		panel.add(text3);
		panel.add(text4);
		panel.add(text5);
//		panel.add(check);
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);
		panel.add(check4);
		panel.add(check5);
//		panel.add(radio);
		radio.add(radio1);
		radio.add(radio2);
		radio.add(radio3);
		radio.add(radio4);
		radio.add(radio5);
		panel.add(radio1);
		panel.add(radio2);
		panel.add(radio3);
		panel.add(radio4);
		panel.add(radio5);
		
		//보이게하고
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TextFieldTest alpha = new TextFieldTest();
	}
}
