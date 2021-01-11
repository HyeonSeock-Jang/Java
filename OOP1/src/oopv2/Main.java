package oopv2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.setName("길동홍");
		std1.setGender("남성");
		std1.setPhone("ADS2421-2");
		std1.setDept("컴정");
		std1.setSid("1245215");
		std1.print();
		
		
		
		Professor prof1 = new Professor();
		prof1.setName("야옹이");
		prof1.setGender("남성");
//		prof1.setPhone("124SDA-162");
		prof1.setDept("컴정");
		prof1.setSid("1632");
		
		
		prof1.setLecture(new String[] {"프로그래밍기초","웹프로그래밍"});
//		System.out.println(Arrays.toString(prof1.getLecture()));
//		prof1.getLecture();
		prof1.sumInt(3, 4);
		prof1.print();
		
		System.out.println();
		
		Person person = new Person();
		
		person.print();
		//실제 이 개체가 가리키는 객체를 보고 결과를 반환
		person = new Professor();
		//그렇기 때문에 여기서 person에 Professor를 가르키게 부여했기 때문에
		person.print();
		//위의 print는 professor이 됨...
		person = std1;
		person = prof1;
		person.print();
		
		/*
	OOP(object oriented programming) 4대 특징
		추상화=>불필요한 구현 상세 내용은 숨기는 것(정보은닉을 통해)
		
		캡슐화(encapsulation):객체의 프로퍼티와 그 프로퍼티를 대상으로 하는 기능들은 한 곳에 그룹핑
		
		상속=> 다른 클래스로부터 프로퍼티와 기능을 상속
		키워드 extends를 사용.
		어떤 클래스라도 상속받지 않으면 기본적으로 Object클래스 상속
		누가 나를 상속받는다면 나는 그 상속받는 클래스의 super/parent class
		내가 상속받고있으면 나는 그 클래스에 대하여 sub/child class
		
		다형성 (polymorphism):상속, 메소드 오버라이딩, 메소드 오버로딩 등을 이용해
							동일한 참조변수를 통해 여러기능을 수행...
		
		
		
		
		constructor 생성자: 객체를 생성하려면 반드시 내부적으로 생성되는 특별한 메소드가 있다
							메소드를 개발자가 구현해주지 않으면 자동으로 생성
							
		
		
		
		method overriding:메소드 재정의
						부모로부터 무언가를 받았지만
						내가 재정의한다
						
		method overloading: 동일한 메소드 여러개 선언 가능
							매개변수나 데이터 타입따위로 달라짐...
		 * 
		 */
		
		Person[] pArr = new Person[3];
		pArr[0] = new Person();
		pArr[0].setName("홍장미");
		pArr[1] = new Professor();
		pArr[1].setName("점성");
		pArr[2] = new Professor();
		pArr[2].setName("성나미");
		System.out.println(pArr[0].getName());
		
		print(pArr);
		Person a = new Person("홍길동","홍길동","홍길동","홍길동","홍길동");
	}
	
	public static void print(Person[] parr) {
		for (int i = 0;i<parr.length;i++) {
			parr[i].print();
			if(parr[i] instanceof Professor) {
				((Professor)parr[i]).test();
			}
		}
	}
	//method overloading
	public static void print(Professor[] parr) {
		for (int i = 0;i<parr.length;i++) {
			parr[i].print();
		}
	}
	

}
