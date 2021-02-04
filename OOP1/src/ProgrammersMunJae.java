import java.util.*;

public class ProgrammersMunJae {
	
	public static void main(String[] args) {
		int n = 5;
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};
		/* 
		 * n만큼 2차원 배열 만들고
//		 * for문 돌려서 나누기 2 하는 나머지 넣고 값 나누기2
		 * for문 돌려서 arr1, arr2 둘 중 하나라도 2로 나눴을 때 나머지가 1이면
		 * String arr3의 i번째 인덱스에  
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