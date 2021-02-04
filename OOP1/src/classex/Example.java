package classex;

public class Example {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public static Example Squared(int num) {
		return new Example(num*num);
	}
	
	public Example() {
		this.num = 0;
	}
	
	public Example(int num) {
		this.num = num;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example ex = new Example();
		ex.setNum(5);
		System.out.println(ex.getNum());
		
		Example ex2 = new Example(3);
		System.out.println(ex2.getNum());
		
		Example ex3 = Example.Squared(5);
		System.out.println(ex3.getNum());
	}
}
