package ch06;

public class Rectangle {
	private int width;
	private int length;
	private int area;
	
	Rectangle(){
		this(10, 10);
	}
	Rectangle(int width, int length){
		this.width=width;
		this.length=length;
		area = width*length;
	}
	public int getLength() {
		
		return length;
	}
	public void setLength(int length) {
		this.area=this.width*length;
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.area=width*this.length;
		this.width = width;
	}
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", area=" + area + "]";
	}
	
	public boolean isSame(Rectangle r) {
		boolean result = false;
		
		if(this.width==r.width&&this.length==r.length) 
			result = true;
		
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(20, 30);
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle(10,10);
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		if(r1.isSame(r2)) 
			System.out.println("같습니다");
		else
			System.out.println("다릅니다");
		
		if(r2.isSame(r3)) 
			System.out.println("같습니다");
		else
			System.out.println("다릅니다");
		
		r2.setLength(15);
		System.out.println(r2);
	}
	
}
