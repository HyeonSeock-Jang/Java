package GUITest;
import javax.swing.*;
import java.awt.*;


public class IconTest extends JFrame{
	public IconTest(){
//		Toolkit kit = Toolkit.getDefaultToolkit();
		Toolkit kit = Toolkit.getDefaultToolkit();
		//�⺻ ��, ���� ���� ������ ���� �� ���
		Dimension screenSize = kit.getScreenSize();
		//ȭ�� ũ�� ���ϱ�
		
		
		setTitle("������ ���� ���� ���ϱ�");
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image img = kit.getImage("src\\GUITest\\7joun.png");
//		Image img = kit.getImage("src\\GUITest\\egg.gif");
		//image Ŭ������ img ������ �⺻�� kit�� �̿��Ͽ� image ���ؿ�.
		//��δ� �⺻������ ������Ʈ �ȿ� ��������. �׷��� ����������
		//package������ ������ \�� �̿��� ���������� �������� ��
		//���� �� java������ ������Ʈ�� OOP1���� �����ؼ�
		//���������� src, GUITest��Ű�� �ȿ� �ִ� egg.gif�� ã�Ƴ�����
		//png���ϵ� ��... �ٵ� �����ϴ� ����� �ʹ��ʹ� �۾Ƽ�
		//ũ�Ⱑ ū ������ �־ �Ⱥ���...
		
		setIconImage(img);
		//icon�� ������ ����;
		setLayout(new FlowLayout());
		
		
		
		JButton button = new JButton("���ϱ�");
		this.add(button);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		IconTest a = new IconTest();
		
	}
}
