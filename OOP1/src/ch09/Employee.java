package ch09;

public class Employee implements Employable{
	private String name;

	
	public Employee(String name) {
		super();
		if(Employable.isEmpty(name)) {
			throw new RuntimeException("�̸��� �ݵ�� �Է��ؾ��մϴ�.");
		}
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public static void main(String[] args) {
		Employee em = new Employee("�ƾǾƾƾ�");
//		Employee em2 = new Employee(" ");
		System.out.println(em.getName());
	}
}
