package OOP;

import java.util.*;

public class Main {
	int asd = 5;
	static int add = 0;
	
	
	void something() {
		this.asd++;
		this.add++;
	}
	static void something2() {
		//asd++;
		add++;
	}
	public static void main(String[] args) {
		Main something = new Main();
		Main something2 = new Main();
		something.something();
		something.something();
		something.something();
		something2.something();
		something2.something2();
		
		
		System.out.println(something.asd);
		System.out.println(something2.asd);
		System.out.println(something.add);
		System.out.println(something2.add);
		
//		int a = 4;
//		int b = 3;
//		System.out.println(a+b);
//		System.out.println(sum(a,b));
//		String str = "안녕하세요";
//		System.out.println(str);
////		str.strChange(str);
//		System.out.println(str);
//		System.out.println(a);
//		
//		int[] arr1 = {1,2,3,4,5};
//		int[] arr2 = arr1;
////		arrChange(arr1);
//		System.out.println(Arrays.toString(arr1));
		
	}
	
	public static int sum(int a, int b) {
		
		return a+b;
	}
	public static void strChange(String str) {
		str="변했습니다";
//		안변함
	}
	public static void arrChange(int[] arr) {
		arr[0] = 5;
//		변함
	}
}
