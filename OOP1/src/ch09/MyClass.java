package ch09;

public class MyClass {
	int a = 1;
	int b = 2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass1 mc1 = new MyClass1();
		mc1.setC(5);
		System.out.println(mc1.c);
		MyClass mc = mc1;
		MyClass1 mc2 = (MyClass1)mc;
		mc1.setC(19);
		System.out.println(mc2.c);
	}

}
