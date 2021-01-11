package GUITest;
import javax.swing.*;
import java.awt.*;

public class PanelTest extends JFrame{
	public PanelTest () {
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension scnSize = kit.getScreenSize();
		//여기까지는 이 클래스에 쓰일 툴
		
		
		setTitle("집들이 나간 공주 구하기.");
		setSize(500,500);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = kit.getImage("src\\GUITest\\7joun.png");
		setIconImage(img);
		setLayout(new FlowLayout());
		//여기까지 전체적인 틀 만들기
		//크기, 사이즈조절 가능여부, 창 생성 위치, 아이콘 등...
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		//panel배치관리자
		
		JLabel label = new JLabel();
		label.setText("누굴 구하시겠습니까?");
		
		JTextField field = new JTextField("입력하시오");
		
		JButton button = new JButton("구하기");
		JButton button2 = new JButton();
		button2.setText("구하기2");
		//여기까지 구성품들 추가
		
		
//		this.add(field);
//		this.add(button);
		this.add(panel);
		panel.add(label);
		panel.add(field);
		panel.add(button2);
		//구성품들 다 추가하기
		
		setVisible(true);
		//구성품들 보이기 말기
	}
	public static void main(String[] args) {
		PanelTest panel = new PanelTest();
		
	}
}
