package ch06;

public class Employee2 {
	private String name;
	private int sid;
	private static int count=0;
	
	
	public Employee2() {
		this("±æµ¿",12345);
	}
	
	public Employee2(String name, int sid) {
		super();
		this.name = name;
		this.sid = sid;
		count++;
	}

	protected void finalize() {
		count--;
	}

	public static int getCount() {
		return count;
	}
	public static void main(String[] args) {
		Employee2 emp1 = new Employee2();
		Employee2 emp2 = new Employee2();
		Employee2 emp3 = new Employee2();
		
		System.out.println(getCount());
	}
}
