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
		 * package: 관련 class랑 interface등을 모아놓음...
		 * 클래스 이름을 중복되지 않게 namespace를 부여
		 * 
		 * 클래스 이름에 패키지 이름까지 포함한 것을 그 클래스의 full name
		 * 패키지 이름은 소문자가 관례
		 */
	}

}
