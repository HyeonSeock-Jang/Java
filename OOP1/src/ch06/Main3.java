package ch06;

public class Main3 {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		oc.test();
		
		
		OuterClass.InnerClass ac=oc.new InnerClass();
		
		OuterClass.InnerClass2 ic2 = new OuterClass.InnerClass2();
	}
}
