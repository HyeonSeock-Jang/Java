import java.util.*;

public class TestOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testString();
		//testScanner();
		//testCom();
		//testCircle();
		//testA();
		testQuartering();
	}
	private static void testString() {
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = new String("HELLO");
		
		boolean result = s1 == s2;
		System.out.println(result);
		
		result = s1 == s3;
		System.out.println(result);
		
		result = s2 == s4;
		System.out.println(result);
		
		result = s2.equals(s4);
		System.out.println(result);
		
		result = s2.equalsIgnoreCase(s4);
		System.out.println(result);
	}
	public static void testScanner() {
		System.out.println("글자를 써주세요");
		Scanner input = new Scanner(System.in);
		String nextPutIn = input.nextLine();
		System.out.println("당신이 입력한 내용은 :" + nextPutIn);
		int n1, n2, n3;
		
		System.out.println("정수를 써주세요");
		Scanner num = new Scanner(System.in);
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		System.out.println("n1[" +n1+ "] n2[" +n2+ "] n3[" +n1+ "]");
	}
	public static void testCom() {
		//두 자연수 A와 B가 주어진다. 
		//이 때 A+b, A-b, A*b, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
		System.out.println("정수를 입력하세요");
		Scanner input = new Scanner(System.in);
		/*	int A = input.nextInt();
		 *	int B = input.nextInt();
		 */
		int A = input.nextInt(), B = input.nextInt();
		//int A, B = input.nextInt();
		
		System.out.println("덧셈의 결과는 :" +(A+B)+"입니다");
		System.out.println("뺼셈의 결과는 :" +(A-B)+"입니다");
		System.out.println("곱셈의 결과는 :" +(A*B)+"입니다");
		System.out.println("나눗셈의 몫은 :" +(A/B)+"입니다");
		System.out.println("나눗셈의  나머지는 :" +(A%B)+"입니다");	
		}
	public static void testCircle() {
		/* (A+B)%C는 ((A%C)+(B%C))%C와 같을까?
		 * (A*B)%C는 ((A%C)*(B%C))%C와 같을까?
		 */
		System.out.println("정수를 입력하세요");
		Scanner input = new Scanner(System.in);
		int A=input.nextInt(),B=input.nextInt(),C=input.nextInt();
		System.out.println("(A+B)%C는 :" +(A+B)%C+"입니다");
		System.out.println("((A%C)+(B%C))%C는 :" +((A%C)+(B%C))%C+"입니다\n");
		System.out.println("(A*B)%C는 :" +(A*B)%C+"입니다");
		System.out.println("((A%C)*(B%C))%C는 :" +((A%C)*(B%C))%C+"입니다\n");
	}
	public static void testA() {
		System.out.println("한 글자만 입력하세요");
		Scanner input = new Scanner(System.in);
		String A = input.nextLine();
		char B = A.charAt(0);
		int n = B;
		System.out.println(n);
	}
	public static void testQuartering() {
		int X=0,Y=0;
		do {
		System.out.println("x와 y값인 정수를 입력하세요(-1000이상 1000이하)");
		System.out.print("x:");
		Scanner input = new Scanner(System.in);
		X = input.nextInt();
		System.out.print("y:");
		input = new Scanner(System.in);
		Y = input.nextInt();
		}
		while((X>=1000)||(X<=-1000)||(Y>=1000)||(Y<=-1000));
		System.out.print("(x,y)는 ");
		if (X>0) {
			if (Y>0) System.out.print("제 1사분면");
			else if (Y<0) System.out.print("제 4사분면");
			else System.out.print("X축");
		}else if(X<0){
			if (Y>0) System.out.print("제 2사분면");
			else if (Y<0) System.out.print("(제 3사분면");
			else System.out.print("X축");
		}else {
			if (Y!=0) System.out.print("Y축");
			else System.out.print("원점");
		}
		System.out.print(" 위에\n 있습니다.");
	}
}
