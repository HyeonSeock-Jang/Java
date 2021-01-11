package oopv2;

import java.util.Arrays;

public class Person {
	private String name="고길동";
	private String sid;
	private String gender;
	private String phone;
	private String dept;
	private String[] lecture;
	
//	name = "고길동";
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
//			System.out.println("과목이 없습니다.");
			return null;
			}
//		System.out.println("총 과목은 "+ Arrays.toString(lecture)+" 입니다.");
		return lecture;
	}
	public void setLecture(String[] lecture) {
		String[] newlecture=Arrays.copyOf(lecture, lecture.length);
		this.lecture = newlecture;
	}
	public String getName() {
		return name;
	}
	//상속 클래스
	/* 
	 * 상속을 받으면 코드 줄이거나 등등...
	 * 상속 받는 클래스 서브 클래스 자손클래스
	 * 상속 주는 클래스 슈퍼 클래스 부모클래스
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
