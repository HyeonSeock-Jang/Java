package testMethod;
import java.util.*;

class Bumo {
	public Bumo() {
		System.out.println("�θ��Դϴ�.");
	}
};

class Jasik extends Bumo{
	public void Bumo() {
		System.out.println("�޼ҵ� �Դϴ�.");
	}
	public Jasik(int a) {
		super();
		System.out.println("�ڽ��Դϴ�.");
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
