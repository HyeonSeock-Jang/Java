package GUITest;

import javax.swing.*;
import java.awt.*;

public class TextFieldTest extends JFrame{
	public TextFieldTest() {
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension screenSize = tool.getScreenSize();
		JFrame a = new JFrame();
		
		//�� �� �����
		JPanel panel = new JPanel();//���Խ�ų panel
		JButton button = new JButton();
		JButton button2 = new JButton();
		JLabel label = new JLabel();
		JTextField text = new JTextField(20);
		//�迭ó�� ���� �� �ִ� ���ڱ��� ����(20);
		
		JFormattedTextField text2 = new JFormattedTextField("���� ���Ұž� �ȱ��Ұž�?");
		//�Է� ���� ����, �̹� ���� ������ ���̿� ���� â�� ������
		
		JPasswordField text3 = new JPasswordField(20);
		//�н�����
		
		
		String[] gongJu = {"����","Ǫ����","�ѿ���","������","����"};
		JComboBox<String> text4 = new JComboBox<String>(gongJu);
		//JComboBox<Ÿ��> ������ = new JComboBox<Ÿ��>(�Էµ� �迭);
		
		
		JSpinner text5 = new JSpinner();
		//�Է��ؾ� ��... ����Ʈ �Է�
		
//		JCheckBoxMenuItem check = new JCheckBoxMenuItem();
		ButtonGroup check = new ButtonGroup();
		JCheckBox check1 = new JCheckBox("����");
		JCheckBox check2 = new JCheckBox("Ǫ����");
		JCheckBox check3 = new JCheckBox("�ѿ���");
		JCheckBox check4 = new JCheckBox("������");
		JCheckBox check5 = new JCheckBox("����");
		
		//üũ�ڽ� ��ư
//		JRadioButtonMenuItem radio = new JRadioButtonMenuItem();
		ButtonGroup radio = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("����");
		JRadioButton radio2 = new JRadioButton("Ǫ����");
		JRadioButton radio3 = new JRadioButton("�ѿ���");
		JRadioButton radio4 = new JRadioButton("������");
		JRadioButton radio5 = new JRadioButton("����");
		
		Image img = tool.getImage("src\\GUITest\\7joun.png");
		
		
		//�����ϰ�
		setTitle("������ ���� ���� ���ϱ�.");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		button.setText("���ϱ�");
		button2.setText("�� ����");
		button2.setEnabled(false);
		text.setText("����� ���� ���ִ�??");
		text.setEditable(false);
		check2.setText("Ǫ��Ǫ����");
		setIconImage(img);
		setLayout(new FlowLayout());
		
		
		//�����ϰ�
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
		
		//���̰��ϰ�
		setVisible(true);
	}
	
	public static void main(String[] args) {
		TextFieldTest alpha = new TextFieldTest();
	}
}
