package Interface;

public interface Interface {
	public void turnOn();
	public void turnOff();
//	public void volumeUp();
	default public void turn1() {
		System.out.println("default ����Ǿ����ϴ�.");
	}
	static public void turn2() {
		System.out.println("static ����Ǿ����ϴ�.");
	}
}
