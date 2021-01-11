package ch06;

import java.util.Scanner;


public class ArrayProc {
	public void getValues(int[] array) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i<array.length;i++) {
			System.out.println("성적을 입력하세요");
			array[i]=input.nextInt();
		}
	}
	public double getAverage(int[] array) {
		double total = 0;
		for(int i = 0;i<array.length;i++) {
			total+=array[i];
		}
		return total/array.length;
	}
	
//	Run||Debug
	public static void main(String[] args) {
		ArrayProc arr = new ArrayProc();
		int[] scores = new int[5];
		
		arr.getValues(scores);
		
		System.out.println(arr.getAverage(scores));
		
	}
}
