package ch09;

public class FlyingCar implements Flyable, dirvable{

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("운전");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행");
	}
	
}
