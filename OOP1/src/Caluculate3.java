import java.util.*;

public class Caluculate3 {

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
	       * 
	       * 
	       * Scanner 135+513
	       * nextLine String값.
	       * 
	       * String str = "135+513"; 
	       * 
	       * int proto<처음 받는 값 여기에선 135
	       * int next<다음 받는 값 여기에선 513
	       * boolean frontBack = true;
	       * char mark<중간에 있는 부호
	       * 앞뒤로 값을 추출한 뒤 중간 부호에 맞게 계산을 한다
	       * for(int i = 0;i<str.length();i++){
	       * 	if(str.charAt(i)==+,-,*,/){
	       * 		mark=str.charAt(i)
	       *	} else if(frontBack){
	       * 		proto = proto*10 +str.charAt(i);
	       * 	} else if(frontBack==false){
	       * 		next = next*10 +next.charAt(i);
	       * 	}
	       * }
	       * 
       */
		int proto=0;//<처음 받는 값 여기에선 135
		int next=0;//<다음 받는 값 여기에선 513
		boolean frontBack = true;
		char mark='0';
		String str = "135+513";
		//	      앞뒤로 값을 추출한 뒤 중간 부호에 맞게 계산을 한다
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
				mark=str.charAt(i);
				frontBack =false;
			} else if(frontBack){
				proto = proto*10 +str.charAt(i)-'0';
			} else if(frontBack==false){
				next = next*10 +str.charAt(i)-'0';
			}
		}
		System.out.println(proto);
		System.out.println(mark);
		System.out.println(next);
		switch(mark) {
		case '+':
			proto+=next;
			break;
		case '-':
			proto-=next;
			break;
		case '*':
			proto*=next;
			break;
		case '/':
			proto/=next;
			break;
		}
		System.out.println(proto);
	}

}
