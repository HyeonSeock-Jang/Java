package OOP;
import java.util.*;

public class oopUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		oopTest std1 = new oopTest();
		std1.setName("ȫ�浿");
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
		/* �߻�ȭ: ���ʿ��� �󼼳��� ��ü�� ����
		 * 
		 */
		//ĸ��ȭ:��ü�� ������Ƽ�� �� ������Ƽ�� ������� �ϴ� ��ɵ���
		//��� �Ѱ��� �׷��� ���ѵ�
		
		/* ���: �ٸ� Ŭ�����κ��� ������Ƽ�� ����� ���
		 * Ű��Ʈ extend
		 * � Ŭ������ ��ӹ��� ������ �⺻������ Object Ŭ���� ���
		 */
		
		System.out.println(std1.add(3.5,3.5));
	}

}
