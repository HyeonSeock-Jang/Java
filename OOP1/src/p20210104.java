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
		
		String str3 = "���ع��� " + "��λ���";
		String str4 = str3.concat(" ������ �⵵��...");
		System.out.println(str3);
		System.out.println(str4);
//		str3 = "�ϴ����� "+ "�����ϻ�";
//		str1 = "A substract bow";
//		str4 = str1.replace('b', 'B');
//		System.out.println(str4);
		
		str4 = str1;
		
		str4="a barking DOG";
		
		if(str1.equals(str4)) {
			System.out.println("str1�� str4�� �����ϴ�");
		}else {
			System.out.println("�ƴϾ�!!!");
		}
		System.out.println(str1);
		
		if(str1.equalsIgnoreCase(str4)) {
			System.out.println("str1�� str4�� �����ϴ�");
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