package ch09;

/**
 * @author USER
 *
 */
public class Main implements Main2{
	
	/*
	 * interface:
	 * 	abstract class와 유사하다
	 * 	abstract class는 instance를 만들 수 없다.
	 * 	abstract class는 메소드를 가진다.
	 * 	abstract class는 나를 상속받는 후손 클래스들에게
	 * 		내가 정의해 둔 메소드를 가져다가 써라.
	 * 		내가 정의해서 바디를 구현해 줄 수 있고
	 * 		바디를 구현안해 줄 수 있음...
	 * 		인스턴스를 만들 수 없다.
	 * 그에 반해 interface는
	 * 	이 interface안에있는 모든 메소드를 구현 해야 사용 할 수 있다.
	 * 	기본적으로 모든 메소드가 public abstract 메소드다.
	 */
//	public void test() {
//		System.out.println("Hello, World!");
//	}
//	public void test2() {
//		
//	}
	//정의만 할 뿐
	//그 무언가... 그걸 쓸 수 없는데...
	//구현해서 쓸 수 있도록 할 수 있고
	//구현하지 않고 상속받을 수 있다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.test();
		Main2 m2 = new Main();
		m2.test3();
	}
//	@Override
//	public void test() {
//	}
//	public int test2() {
//		return 5;
//	}
//	public double test3() {
//		return 1.0;
//	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("악");
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		System.out.println("아악");
		return 0;
	}

	@Override
	public double test3() {
		// TODO Auto-generated method stub
		System.out.println("아아악");
		return 0;
	}

}
