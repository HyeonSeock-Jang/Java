import java.util.*;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner을 이용하여 String값으로 식을 받는다.
		 * String 값을 계산하여 출력하는 알고리즘을 만드시오
		 * JavaScript엔진 사용하여 eval써서 계산하기 금지...
		 * 이거 쓰면 3줄만에 끝남...
		 * 
		 * ex1) String str = "135+513";...>int answer = 648;
		 * ex2) String str = "842*41/7+15";...>int answer = 648;
		 */
		
		/*
		 * scan으로 str값 받는다 ex) 123+456
//		 * 1. 처음 값을 숫자 이외의 +,-,*,/가 나올 때 까지 초기값에다
//		 * 더해주면서 +,-,*,/가 나오면 while탈출 및 현재부호에 추가
//		 * 및 위치 지정
		 * 2. for문 돌면서 str의 숫자를 더할 값에다가 추가
		 * 	도는 도중에 +,-,*,/가 나오면 for문 하나 추가하고
		 * 	식을 실행시킴
		 * 3.식 실행시키고 해당 식의 부호를 현재부호에 변경
		 * 
		 * for(){
		 * 	if(i=="+"||"-",*,/이거면{
		 * 		switch(현재 부호)
		 * 		case "+":
		 * 			초기값 현재부호= 더할 값;
		 * 			break;
		 * 		현재부호 = str.charAt(i);
		 * 		더할값 = 0;
		 * }
		 */
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();//식
		int proto = 0; //초기 값
		int valueCal = 0; //계산 값
		char mark = '+'; //부호
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'||i==str.length()-1) {
				if(i==str.length()-1)
					valueCal = valueCal*10 + (str.charAt(i)-'0');
				switch(mark) {
				case'+':
					proto+=valueCal;
					break;
				case'-':
					proto-=valueCal;
					break;
				case'*':
					proto*=valueCal;
					break;
				case'/':
					if(valueCal==0) {
						System.out.println("잘못 입력하였습니다");
						i += str.length();
						break;
					}
					proto/=valueCal;
					break;
				}
				valueCal=0;
				mark = str.charAt(i);
			}else {
				valueCal = valueCal*10 + (str.charAt(i)-'0');
			}
		}
		System.out.println(proto);
	}

}
