package ch07;

public class Animal {
	private int weight;
	private int picture;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPicture() {
		return picture;
	}
	public void setPicture(int picture) {
		this.picture = picture;
	}
	public void eat() {
		System.out.println("eat()이 호출되었음");
	}
	public void sleep() {
		System.out.println("sleep()이 호출되었음");
	}
}
