package oopv2;

import java.util.Arrays;

public class Professor extends Person {
	
	
	@Override
	public int sumInt(int a,int b) {
		int result = a*b;
		System.out.println(result);
		return result;
	}
	
	@Override
	public void print() {
		String guamokdul =" 과목은 ";
		if (getLecture() !=null) {
			for(int i = 0; i<getLecture().length;i++) {
				guamokdul += (getLecture()[i]+" ");
			}
			guamokdul +="입니다";
		}else {
			guamokdul +="없습니다";
		}
		System.out.println("name: "+getName()+", sid: "+getSid()+", gender: "+getGender()+
				", phone: "+getPhone()+guamokdul);
	}
	
	@Override
	public String toString () {
		String str = "name: "+getName()+", sid: "+getSid()+", gender: "+getGender()+
				", phone: "+getPhone();
		return str;
	}
	
	public void test() {
		System.out.println("test...");
	}
}
