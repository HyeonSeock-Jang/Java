package GUITest;
import javax.swing.*;
import java.awt.*;

public class PanelTest extends JFrame{
	public PanelTest () {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension scnSize = kit.getScreenSize();
		//��������� �� Ŭ������ ���� ��
		
		
		setTitle("������ ���� ���� ���ϱ�.");
		setSize(500,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = kit.getImage("src\\GUITest\\7joun.png");
		setIconImage(img);
		setLayout(new FlowLayout());
		//������� ��ü���� Ʋ �����
		//ũ��, ���������� ���ɿ���, â ���� ��ġ, ������ ��...
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		//panel��ġ������
		
		JLabel label = new JLabel();
		label.setText("���� ���Ͻðڽ��ϱ�?");
		
		JTextField field = new JTextField("�Է��Ͻÿ�");
		
		JButton button = new JButton("���ϱ�");
		JButton button2 = new JButton();
		button2.setText("���ϱ�2");
		//������� ����ǰ�� �߰�
		
		
//		this.add(field);
//		this.add(button);
		this.add(panel);
		panel.add(label);
		panel.add(field);
		panel.add(button2);
		//����ǰ�� �� �߰��ϱ�
		
		setVisible(true);
		//����ǰ�� ���̱� ����
	}
	public static void main(String[] args) {
		PanelTest panel = new PanelTest();
		
	}
}
