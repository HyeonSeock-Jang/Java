package oopv2;

import java.util.Arrays;

public class Person {
	private String name="��浿";
	private String sid;
	private String gender;
	private String phone;
	private String dept;
	private String[] lecture;
	
//	name = "��浿";
//	sid = "123456";
	public Person() {
	}
	public Person(String name,String sid,String gender,String phone,String dept) {
		this.name = name;
		this.sid = sid;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
	}
	
	public String[] getLecture() {
		if(lecture==null) {
//			System.out.println("������ �����ϴ�.");
			return null;
			}
//		System.out.println("�� ������ "+ Arrays.toString(lecture)+" �Դϴ�.");
		return lecture;
	}
	public void setLecture(String[] lecture) {
		String[] newlecture=Arrays.copyOf(lecture, lecture.length);
		this.lecture = newlecture;
	}
	public String getName() {
		return name;
	}
	//��� Ŭ����
	/* 
	 * ����� ������ �ڵ� ���̰ų� ���...
	 * ��� �޴� Ŭ���� ���� Ŭ���� �ڼ�Ŭ����
	 * ��� �ִ� Ŭ���� ���� Ŭ���� �θ�Ŭ����
	 */
	public int sumInt(int a,int b) {
		int result = a+b;
		return result;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void print() {
		System.out.println("name: "+name+", sid: "+sid+", gender: "+gender+
				", phone: "+phone+", dept: "+dept);
	}
}
