package ch07;

public class Shape {
	private int x;
	private int y;
	
//	public Shape() {
//		System.out.println("¾ßÈ£");
//	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print() {
		System.out.println("xÁÂÇ¥: "+this.x+" yÁÂÇ¥: "+this.y);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Shape) {
			Shape objShape = (Shape)obj;
			
			if(this.x == objShape.x&&this.y == objShape.y) {
				return true;
			}
		}
		
		return false;
	}
}
