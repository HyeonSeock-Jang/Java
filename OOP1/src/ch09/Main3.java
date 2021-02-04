package ch09;

import java.util.*;

public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Collection framework : 자료구조
		 * 			stack, queue, list, set, map, tree...;
		 */
		/*
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(7);
		list.add(3);
		list.add(40);
			
		for(int n : list) {
			System.out.println(n);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		*/
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("15","123",4,"홍길동",1));
		list.add(new Student("1412","123",3,"장발장",2));
		list.add(new Student("4367","53218",2,"가나다",3));
		list.add(new Student("7143","132412",1,"으아악",4));
		
		System.out.println(list);
//		System.out.println(list.get(0).getGpa());
		System.out.println("*********************");
		
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}
	public void sort(ArrayList<Student> list) {
		for(int i = 0;i<list.size()-1;i++) {
			int minIdx = i;
			for(int j = i; j<list.size();j++) {
				if(list.get(minIdx).compareTo(list.get(j))<0) {
					minIdx = j;
				}
			}
			Student s = list.get(i);
			list.set(i, list.get(minIdx));
			list.set(minIdx, s);
			
		}
	}
	//overliding 된 sort를 우리가 가져와서 overriding 했다
}
