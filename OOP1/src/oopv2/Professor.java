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
		String guamokdul =" ������ ";
		if (getLecture() !=null) {
			for(int i = 0; i<getLecture().length;i++) {
				guamokdul += (getLecture()[i]+" ");
			}
			guamokdul +="�Դϴ�";
		}else {
			guamokdul +="�����ϴ�";
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
