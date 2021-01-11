package OOP;
import java.util.*;

public class oopUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oopTest std1 = new oopTest();
		std1.setName("홍길동");
		std1.setSid(200000);
		std1.addGrade(100);
		std1.addGrade(10);
		std1.addGrade(70);
		std1.addGrade(120);
		
		int[] jumsu = std1.getGrades();
		System.out.println(Arrays.toString(jumsu));
		jumsu[0]=500;
		int[] grade = std1.getGrades();
		System.out.println(Arrays.toString(grade));
//		int max = grade[0];
//		for (int i =0; i<grade.length;i++) {
//			if (max<grade[i]) {
//				max=grade[i];
//			}
//		}
		System.out.println(std1.getMax());
		System.out.println(std1.getMin());
		System.out.println(std1.getAverage());
		/* 추상화: 불필요한 상세내용 객체를 숨김
		 * 
		 */
		//캡슐화:객체의 프로퍼티와 그 프로퍼티를 대상으로 하는 기능들을
		//모두 한곳에 그룹핑 시켜둠
		
		/* 상속: 다른 클래스로부터 프로퍼티와 기능을 상속
		 * 키워트 extend
		 * 어떤 클래스도 상속받지 않으면 기본적으로 Object 클래스 상속
		 */
		
		System.out.println(std1.add(3.5,3.5));
	}

}
