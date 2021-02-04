package ch09;

public class Person {
	private String phone;
	private String addr;
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Person [phone=" + phone + ", addr=" + addr + "]";
	}
	public void eat() {
		System.out.println("사람이 먹습니다.");
	}
	public Person(String phone, String addr) {
		super();
		this.phone = phone;
		this.addr = addr;
	}
	
}
