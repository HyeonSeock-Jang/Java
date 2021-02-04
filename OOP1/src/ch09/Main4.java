package ch09;

import javax.swing.Timer;
import java.awt.event.*;
import java.util.*;

public class Main4 implements ActionListener{
	int minute = 0; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ActionListener listener = new Main4();
		Timer timer = new Timer(1000,listener);
		timer.start();
//		while(true);
//		Scanner scan = new Scanner(System.in);
//		scan.nextLine();
//		System.out.println(a);
		for (int i = 0;i<10;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("¾Æ¾Æ¾Ç");
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("beep"+(++minute));
	}
}
