package ch06;

public class MyArray {

	private int[] arr;
//	private int length=5;
	
	public MyArray() {
		System.out.println("�����ڸ� ȣ���...");
		arr=new int[5];
	}
	public MyArray(int length) {
		System.out.println("�����ڸ� ȣ���...2");
		arr=new int[length];
	}

	public void put(int idx, int value) {
		if(idx>=0&&idx<arr.length) {
			arr[idx]=value;			
		}

	}
	public int get(int idx) {
		if(idx>=0&&idx<arr.length) {
			return arr[idx];		
		}else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			return -1;
		}
	}
	
}
