package CircleMain;

import java.util.*;

public class Circle1{
	Scanner scan = new Scanner(System.in);
	private double radius;
	private int[] location=new int[2];
	private final double pie = 3.14;
	private boolean radiusipleak = false;
	private boolean locationipleak = false;
	
	private void noneIpleak() {
		System.out.println("�Է��ϰ� �����Ͻʽÿ�.");
	}
	public void circleTotal() {
		if (radiusipleak == true&& locationipleak==true) {
			System.out.println("x: "+this.location[0]+", y: "+this.location[1]);
			System.out.println("����: "+pie*radius*radius);
			System.out.println("�ѷ�: "+2*radius*pie);
		} else if (radiusipleak == true&& locationipleak==false) {
			System.out.println("��ġ�� �Է��ؾ� �մϴ�.");
			System.out.println("����: "+pie*radius*radius);
			System.out.println("�ѷ�: "+2*radius*pie);
		} else if (radiusipleak == false&& locationipleak==true) {
			System.out.println("x: "+this.location[0]+", y: "+this.location[1]);
			System.out.println("�������� �Է��ؾ� �մϴ�");
		} else {
			noneIpleak();
		}
		
	}
	public void getRadius() {
		if(radiusipleak == true) {
			System.out.println("�������� "+this.radius+"�Դϴ�.");
		} else {
			noneIpleak();
		}
//		return radius;
	}
	public void setRadius() {
		try {
			System.out.println("�������� �Է��ϼ���");
			this.radius = scan.nextInt();
		}catch(ClassCastException e){
			this.radius = -1;
		}
		if(radius< 0) {
			System.out.println("����� �Է��ϼ���.");
			setRadius();
		}
		this.radiusipleak = true;
//		radius=(����)?��:����;
	}
	public void getLocation() {
		int[] getLo = Arrays.copyOf(location, location.length);
		if (locationipleak == true) {
			System.out.println("x�� "+getLo[0]+", y�� "+getLo[1]+"�Դϴ�.");
		}else {
			noneIpleak();
		}
		
//		return getLo;
	}
	public void setLocation(int[] location) {
		int[] changeLo = Arrays.copyOf(location, location.length);
		this.location = changeLo;
		//ù° �ڸ��� x, ��°�ڸ��� y
		this.locationipleak = true;
	}
	
	
}
