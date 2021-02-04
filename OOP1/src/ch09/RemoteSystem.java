package ch09;

public class RemoteSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv = new Television();
		tv.turnOn();
		Refrigerator rf = new Refrigerator();
		rf.turnOff();
		Remote rtc = new Television();
		tv.sound();
		rtc.turnOn();
//		rtc.sound();
	}

}
