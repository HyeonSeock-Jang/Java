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
				System.out.println("�������̵� �ƴ�ϴ�");
			}
			public void Method3() {
				System.out.println("�ٸ� �޼ҵ�");
			}
		};
		mtd2.Method2();
//		mtd2.Method3();
	}
	@Override
	public void Method1() {
		// TODO Auto-generated method stub
		System.out.println("��ȣ~1");
	}
	
}
