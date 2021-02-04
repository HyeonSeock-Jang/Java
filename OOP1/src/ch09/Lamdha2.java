package ch09;
import java.util.*;
import java.util.function.*;


public class Lamdha2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a ={1,2,3};
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//		System.out.println(list);
//		int b = (Integer)3;
//		Integer c = 5;
//		System.out.println(b);
//		b=c;
//		System.out.println(b);
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println();
			}
			
		});
		list.forEach((t)->System.out.println(t));
	}

}
