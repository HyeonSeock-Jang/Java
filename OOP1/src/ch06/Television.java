package ch06;

public class Television {
	private int channel;
	private int volume;
	private boolean onoff;
	
	public Television() {
		setChannel(5);
		setVolume(20);
		setOnoff(false);
	}
	
	public Television(int chan, int vol, boolean of) {
		this.channel=chan;
		this.volume=vol;
		this.onoff=of;
		
		
//		setChannel(chan);
//		setVolume(vol);
//		setOnoff(of);
	}
	
	public int getChannel() {
		return channel;
	}


	public void setChannel(int channel) {
		this.channel = channel;
	}


	public int getVolume() {
		return volume;
	}


	public void setVolume(int volume) {
		this.volume = volume;
	}


	public boolean isOnoff() {
		return onoff;
	}


	public void setOnoff(boolean onoff) {
		this.onoff = onoff;
	}


	
	@Override //annotation
	public String toString() {
		
		return "이 TV의 채널: "+getChannel()+", 이 TV의 볼륨: "+getVolume()+", 이 TV의 On/Off상태: "+isOnoff();
	}
	
	
	
//	Run|Debug
	public static void main(String[] args) {
		Television tv1 = new Television();
//		tv1.setChannel(5);
//		tv1.setVolume(20);
//		tv1.setOnoff(false);
		System.out.println("tv1: "+tv1.toString());
		System.out.println("tv1: "+tv1);
		
		
		Television tv2 = new Television(6,30,true);
//		tv2.setChannel(6);
//		tv2.setVolume(30);
//		tv2.setOnoff(true);
		System.out.println("tv2: "+tv2);
	}
}
