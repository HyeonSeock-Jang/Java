import java.util.*;

public class ProgrammersMunJae {
	
	public static void main(String[] args) {
		int n = 5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};
		/* 
		 * n��ŭ 2���� �迭 �����
//		 * for�� ������ ������ 2 �ϴ� ������ �ְ� �� ������2
		 * for�� ������ arr1, arr2 �� �� �ϳ��� 2�� ������ �� �������� 1�̸�
		 * String arr3�� i��° �ε�����  
		 */
		String[] arr3 = new String[n];
		for(int i = 0; i<n;i++) {
			arr3[i]="";
		}
		for(int i = 0; i<n;i++) {
			for(int j = n-1; j>=0;j--) {
				if(arr1[i]%2==1||arr2[i]%2==1)
					arr3[i]=arr3[i]+'#';
				else
					arr3[i]=arr3[i]+' ';
				arr1[i]/=2;
				arr2[i]/=2;
			}
		}
		for(int i = 0; i<arr3.length;i++) {
			System.out.println(arr3[i].toString());
		}
		
	}
}