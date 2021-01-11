package ch06;

public class Hour extends Box {
	private int hour;
	private int minute;
	private int second;
	
	public Hour() {
		this(0,0,0);
	}
	
	public Hour(int hour) {
		this(hour,0,0);
	}
	public Hour(int hour, int minute) {
		this(hour,minute,0);
	}
	public Hour(int hour, int minute, int second) {
		super();
		while(second>=60) {
			second-=60;
			minute++;
		}
		while(minute>=60) {
			minute-=60;
			hour++;
		}
		while(hour>=24) {
			hour-=24;
		}
		this.second = second;
		this.minute = minute;
		this.hour = hour;
	}
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		
		while(hour>=24) {
			hour-=24;
		}
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		
		while(minute>=60) {
			minute-=60;
			hour++;
			setHour(hour);
		}
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		
		while(second>=60) {
			second-=60;
			minute++;
			setMinute(minute);
		}
		this.second = second;
	}

	@Override
	public String toString() {
		return String.format("%02d:%02d:%02d", hour,minute,second);
	}
	
	public static void main(String[] args) {
		Hour time1 = new Hour();//00:00:00
		Hour time2 = new Hour(13,27,6);//13:27:06
		Hour time3 = new Hour(99,66,77);//99:66:77
		Hour time4 = new Hour(15,66,30);//15:66:30
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);
		System.out.println(time4);
		time1.setSecond(6000);
		System.out.println(time1);
	}
	
}
