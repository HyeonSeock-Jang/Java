package testMethod;

import java.util.*;
import java.util.concurrent.*;
//import java.util.concurrent.Executor;
//import java.util.concurrent.Executors;

public class MyCounterTest1 {
	public static void main(String[] args) {
		MyCounter obj = new MyCounter() {
			@Override
			public void inc() {
				System.out.println("�ƾƾ�");
			}
		};
		
		Jasik son = new Jasik(10);
		
		Runnable a = ()->{
			for(int i = 0;i<=10;i++)
				System.out.println(i+"��1");
		};//���ٽ�
		Runnable b = ()->{
			for(int i = 0;i<=10;i++)
				System.out.println(i+"��2");
		};//���ٽ�
		new Thread(()->{
		      System.out.println("AAAAA");
		}).start();
		
		
		
		
//		System.out.println(a);
//		Executor start1 = Executors.newCachedThreadPool();
//		start1.execute(a);
//		start1.execute(b);
		
		
		int x = 10;
		obj.inc();
		System.out.println("obj = " + obj.value);
		
	}
}
