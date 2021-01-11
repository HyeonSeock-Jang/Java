package ch06;

public class Main4 {
	public static void main(String[] args) {
		Animal ani = new Animal();
		Dog dog = new Dog();
		Animal cat = new Animal() {
			public void speak() {
				super.speak();
				System.out.println("¾ß¿Ë");
			}
		};
		Employee yaho = new Employee(15,"15");
		
		yaho.animal.speak();
		Employee.animal.speak();
		
		ani.speak();
		System.out.println();
		dog.speak();
		System.out.println();
		cat.speak();
	}
}
