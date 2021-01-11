package ch07;

public class Manager extends Employee{
	private int bonus;

	public Manager(String name, String address, int salary, int rrn, int bonus) {
		super(name,address,salary,rrn);
		this.bonus=bonus;
	}
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public void test() {

		System.out.println(super.name);
		System.out.println(super.address);
		System.out.println(super.salary);
		System.out.println(super.getRrn());
	}
	@Override
	public String toString() {
		return "Manager [bonus=" + bonus + "]";
	}
	
	
}
