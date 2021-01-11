package testMethod;
import java.util.*;

class Bumo {
	public Bumo() {
		System.out.println("부모입니다.");
	}
};

class Jasik extends Bumo{
	public void Bumo() {
		System.out.println("메소드 입니다.");
	}
	public Jasik(int a) {
		super();
		System.out.println("자식입니다.");
	}
};

public class TestSome {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Jasik son = new Jasik(10);
		Jasik son = new Jasik(10);
		Bumo parent = new Bumo();
		son.Bumo();
	}
	
}
