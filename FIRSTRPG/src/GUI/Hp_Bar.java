package GUI;

import java.awt.*;

import javax.swing.*;

import Main.*;
import Character.*;
public class Hp_Bar extends superOfImg implements Runnable{
	public Hp_Bar(){
		setBounds(26,26,400,26);
		setIcon(new ImageIcon(new ImageIcon("src\\Source\\GUI\\HP_P_Bar_15.png").getImage().getScaledInstance(400, 26, Image.SCALE_SMOOTH)));
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(Main.isMove()) {
//		while(true) {
			setIcon(new ImageIcon(new ImageIcon("src\\Source\\GUI\\HP_P_Bar_"+(YuushaStatus.getHp()/10)+".png").getImage().getScaledInstance(400, 26, Image.SCALE_SMOOTH)));
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
