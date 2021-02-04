package ch09;

public class Employee implements Employable{
	private String name;

	
	public Employee(String name) {
		super();
		if(Employable.isEmpty(name)) {
			throw new RuntimeException("이름은 반드시 입력해야합니다.");
		}
		this.name = name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public static void main(String[] args) {
		Employee em = new Employee("아악아아악");
//		Employee em2 = new Employee(" ");
		System.out.println(em.getName());
	}
}
