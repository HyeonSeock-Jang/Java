package ch09;

public class Lamda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable fc = new FlyingCar();
		fc.fly();
		Flyable fc2 = new Flyable() {
			@Override
			public void fly() {
				// TODO Auto-generated method stub
				System.out.println("�����ֽ��ϴ�");
			}
		};
		fc2.fly();
		Flyable fc3 = ()->System.out.println("���� �ֽ��ϱ�?");
		new Flyable() {

			@Override
			public void fly() {
				// TODO Auto-generated method stub
				
			}
			
		};
		fc3.fly();
	}

}
