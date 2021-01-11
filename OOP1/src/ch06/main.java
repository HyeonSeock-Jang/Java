package ch06;

//import java.lang.Math.*;
//import java.math.*;

public class main {
	public static void main(String[] args) {
		Math suhak = new Math();
		System.out.println(suhak.add(3, 2));
		System.out.println(Math.add(3, 2));
		java.lang.Math.pow(2, 10);
		java.lang.Math.min(1, 2);
		
		Box box1 = new Box();
		Box box2 = new Box();
		Box box3 = new Box();
		
		System.out.println(Box.getCount());
//		System.out.println(Box.getCount());
//		System.out.println(Box.getCount());
		
		Employee emp1 = new Employee(10, "gdhong");
		emp1.setCeo("scpark");
		Employee emp2 = new Employee(20, "chsung");
		emp2.setCeo("scpark");
		
		System.out.println(emp1.getCeo());
		
		Employee.setCeo("SCPARK");
		System.out.println(Employee.getCeo());
	}
}
