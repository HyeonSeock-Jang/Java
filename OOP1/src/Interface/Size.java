package Interface;

public class Size implements Comparable{
	private int width=0;
	private int height=0;
	
	public Size() {
		this(10,10);
	}
	public Size(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public String toString() {
		return "Size [width=" + width + ", height=" + height +", Area="+getArea()+"]";
	}
	public int getArea() {
		return this.width*this.height;
	}

	public int compareTo(Object other){
		Size otherRec = (Size)other;
		if(this.getArea()>otherRec.getArea()) 
			return 1;
		else if(this.getArea()<otherRec.getArea()) 
			return -1;
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Size rec1 = new Size();
		Size rec2 = new Size(500,30);
		System.out.println(rec1);
		System.out.println(rec2);
		System.out.println();
		int value = rec1.compareTo(rec2);
		
		if(value == 1) 
			System.out.println(rec1+"이 더 크다");
		else if(value == 0)
			System.out.println("둘이 같다");
		else
			System.out.println(rec2+"이 더 크다");
		
		
		}

}
