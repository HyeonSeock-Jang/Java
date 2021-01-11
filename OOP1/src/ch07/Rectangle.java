package ch07;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
//	public Rectangle() {
//		System.out.println("윽");
//	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public double area() {
		return this.width*this.height;
	}
	public void draw() {
		System.out.println("("+super.getX()+","+super.getY()+") 위치에 가로: "+this.width+" 세로: "+this.height);
		System.out.println(area());
	}
}
