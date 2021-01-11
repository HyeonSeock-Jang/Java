package ch06;

import java.util.*;

public class GameCharacter {
	private ArrayList<GameItem> list = new ArrayList<>();
	
	private class GameItem{
		private String name;
		private int type;
		private int price;
		
		public int getPrice() {
			return this.price;
		}

		@Override
		public String toString() {
			return "GameItem [name=" + name + ", type=" + type + ", price=" + price + "]";
		}
		
	}
	public void add(String name, int type, int price) {
		GameItem item1 = new GameItem();
		item1.name=name;
		item1.type=type;
		item1.price=price;
		list.add(item1);
	}
	public void print(){
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
	public static void main(String[] args){
		GameCharacter alpha = new GameCharacter();
		alpha.add("БэЗа°Л",1,100);
		alpha.print();
	}
}
