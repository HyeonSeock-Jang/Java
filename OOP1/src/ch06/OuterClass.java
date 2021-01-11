package ch06;

public class OuterClass {
	private int val;
	
	InnerClass ic = new InnerClass();
	
	public void test() {
		System.out.println("test...");
		
		InnerClass ic = new InnerClass();
	}
	
	
	public static void test2() {
		class Localclass{
			public int localVal;
		}
		Localclass local = new Localclass();
	}
	
	
	public class InnerClass {
		public int a = 3;
		
		public void setMyInnerVal(int val) {
			a = val;
		}
		
		public int getMyInnerVal() {
			return a;
		}
	}
	
	public static class InnerClass2 {
		public int a = 3;
		
		public void setMyInnerVal(int val) {
			a = val;
		}
		
		public int getMyInnerVal() {
			return a;
		}
	};

	public static void main(String[] args) {
		
	}
}