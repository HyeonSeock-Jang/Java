package ch07;

public class Base {
	public Base() {
		System.out.println("Base ����");
	}
	public static void main(String[] args) {
		Derived base = new Derived();
		
	}
}

class Derived extends Base{
	public Derived() {
		System.out.println("Derived ����");
	}
}