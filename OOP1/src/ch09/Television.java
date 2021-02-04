package ch09;

public class Television implements Remote{
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV가 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV가 꺼졌습니다.");
	}
	
	public void sound() {
		System.out.println("사운드 변경.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		tv.turnOn();
	}

}
