package ch07;

public class Dog extends Animal2{
	public void eat() {
		super.eat();
		System.out.println("�������� �԰� �ֽ��ϴ�");
	}
	public void test() {
		eat();
	}
	
	public void eat2() {
		System.out.println("��ȣ");
	}
}
