package GUITest;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
	
	public MyFrame(){
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("������ ���� ���� ���ϱ�");
//		setVisible(true);
		

		setLocationRelativeTo(null);
		//setLocationRelativeTo(null=ȭ�� �߾ӻ���);
		
		setLayout(new FlowLayout());
		//��ư�� Ȯ���ϰ� ���̰�
		//�����ڸ� setLayout
		
		setResizable(false);
		//ũ�� ���� ���ɺҰ�
		JButton button = new JButton("��ư�Դϴ�");
		//JButton ���� = new JButton("��������"); ��ư ����
		
//		setLocation(500,500);
		
		this.add(button);
		//���� Ŭ������ �߰�(����);
		//�����ӿ� ������Ʈ �߰�
		
		
		setVisible(true);
		//���̰ԵǴ°�
		
		
		/*���ο��� ���� �� ��
		JFrame box = new JFrame("������ ���� ���� ���ϱ�");
		//JFrameŬ����  ������  = new ���Ե�JFrameŬ����("�ּ���"); ��
		
		
		box.setSize(500, 500);
		//����.setSize(����, ����); ũ�� ����
		box.setBackground(null);
		//����.setBackground(?);
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//����.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);������ ��� x������ ����
		box.setVisible(true);
		//����.setVisible(boolean��); boolean ���� ���� â�� ���̰� �Ⱥ��̰�
		*/
		
	}
	
	public static void main(String[] args) {
		MyFrame newBox = new MyFrame();
		
	}
}
