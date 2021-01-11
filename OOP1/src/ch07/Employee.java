package ch07;

public class Employee {
	public String name;
	String address;
	protected int salary;
	private int rrn;
	
	public Employee(){
		this("È«±æµ¿","¾øÀ½",0,0000000);
	}
	public Employee(String name, String address, int salary, int rrn) {
		this.name=name;
		this.address=address;
		this.salary=salary;
		this.rrn=rrn;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getRrn() {
		return rrn;
	}
	public void setRrn(int rrn) {
		this.rrn = rrn;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
	}
	
}
