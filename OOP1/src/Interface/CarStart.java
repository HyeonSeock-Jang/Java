package Interface;

public class CarStart implements CarFace{
	public void start() {
		System.out.println("�ڵ����� ����մϴ�.");
	}
	public void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
	};
	public int setSpeed(int speed) {
		System.out.println("�ڵ����� �ӵ��� "+speed+"km/h�� �ٲߴϴ�.");
		return speed;
	};
	public int turn(int degree) {
		System.out.println("�ڵ����� ������ "+degree+"��ŭ �ٲߴϴ�.");
		return degree;
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarStart car = new CarStart();
		car.start();
		car.setSpeed(300);
		car.turn(15);
		car.stop();
	}

}
