package GUITest;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
	
	public MyFrame(){
		
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("집들이 나간 공주 구하기");
//		setVisible(true);
		

		setLocationRelativeTo(null);
		//setLocationRelativeTo(null=화면 중앙생성);
		
		setLayout(new FlowLayout());
		//버튼이 확실하게 보이게
		//관리자를 setLayout
		
		setResizable(false);
		//크기 조절 가능불가
		JButton button = new JButton("버튼입니다");
		//JButton 변수 = new JButton("적힌글자"); 버튼 생성
		
//		setLocation(500,500);
		
		this.add(button);
		//여기 클래스에 추가(변수);
		//프레임에 컴포넌트 추가
		
		
		setVisible(true);
		//보이게되는거
		
		
		/*메인에서 실행 할 때
		JFrame box = new JFrame("집들이 나간 공주 구하기");
		//JFrame클래스  변수명  = new 삽입될JFrame클래스("주소줄"); ㅁ
		
		
		box.setSize(500, 500);
		//변수.setSize(가로, 세로); 크기 지정
		box.setBackground(null);
		//변수.setBackground(?);
		box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//변수.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);오른쪽 상단 x누르면 종료
		box.setVisible(true);
		//변수.setVisible(boolean값); boolean 값에 따라 창이 보이고 안보이고
		*/
		
	}
	
	public static void main(String[] args) {
		MyFrame newBox = new MyFrame();
		
	}
}
