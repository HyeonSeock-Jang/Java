package EventAction;

import java.util.*;
import javax.swing.Timer;
import java.awt.event.*;

class MyInterface implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("beep");
	}
}

public class RamdaCount {
	
	public static void main(String[] args) {
		/*
		// TODO Auto-generated method stub
		ActionListener listener = new MyInterface();
		Timer time = new Timer(1000,listener);
		//n밀리초마다 listener실행
		time.start();
		for(int i = 0;i<1000;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
		*/
		Timer time = new Timer(1000, event->System.out.println("beep"));
		time.start();
		for(int i =0;i<1000;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
		
		
	}

}
