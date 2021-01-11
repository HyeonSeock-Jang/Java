package Interface;

public class RemoteControl implements Interface{
	boolean button = true;
	public void turnOn() {
		button = true;
	}
	public void turnOff() {
		button = false;
	}
	
	@Override
	public String toString() {
		return "RemoteControl [button=" + button + "]";
	}
	
	public static void main(String[] args) {
		RemoteControl tv = new RemoteControl();

		tv.turnOn();
		System.out.println(tv);
		tv.turnOff();
		System.out.println(tv);
		tv.turn1();
		Interface.turn2();
	}
}
