package ch09;
import java.util.*;
import java.lang.*;
public class PacPac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		LamdaCal lc = (n1,n2)->{
			n1=scan.nextInt();
			n2=scan.nextInt();
			System.out.println(n1+n2);
			return n1+n2;
		};
		lc.calcul(1, 2);
		Calendar cal = Calendar.getInstance();
		Date date = new Date();
		/*
		 * package: ���� class�� interface���� ��Ƴ���...
		 * Ŭ���� �̸��� �ߺ����� �ʰ� namespace�� �ο�
		 * 
		 * Ŭ���� �̸��� ��Ű�� �̸����� ������ ���� �� Ŭ������ full name
		 * ��Ű�� �̸��� �ҹ��ڰ� ����
		 */
	}

}
