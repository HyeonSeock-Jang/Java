package CircleMain;

import java.util.*;

public class CircleMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Circle1 powerCircle = new Circle1();
//		powerCircle.setRadius();
		powerCircle.setLocation(new int[] {2,3});
		powerCircle.getRadius();
		powerCircle.getLocation();
		powerCircle.circleTotal();
	}
}
