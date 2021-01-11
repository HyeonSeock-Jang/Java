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
		System.out.println("입력하고 실행하십시오.");
	}
	public void circleTotal() {
		if (radiusipleak == true&& locationipleak==true) {
			System.out.println("x: "+this.location[0]+", y: "+this.location[1]);
			System.out.println("넓이: "+pie*radius*radius);
			System.out.println("둘레: "+2*radius*pie);
		} else if (radiusipleak == true&& locationipleak==false) {
			System.out.println("위치를 입력해야 합니다.");
			System.out.println("넓이: "+pie*radius*radius);
			System.out.println("둘레: "+2*radius*pie);
		} else if (radiusipleak == false&& locationipleak==true) {
			System.out.println("x: "+this.location[0]+", y: "+this.location[1]);
			System.out.println("반지름을 입력해야 합니다");
		} else {
			noneIpleak();
		}
		
	}
	public void getRadius() {
		if(radiusipleak == true) {
			System.out.println("반지름은 "+this.radius+"입니다.");
		} else {
			noneIpleak();
		}
//		return radius;
	}
	public void setRadius() {
		try {
			System.out.println("반지름을 입력하세요");
			this.radius = scan.nextInt();
		}catch(ClassCastException e){
			this.radius = -1;
		}
		if(radius< 0) {
			System.out.println("제대로 입력하세요.");
			setRadius();
		}
		this.radiusipleak = true;
//		radius=(조건)?참:거짓;
	}
	public void getLocation() {
		int[] getLo = Arrays.copyOf(location, location.length);
		if (locationipleak == true) {
			System.out.println("x는 "+getLo[0]+", y는 "+getLo[1]+"입니다.");
		}else {
			noneIpleak();
		}
		
//		return getLo;
	}
	public void setLocation(int[] location) {
		int[] changeLo = Arrays.copyOf(location, location.length);
		this.location = changeLo;
		//첫째 자리는 x, 둘째자리는 y
		this.locationipleak = true;
	}
	
	
}
