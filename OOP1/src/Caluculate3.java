import java.util.*;

public class Caluculate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	       * Scanner�� �̿��Ͽ� String������ ���� �޴´�.
	       * String ���� ����Ͽ� ����ϴ� �˰����� ����ÿ�
	       * JavaScript���� ����Ͽ� eval�Ἥ ����ϱ� ����...
	       * �̰� ���� 3�ٸ��� ����...
	       * 
	       * ex1) String str = "135+513";...>int answer = 648;
	       * ex2) String str = "842*41/7+15";...>int answer = 648;
	       * 
	       * 
	       * Scanner 135+513
	       * nextLine String��.
	       * 
	       * String str = "135+513"; 
	       * 
	       * int proto<ó�� �޴� �� ���⿡�� 135
	       * int next<���� �޴� �� ���⿡�� 513
	       * boolean frontBack = true;
	       * char mark<�߰��� �ִ� ��ȣ
	       * �յڷ� ���� ������ �� �߰� ��ȣ�� �°� ����� �Ѵ�
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
		int proto=0;//<ó�� �޴� �� ���⿡�� 135
		int next=0;//<���� �޴� �� ���⿡�� 513
		boolean frontBack = true;
		char mark='0';
		String str = "135+513";
		//	      �յڷ� ���� ������ �� �߰� ��ȣ�� �°� ����� �Ѵ�
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
