package ch09;

/**
 * @author USER
 *
 */
public class Main implements Main2{
	
	/*
	 * interface:
	 * 	abstract class�� �����ϴ�
	 * 	abstract class�� instance�� ���� �� ����.
	 * 	abstract class�� �޼ҵ带 ������.
	 * 	abstract class�� ���� ��ӹ޴� �ļ� Ŭ�����鿡��
	 * 		���� ������ �� �޼ҵ带 �����ٰ� ���.
	 * 		���� �����ؼ� �ٵ� ������ �� �� �ְ�
	 * 		�ٵ� �������� �� �� ����...
	 * 		�ν��Ͻ��� ���� �� ����.
	 * �׿� ���� interface��
	 * 	�� interface�ȿ��ִ� ��� �޼ҵ带 ���� �ؾ� ��� �� �� �ִ�.
	 * 	�⺻������ ��� �޼ҵ尡 public abstract �޼ҵ��.
	 */
//	public void test() {
//		System.out.println("Hello, World!");
//	}
//	public void test2() {
//		
//	}
	//���Ǹ� �� ��
	//�� ����... �װ� �� �� ���µ�...
	//�����ؼ� �� �� �ֵ��� �� �� �ְ�
	//�������� �ʰ� ��ӹ��� �� �ִ�.
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
		System.out.println("��");
	}

	@Override
	public int test2() {
		// TODO Auto-generated method stub
		System.out.println("�ƾ�");
		return 0;
	}

	@Override
	public double test3() {
		// TODO Auto-generated method stub
		System.out.println("�ƾƾ�");
		return 0;
	}

}
