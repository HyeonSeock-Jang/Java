package ch09;

public class Television implements Remote{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �������ϴ�.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV�� �������ϴ�.");
	}
	
	public void sound() {
		System.out.println("���� ����.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		tv.turnOn();
	}

}
