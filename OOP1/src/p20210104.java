import java.util.*;

public class p20210104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		
		String str1 = new String("A barking dog");
		System.out.println(str1.length());
		
//		int b =a[15];
//		str1.charAt(13);
		
		int result = test2();
		System.out.println(test2());
		System.out.println(result);
		
		
		String str2 = " never bites";
		
		String str3 = "동해물과 " + "백두산이";
		String str4 = str3.concat(" 마르고 닳도록...");
		System.out.println(str3);
		System.out.println(str4);
//		str3 = "하느님이 "+ "보우하사";
//		str1 = "A substract bow";
//		str4 = str1.replace('b', 'B');
//		System.out.println(str4);
		
		str4 = str1;
		
		str4="a barking DOG";
		
		if(str1.equals(str4)) {
			System.out.println("str1과 str4는 같습니다");
		}else {
			System.out.println("아니야!!!");
		}
		System.out.println(str1);
		
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1과 str4는 같습니다");
		}
		
		str4 = str1.substring(2,9);
		System.out.println(str4);
		
		str4 = "123";
		int n = Integer.parseInt(str4);
		System.out.println(n-50);
		System.out.println(str4+50);
		boolean flag = str1.startsWith("A");
		System.out.println(flag);
	}
	
	public static void test1() {
		
	}
	public static int test2() {
		return 3;
	}
}