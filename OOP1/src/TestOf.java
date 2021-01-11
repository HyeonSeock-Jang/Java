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
		System.out.println("���ڸ� ���ּ���");
		Scanner input = new Scanner(System.in);
		String nextPutIn = input.nextLine();
		System.out.println("����� �Է��� ������ :" + nextPutIn);
		int n1, n2, n3;
		
		System.out.println("������ ���ּ���");
		Scanner num = new Scanner(System.in);
		n1 = input.nextInt();
		n2 = input.nextInt();
		n3 = input.nextInt();
		System.out.println("n1[" +n1+ "] n2[" +n2+ "] n3[" +n1+ "]");
	}
	public static void testCom() {
		//�� �ڿ��� A�� B�� �־�����. 
		//�� �� A+b, A-b, A*b, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.println("������ �Է��ϼ���");
		Scanner input = new Scanner(System.in);
		/*	int A = input.nextInt();
		 *	int B = input.nextInt();
		 */
		int A = input.nextInt(), B = input.nextInt();
		//int A, B = input.nextInt();
		
		System.out.println("������ ����� :" +(A+B)+"�Դϴ�");
		System.out.println("�E���� ����� :" +(A-B)+"�Դϴ�");
		System.out.println("������ ����� :" +(A*B)+"�Դϴ�");
		System.out.println("�������� ���� :" +(A/B)+"�Դϴ�");
		System.out.println("��������  �������� :" +(A%B)+"�Դϴ�");	
		}
	public static void testCircle() {
		/* (A+B)%C�� ((A%C)+(B%C))%C�� ������?
		 * (A*B)%C�� ((A%C)*(B%C))%C�� ������?
		 */
		System.out.println("������ �Է��ϼ���");
		Scanner input = new Scanner(System.in);
		int A=input.nextInt(),B=input.nextInt(),C=input.nextInt();
		System.out.println("(A+B)%C�� :" +(A+B)%C+"�Դϴ�");
		System.out.println("((A%C)+(B%C))%C�� :" +((A%C)+(B%C))%C+"�Դϴ�\n");
		System.out.println("(A*B)%C�� :" +(A*B)%C+"�Դϴ�");
		System.out.println("((A%C)*(B%C))%C�� :" +((A%C)*(B%C))%C+"�Դϴ�\n");
	}
	public static void testA() {
		System.out.println("�� ���ڸ� �Է��ϼ���");
		Scanner input = new Scanner(System.in);
		String A = input.nextLine();
		char B = A.charAt(0);
		int n = B;
		System.out.println(n);
	}
	public static void testQuartering() {
		int X=0,Y=0;
		do {
		System.out.println("x�� y���� ������ �Է��ϼ���(-1000�̻� 1000����)");
		System.out.print("x:");
		Scanner input = new Scanner(System.in);
		X = input.nextInt();
		System.out.print("y:");
		input = new Scanner(System.in);
		Y = input.nextInt();
		}
		while((X>=1000)||(X<=-1000)||(Y>=1000)||(Y<=-1000));
		System.out.print("(x,y)�� ");
		if (X>0) {
			if (Y>0) System.out.print("�� 1��и�");
			else if (Y<0) System.out.print("�� 4��и�");
			else System.out.print("X��");
		}else if(X<0){
			if (Y>0) System.out.print("�� 2��и�");
			else if (Y<0) System.out.print("(�� 3��и�");
			else System.out.print("X��");
		}else {
			if (Y!=0) System.out.print("Y��");
			else System.out.print("����");
		}
		System.out.print(" ����\n �ֽ��ϴ�.");
	}
}
