import java.util.Arrays;
import java.util.Scanner;

public class Calculate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner을 이용하여 String값으로 식을 받는다.
		 * String 값을 계산하여 출력하는 알고리즘을 만드시오
		 * JavaScript엔진 사용하여 eval써서 계산하기 금지...
		 * 이거 쓰면 3줄만에 끝남...
		 * 
		 * ex1) String str = "135+513";...>int answer = 648;
		 * ex2) String str = "842*41/7+15";...>int answer = 648;
		 */
		
		/*
		 * scan으로 str값 받는다 ex) 123+456
		 * 1. for문 돌려서 부호의 갯수를 알아낸다
		 * 2. 부호갯수+1만큼 숫자넣을 배열 만들고 부호갯수만큼 부호 배열(char) 만들기
		 * 3. for문 돌려서 부호랑 숫자 배열에 다 넣기
		 * 4. 2중 for문 돌려서 배열로 부호의 순서 정하기 *,/찾아서 1,2,3...정하고 한번 끝나면 false해서
		 * 		+,-찾기
		 * 5. while true, for문 돌려서 부호순서 배열에 따라 계산, 계산 할 때 마다 배열 당기기  
		 */
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int markCount = 0;
		for(int i = 0;i<str.length();i++) 
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/')
			markCount++;
		double[] proto = new double[markCount+1];
		char[] mark = new char[markCount];
		int[] markTH= new int[markCount+1];
		int position = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/') {
				mark[position]=str.charAt(i);
				position++;
				
			}else {
				proto[position]=proto[position]*10+(str.charAt(i)-'0');
			}
		}
		
		
		position=1;
		for(int i =0;i<2;i++) {
			for(int j = 0;j<mark.length;j++) {
				if(i==0&&(mark[j]=='*'||mark[j]=='/'))
					markTH[j]=position++;
				else if(markTH[j]==0&&i!=0)
					markTH[j]=position++;
			}
		}
		
//		System.out.println(Arrays.toString(markTH));
//		System.out.println(Arrays.toString(proto));
//		System.out.println(Arrays.toString(mark));
//		position=1;
		while(markTH[0]!=0) {
			for(int i =0;i<mark.length-1;i++) {
				if(markTH[i]==position) {
					switch(mark[i]) {
					case '+':
						proto[i+1]=proto[i]+proto[i+1];
						break;
					case '-':
						proto[i+1]=proto[i]-proto[i+1];
						break;
					case '*':
						proto[i+1]=proto[i]*proto[i+1];
						break;
					case '/':
						proto[i+1]=proto[i]/proto[i+1];
						break;
					}
					position++;
					pullArr(proto,i);
					pullArr(markTH,i);
					pullArr(mark,i);
				}else if(markTH[i]==0)break;
//				System.out.println(Arrays.toString(markTH));
//				System.out.println(Arrays.toString(proto));
//				System.out.println(Arrays.toString(mark));
//				scan.nextInt();
			}
			
		}
		System.out.println(proto[0]);
//		150+842*15-41/7+15
		 

	}
	
	static void pullArr (int[] arr, int a){
		for(int i = a; i < arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
	}
	static void pullArr (double[] arr, int a){
		for(int i = a; i < arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
	}
	static void pullArr (char[] arr, int a){
		for(int i = a; i < arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
	}
}
