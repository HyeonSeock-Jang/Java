package ch06;

import ch06.*;
import yeungjin.Student;

public class testField{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television tv1 = new Television();
		tv1.setChannel(5);
		tv1.setVolume(20);
		tv1.setOnoff(false);
		System.out.println("tv1: "+tv1.toString());
		System.out.println("tv1: "+tv1);
		
		
		Television tv2 = new Television();
		tv2.setChannel(6);
		tv2.setVolume(30);
		tv2.setOnoff(true);
		System.out.println("tv2: "+tv2);
		
	}

}
