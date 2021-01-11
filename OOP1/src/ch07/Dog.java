package ch07;

public class Dog extends Animal2{
	public void eat() {
		super.eat();
		System.out.println("강아지가 먹고 있습니다");
	}
	public void test() {
		eat();
	}
	
	public void eat2() {
		System.out.println("야호");
	}
}
