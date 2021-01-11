package ch06;

public class Circle {
	private Point center;
	private int radius;
	static private double pie = 3.14;
	public static final double PI = 3.14;
	
//	{
//		radius = 10;
//	}
	
	public Circle() {
	}
	
	public Circle(Point center, int radius) {
		super();
		this.center = center;
		this.radius = radius;
	}


	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
	
	public static void main(String[] args) {
		Point center = new Point(5,10);
		Circle circle = new Circle(center,10);
		System.out.println(circle);
		
		Circle c2 = new Circle();
		System.out.println(c2);
		
		
		
//		int val = 3;
//		test(val);
//		System.out.println(val);
		Point p2 = new Point(3,4);
		
		System.out.println(p2);
		
		test2(p2);
		
		System.out.println(p2);
		
		int[] arr = {1,2,5,4,5,6};
		
//		System.out.println(arr);
		
		for(int n:arr)
			System.out.print(n+ " ");
		
		test3(arr);
		
		System.out.println();
		
		for(int n:arr)
			System.out.print(n+" ");

		
	}
	public static void test3(int[] arr) {
		for(int i=0;i<arr.length;i++)
			arr[i]+=1;
	}
	
	public static void test2(Point p) {
		p.setX(10);
	}
	
	public static void test(int n) {
		n=n+1;
	}
}
