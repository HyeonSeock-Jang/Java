package GUITest;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.*;

public class ImageCreative extends JFrame implements ActionListener{
	public Image img;
	public ImageIcon img2;
	public ImageIcon img3;
	public ImageIcon[] img4=new ImageIcon[5];
	public JLabel label = new JLabel();
	public JPanel panel = new JPanel();
	public JButton[] button = new JButton[4];
	public int x=0;
	public int y=0;
	
	public ImageCreative(){
		Toolkit kit = Toolkit.getDefaultToolkit();
		img = kit.getImage("src\\GUITest\\7joun.png");
		img2 = new ImageIcon("src\\GUITest\\bang.png");
		img3 = new ImageIcon("src\\GUITest\\7joun.png");
		for(int i =0;i<5;i++) {
			if(i==0) {
				img4[i]=new ImageIcon("src\\GUITest\\주인공_normal_1.png");
			}else {
				img4[i]=new ImageIcon("src\\GUITest\\주인공_run_"+i+".png");
			}
		}
		button[0]=new JButton("↑");
		button[1]=new JButton("←");
		button[2]=new JButton("→");
		button[3]=new JButton("↓");
		
		
		setTitle("Test");
		setSize(750,750);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		label.setBounds(0,-100,700,700);
		label.setIcon(img4[0]);
		panel.setBounds(50, 500, 700, 700);
		button[0].setFocusable(false);
		button[0].addActionListener(this);
		button[1].setFocusable(false);
		button[1].addActionListener(this);
		button[2].setFocusable(false);
		button[2].addActionListener(this);
		button[3].setFocusable(false);
		button[3].addActionListener(this);
		button[1].setPreferredSize(new Dimension(100,100));
		button[1].setIcon(img2);
		JButton button2 = new JButton("특수버튼");
		
		button2.addActionListener(e->{
		if(label.getIcon()==img2)
			label.setIcon(img3);
		else 
			label.setIcon(img2);
		});
		
		
		this.add(label);
		this.add(panel);
		panel.add(button[0]);
		panel.add(button[1]);
		panel.add(button[2]);
		panel.add(button[3]);
		panel.add(button2);
		setVisible(true);
	}
//	@Override
//	public void paint(Graphics g) {
//		g.drawImage(img, 0,0,this);
//	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button[0]) {
			label.setLocation(label.getX(), label.getY()-10);
		}else if(e.getSource()==button[1]) {
			label.setLocation(label.getX()-10, label.getY());
		}else if(e.getSource()==button[2]) {
			label.setLocation(label.getX()+10, label.getY());
		}else if(e.getSource()==button[3]) {
			label.setLocation(label.getX(), label.getY()+10);
		}
//		try {
//			Thread.sleep(500);
//		}catch(InterruptedException f) {
//			
//		}
		if(label.getIcon()==img4[4]) {
			label.setIcon(img4[3]);
		}else {
			label.setIcon(img4[4]);
		}
//		if(label.getIcon()==img4[4]) {
//			label.setIcon(img4[0]);
//		}else if(label.getIcon()==img4[0]) {
//			label.setIcon(img4[1]);
//			this.actionPerformed(e);
//		}else if(label.getIcon()==img4[1]) {
//			label.setIcon(img4[2]);
//			this.actionPerformed(e);
//		}else if(label.getIcon()==img4[2]) {
//			label.setIcon(img4[3]);
//			this.actionPerformed(e);
//		}else if(label.getIcon()==img4[3]) {
//			label.setIcon(img4[4]);
//			this.actionPerformed(e);
//		}
			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImageCreative asd = new ImageCreative();
	}

}
