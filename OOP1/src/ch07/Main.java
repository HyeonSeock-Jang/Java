package ch07;

import java.util.Arrays;

import ch07.Manager;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car car = new Car();
//		Bus bus = new Bus();
//		Truck truck = new Truck();
//		
//		bus.setSpeed(100);
//		car.setSpeed(150);
//		truck.setSpeed(70);
//		
//		System.out.println(bus.getSpeed());
//		System.out.println(car.getSpeed());
//		System.out.println(truck.getSpeed());
		
//		animal();
//		employee();
//		shape();
//		animal2();
//		bank();
//		equal();
		random();
		
	}
	public static void random() {
		MyRandom rand = new MyRandom();
		
		int[] value = new int[30];
		
		for(int i = 0; i<value.length;i++) {
			value[i]=rand.nextInt(100)+1;
		}
		
		System.out.println(Arrays.toString(value));
	}
	
	public static void equal() {
		Rectangle rec1 = new Rectangle();
		rec1.setX(10);
		rec1.setY(15);
		Rectangle rec2 = new Rectangle();
		rec2.setX(10);
		rec2.setY(10);
		System.out.println(rec1.equals(rec2));
		
		Bus bus = new Bus();
		rec1.equals(bus);
		bus.equals(rec1);
	}
	
	public static void bank() {
		Bank bank = new BadBank();
		System.out.println(bank.getInterestRate());
	}
	
	
	public static void animal2() {
		Dog dog = new Dog();
		dog.test();
	}
	
	public static void shape() {
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		
		rec1.setX(5);
		rec1.setY(3);
		rec1.setWidth(10);
		rec1.setHeight(20);
		
		rec1.print();
		rec1.draw();
		
		rec2.setX(8);
		rec2.setY(9);
		rec2.setWidth(10);
		rec2.setHeight(20);
		
		rec2.print();
		rec2.draw();
		
		System.out.println(rec1.getClass().getName());
		System.out.println(rec2.getClass().getName());
	}
	
	
	public static void employee() {
		Manager tom = new Manager("Tom","Seoul",1_000_000,123_456,10000);
//		tom.setName("Tom");
//		tom.setAddress("Seoul");
//		tom.setSalary(1_000_000);
//		tom.setRrn(123_456);
//		System.out.println(tom.getBonus());
		System.out.println(tom);
		tom.test();
	}
	
	public static void animal() {
		Lion lion = new Lion();
		Eagle eagle = new Eagle();
		
		lion.eat();
		lion.sleep();
		lion.roar();
		eagle.eat();
		eagle.sleep();
		eagle.fly();
	}

}
