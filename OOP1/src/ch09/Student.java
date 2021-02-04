package ch09;

public class Student extends Person implements Comparable, Remote{
	private int gpa;
	private String name;
	
	private int sid;
	
	public Student(String phone, String addr, int gpa, String name, int sid) {
		super(phone,addr);
		this.gpa = gpa;
		this.name = name;
		this.sid = sid;
	}
	public int getGpa() {
		return gpa;
	}
	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Student [gpa=" + gpa + ", name=" + name + ", sid=" + sid + "]";
	}
	@Override
	public int compareTo(Object o) {
		Student std = (Student)o;
		if(this.gpa<std.gpa) {
			return this.gpa-std.gpa;
		}else if(this.gpa>std.gpa) {
			return this.gpa-std.gpa;
		}
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}
	
}
