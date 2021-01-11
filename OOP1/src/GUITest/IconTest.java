package GUITest;
import javax.swing.*;
import java.awt.*;


public class IconTest extends JFrame{
	public IconTest(){
//		Toolkit kit = Toolkit.getDefaultToolkit();
		Toolkit kit = Toolkit.getDefaultToolkit();
		//기본 툴, 왼쪽 위의 아이콘 변경 시 사용
		Dimension screenSize = kit.getScreenSize();
		//화면 크기 구하기
		
		
		setTitle("집들이 나간 공주 구하기");
		setSize(500,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Image img = kit.getImage("src\\GUITest\\7joun.png");
//		Image img = kit.getImage("src\\GUITest\\egg.gif");
		//image 클래스에 img 변수에 기본툴 kit를 이용하여 image 구해옴.
		//경로는 기본적으로 프로젝트 안에 잡혀있음. 그래서 하위폴더인
		//package따위에 쓰려면 \를 이용해 하위폴더로 내려가야 함
		//위는 이 java파일의 프로젝트인 OOP1에서 시작해서
		//하위폴더인 src, GUITest패키지 안에 있는 egg.gif를 찾아낸것임
		//png파일도 됨... 근데 지원하는 사이즈가 너무너무 작아서
		//크기가 큰 파일을 넣어도 안보임...
		
		setIconImage(img);
		//icon을 변수로 설정;
		setLayout(new FlowLayout());
		
		
		
		JButton button = new JButton("구하기");
		this.add(button);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		IconTest a = new IconTest();
		
	}
}
