import java.math.*;
import java.util.*;
import OOP.*;//import package.class;클래스가 끝

public class ReviewJava {
	public static void main(String[] args) {
//		review();
//		review2();
//		review3();
//		review4();
//		review5();
//		review6();
//		review7();
//		review8();
		review9();
//		if(args.length>0) {
//			for(int i = 0;i<args.length;i++) System.out.print(" "+args[i]);
//			if (args[0].equals("-h"))
//				System.out.println("HELP ");
//		}
		
	}
	public static void review9() {
		int numa = 0;
		String str = "294856";
		char cha = '3';
		int result1 = Integer.parseInt(str);
		System.out.println(result1);
		System.out.println(cha-'0');
	}
	public static void review8() {
		int[] baeyuel1 = new int[10];
		int[] baeyuel2 = {1,2,3,4,5,6};
		int[] baeyuel3;
		
		System.out.println(baeyuel1[2]);
		
//		baeyuel3= baeyuel2;
//		얕은 복사
		
//		baeyuel3 = baeyuel2.clone(); 
//		쉬운 깊은 복사1
		
//		baeyuel3 = Arrays.copyOf(baeyuel2, baeyuel2.length);
//		깊은 복사2
		
//		baeyuel3 = Arrays.copyOfRange(baeyuel2,0,baeyuel2.length);
		baeyuel3 = Arrays.copyOfRange(baeyuel2,1,3);//(n배열에서, n번 인덱스부터,m번쨰까지)
//		깊은 복사3
		
		baeyuel3[0] = 10;
		
		System.out.println(Arrays.toString(baeyuel2));
		System.out.println(Arrays.toString(baeyuel3));
	}
	public static void review7() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		long facto = a;
		for(int i = 2; i<a;i++) {
			facto*=i;
			System.out.println(facto);
		}
		System.out.println(facto);
	}
	public static void review6() {
		Date time = new Date();
		System.out.println(time);
		for(double x = 0;x!=10;x+=1) {
			System.out.println(x);
		}
		System.out.println("끝");
	}
	public static void review5() {
		Scanner scan = new Scanner(System.in);
		int siljuk = scan.nextInt();
		if(siljuk>1000) {
			System.out.println("당신의 보너스는: "+(double)(siljuk-1000)*0.1);
		}else {
			System.out.println("실망입니다, 당신은 잘렸어요!");
		}
	}
	public static void review4() {
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		final double pie = 3.14;
		System.out.println(pie*r*r);
		
		System.out.println("너비를 입력하세요");
		int width = scan.nextInt();
		System.out.println("높이를 입력하세요");
		int height = scan.nextInt();
		System.out.println("넓비: "+width*height+", 둘레: "+2*(width+height));
	}
	public static void review3() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		Random rand = new Random();
		int b = (int)(Math.random()*100)+1;
		System.out.println(a);
		System.out.println(b);
	}
	public static void review2() {
		final int a = 14;
		int b = 016;
		int c = 0xe;
		int d = 0b1110;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		boolean f;
		if (a<=10) {
			f = true;
		}else {
			f = false;
		}
		boolean e =(a>=10)?true:false;
		System.out.println(e+" " +f);
	}
	public static void review() {
		System.out.println("Hello, world!!");
		
		byte a = (byte)200_000_000;
		short b = (short)200_000_000;
		int c = 2_000_000_000;
		c +=2_000_000_000;
		long d = 2_000_000_000;
		d += 2_000_000_000;
		boolean e=true;
		float f = (float)1.123456789123;
		double g=1.123456789123;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}
}
