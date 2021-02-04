package ch10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Puzzle extends JFrame implements ActionListener{
	JButton[] button = new JButton[9];
	JButton reset = new JButton("reset");
	JPanel panel = new JPanel();
	public Puzzle() {
		
//		ArrayList<String> list = new ArrayList<>();
		failMission();
//		for(int i = 0;i<button.length;i++) {
//			if(i==button.length-1) {
//				button[i]=new JButton(" ");
//				button[i].addActionListener(this);
//				panel.add(button[i]);
//				button[i].setBackground(Color.CYAN);
//				break;
//			}
//			int rnd = (int)(Math.random()*8)+1;
//			boolean find = false;
//			for(int j = 0;j<i;j++) {
//				if((button[j].getText()).equals(Integer.toString(rnd))){
//					find = true;
//					break;
//				}
//			}
//			if(find) {
//				i--;
//				continue;
//			}
//			list.add(Integer.toString(rnd));
//			
//			button[i]=new JButton(Integer.toString(rnd));
//			button[i].addActionListener(this);
//
//			if((button[i].getText()).equals(Integer.toString(i+1))) {
//				button[i].setBackground(Color.CYAN);
//			}else {
//				button[i].setBackground(null);
//			}
//			
//			panel.add(button[i]);
//		}
		setTitle("Puzzle");
		setSize(700,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		panel.setLayout(new GridLayout(3,0,10,10));
		setLocationRelativeTo(null);
		reset.addActionListener(this);
		this.add(panel,BorderLayout.CENTER);
		this.add(reset, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Puzzle pzl = new Puzzle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if((((JButton)e.getSource()).getText()).equals(reset.getText())) {
			failMission();
			return;
		}
			
		int[][] size = new int[3][3];
		boolean emptyFind = false;
		int emptyIdx = -1;
		((JButton)e.getSource()).equals(button[0]);
		for(int i = 0;i<button.length;i++) {
			if(((JButton)e.getSource()).getText().equals(" ")) {
				continue;
			}
			if(((JButton)e.getSource()).equals(button[i])) {
				if(i<6&&button[i+3].getText().equals(" ")) {
					emptyIdx=i+3;
					emptyFind = true;
					System.out.println("찾았습니다.");
				}
				if(i>2&&button[i-3].getText().equals(" ")) {
					emptyIdx=i-3;
					emptyFind = true;
					System.out.println("찾았습니다.");
				}else if((i==0||i==1||i==4||i==3||i==7||i==6)&&button[i+1].getText().equals(" ")) {
					System.out.println("찾았습니다.");
					emptyIdx=i+1;
					emptyFind = true;
				}else if((i==2||i==1||i==4||i==5||i==8||i==7)&&button[i-1].getText().equals(" ")) {
					System.out.println("찾았습니다.");
					emptyIdx=i-1;
					emptyFind = true;
				}
				if(emptyFind) {
					button[emptyIdx].setText(button[i].getText());
					button[i].setText(" ");
					break;
				}
			}
		}
		boolean end = true;
		if((button[8].getText()).equals(" "))
			button[8].setBackground(Color.CYAN);
		else {
			button[8].setBackground(null);
		}
		for(int i = 0;i<button.length-1;i++) {
			
			if((button[i].getText()).equals(Integer.toString(i+1))) {
				button[i].setBackground(Color.CYAN);
			}else {
				button[i].setBackground(null);
				end = false;
			}
		}
		if(end) {
			for(int i = 0;i<button.length;i++) {
				button[i].setEnabled(false);
			}
		}
	}
	public void failMission() {
		if(button[8]!=null) {
			for(int i = 0;i<button.length;i++) {
				button[i].setText("-1");
			}
		}else {
			for(int i = 0;i<button.length;i++) {
				button[i]=new JButton("-1");
			}
		}
		
		for(int i = 0;i<button.length;i++) {
			if(i==button.length-1) {
				button[i].setText(" ");
				button[i].addActionListener(this);
				panel.add(button[i]);
				button[i].setBackground(Color.CYAN);
				break;
			}
			int rnd = (int)(Math.random()*8)+1;
			boolean find = false;
			for(int j = 0;j<i;j++) {
				if((button[j].getText()).equals(Integer.toString(rnd))){
					find = true;
					break;
				}
			}
			if(find) {
				i--;
				continue;
			}
			
			
			button[i].setText(Integer.toString(rnd));;
			button[i].addActionListener(this);

			if((button[i].getText()).equals(Integer.toString(i+1))) {
				button[i].setBackground(Color.CYAN);
			}else {
				button[i].setBackground(null);
			}
			
			panel.add(button[i]);
		}
	}
}
