package ch09;

public class Teacher {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + "]";
	}
	public void eat() {
		System.out.println("�������� �Խ��ϴ�.");
	}

	public Teacher(String subject) {
		super();
		this.subject = subject;
	}
	
}
