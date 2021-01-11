package oopv2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student();
		std1.setName("�浿ȫ");
		std1.setGender("����");
		std1.setPhone("ADS2421-2");
		std1.setDept("����");
		std1.setSid("1245215");
		std1.print();
		
		
		
		Professor prof1 = new Professor();
		prof1.setName("�߿���");
		prof1.setGender("����");
//		prof1.setPhone("124SDA-162");
		prof1.setDept("����");
		prof1.setSid("1632");
		
		
		prof1.setLecture(new String[] {"���α׷��ֱ���","�����α׷���"});
//		System.out.println(Arrays.toString(prof1.getLecture()));
//		prof1.getLecture();
		prof1.sumInt(3, 4);
		prof1.print();
		
		System.out.println();
		
		Person person = new Person();
		
		person.print();
		//���� �� ��ü�� ����Ű�� ��ü�� ���� ����� ��ȯ
		person = new Professor();
		//�׷��� ������ ���⼭ person�� Professor�� ����Ű�� �ο��߱� ������
		person.print();
		//���� print�� professor�� ��...
		person = std1;
		person = prof1;
		person.print();
		
		/*
	OOP(object oriented programming) 4�� Ư¡
		�߻�ȭ=>���ʿ��� ���� �� ������ ����� ��(���������� ����)
		
		ĸ��ȭ(encapsulation):��ü�� ������Ƽ�� �� ������Ƽ�� ������� �ϴ� ��ɵ��� �� ���� �׷���
		
		���=> �ٸ� Ŭ�����κ��� ������Ƽ�� ����� ���
		Ű���� extends�� ���.
		� Ŭ������ ��ӹ��� ������ �⺻������ ObjectŬ���� ���
		���� ���� ��ӹ޴´ٸ� ���� �� ��ӹ޴� Ŭ������ super/parent class
		���� ��ӹް������� ���� �� Ŭ������ ���Ͽ� sub/child class
		
		������ (polymorphism):���, �޼ҵ� �������̵�, �޼ҵ� �����ε� ���� �̿���
							������ ���������� ���� ��������� ����...
		
		
		
		
		constructor ������: ��ü�� �����Ϸ��� �ݵ�� ���������� �����Ǵ� Ư���� �޼ҵ尡 �ִ�
							�޼ҵ带 �����ڰ� ���������� ������ �ڵ����� ����
							
		
		
		
		method overriding:�޼ҵ� ������
						�θ�κ��� ���𰡸� �޾�����
						���� �������Ѵ�
						
		method overloading: ������ �޼ҵ� ������ ���� ����
							�Ű������� ������ Ÿ�Ե����� �޶���...
		 * 
		 */
		
		Person[] pArr = new Person[3];
		pArr[0] = new Person();
		pArr[0].setName("ȫ���");
		pArr[1] = new Professor();
		pArr[1].setName("����");
		pArr[2] = new Professor();
		pArr[2].setName("������");
		System.out.println(pArr[0].getName());
		
		print(pArr);
		Person a = new Person("ȫ�浿","ȫ�浿","ȫ�浿","ȫ�浿","ȫ�浿");
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
