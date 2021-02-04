package ch09;

import java.awt.event.*;
import javax.swing.*;

public class Ramda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ramda a = new Ramda();
//		Timer timer = new Timer(1000, new ActionListener() {
//			private int seconds = 0;
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				System.out.println(++seconds);
//			}
//		});
		Timer timer = new Timer(1000,(e)-> 
			System.out.println("시간이 지난다~")
		);
		timer.start();
		for (int i = 0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("아아악");
			}
		}
	}
	
}
