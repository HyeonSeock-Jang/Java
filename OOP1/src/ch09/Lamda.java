package ch09;

import java.util.*;

public class Lamda {

	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(87,25,67,43,28);
//		System.out.println(list);
//		Collections.sort(list);
//		/* ������ �� �ִ� ������
//		 * �� �� �� �ֱ� ������,
//		 * �� �� �� �� �ֳ�?
//		 * ���� Ÿ���� Integer�� Comparable �������̽��� �����ϰ� �ֱ� ������.
//		 */
//		System.out.println(list);
//		Collections.reverse(list);
//		System.out.println(list);
		ArrayList<String> list = new ArrayList<>();
		list.add("apple");
		list.add("Peach");
		list.add("Banana");
		list.add("melon");
		list.add("Potato");
		list.add("Plum");
		System.out.println(list);
//		Collections.sort(list, new Comparator() {
//
//			@Override
//			public int compare(Object o1, Object o2) {
//				String s1 = (String)o1;
//				String s2 = (String)o2;
//				s1=s1.toLowerCase();
//				s2=s2.toLowerCase();
//				return s1.compareTo(s2);
//			}
//			
//		});
		Collections.sort(list, (o1, o2) -> o1.toLowerCase().compareTo(o2.toLowerCase()));
//		Collections.reverse(list, (o1, o2)->{
//			return o1.toLowerCase().compareTo(o2.toLowerCase());
//		});
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
