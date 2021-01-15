package Interface;

public class DefaultMethod implements Default{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethod mtd = new DefaultMethod();
		mtd.Method1();
		mtd.Method2();
		DefaultMethod mtd2 = new DefaultMethod(){
			@Override
			public void Method2() {
				System.out.println("오버라이드 됐답니다");
			}
			public void Method3() {
				System.out.println("다른 메소드");
			}
		};
		mtd2.Method2();
//		mtd2.Method3();
	}
	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		System.out.println("야호~1");
	}
	
}
