package GUI;

import java.awt.*;

import javax.swing.*;

import Main.*;
import Character.*;
public class Hp_Bucket extends superOfImg implements Runnable{
	public Hp_Bucket(){
		setBounds(20,20,412,38);
		setIcon(new ImageIcon(new ImageIcon("src\\Source\\GUI\\HP_UI_150.png").getImage().getScaledInstance(412, 38, Image.SCALE_SMOOTH)));
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(Main.isMove()) {
//		while(true) {
			ImageIcon img = null;
			img = new ImageIcon(new ImageIcon("src\\Source\\GUI\\HP_UI_"+YuushaStatus.getMaxHp()+".png").getImage().getScaledInstance(412, 38, Image.SCALE_SMOOTH));
			this.setIcon(img);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
	
	
}