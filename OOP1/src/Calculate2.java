import java.util.Arrays;
import java.util.Scanner;

public class Calculate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Scanner�� �̿��Ͽ� String������ ���� �޴´�.
		 * String ���� ����Ͽ� ����ϴ� �˰����� ����ÿ�
		 * JavaScript���� ����Ͽ� eval�Ἥ ����ϱ� ����...
		 * �̰� ���� 3�ٸ��� ����...
		 * 
		 * ex1) String str = "135+513";...>int answer = 648;
		 * ex2) String str = "842*41/7+15";...>int answer = 648;
		 */
		
		/*
		 * scan���� str�� �޴´� ex) 123+456
		 * 1. for�� ������ ��ȣ�� ������ �˾Ƴ���
		 * 2. ��ȣ����+1��ŭ ���ڳ��� �迭 ����� ��ȣ������ŭ ��ȣ �迭(char) �����
		 * 3. for�� ������ ��ȣ�� ���� �迭�� �� �ֱ�
		 * 4. 2�� for�� ������ �迭�� ��ȣ�� ���� ���ϱ� *,/ã�Ƽ� 1,2,3...���ϰ� �ѹ� ������ false�ؼ�
		 * 		+,-ã��
		 * 5. while true, for�� ������ ��ȣ���� �迭�� ���� ���, ��� �� �� ���� �迭 ����  
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
