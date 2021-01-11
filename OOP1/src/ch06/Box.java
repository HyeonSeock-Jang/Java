package ch06;

public class Box {
	private int width;
	private int length;
	private int height;
	private int area;
	private int volume;
	private static int count;// 생성된 Box 객체의 수를 유지하는 변수로 만들고 싶다
	
	Box(){
		this(2,2,2);
//		
		
	}
	public static int getCount() {
		return count;
	}
	public boolean isSameBox(Box box) {
		boolean result = false;
		
		if(this.width==box.width&&this.length==box.length&&this.height==box.height) {
			result= true;
		}
		
		return result;
	}
	
	Box(int w, int l, int h){
		this.width=w;
		this.length=l;
		this.height=h;
		setArea(w,l);
		setVolume(w,l,h);
		count++;
	}
	
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
		setArea(this.width,this.length);
		setVolume(this.width,this.length,this.height);
	}

	public int getLength() {
		return length;
		
	}

	public void setLength(int length) {
		this.length = length;
		setArea(this.width,this.length);
		setVolume(this.width,this.length,this.height);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
		setArea(this.width,this.length);
		setVolume(this.width,this.length,this.height);
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int w, int l, int h) {
		this.volume = w*l*h;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int w, int l) {
		this.area = w*l;
	}

	@Override
	public String toString() {
		if(this.height==0) {
			return "너비: "+width+", 길이: "+length+", 넓이: "+area;
		}else
			return "너비: "+width+", 길이: "+length+", 높이: "+height+", 부피: "+volume;
	}
	
	public static void main(String[] args) {
		Box box1 = new Box();
		Box box2 = new Box(20,20,30);
		System.out.println(box1);
		System.out.println(box2);
		
		box1.setLength(50);
		box1.setWidth(30);
		System.out.println(box1);
		Box box3 = new Box(20,20,30);
		Box box4 = new Box(20,20,30);
		
		if(box3.isSameBox(box4)) {
			System.out.println("같습니다");
		}else {
			System.out.println("다릅니다");
		}
		
	}
}
