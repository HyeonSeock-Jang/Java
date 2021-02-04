package ch09;

public class Refrigerator implements Remote{

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("냉장고가 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("냉장고가가 꺼졌습니다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
