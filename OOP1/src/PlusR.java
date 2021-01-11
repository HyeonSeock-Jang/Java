import java.util.*;

public class PlusR {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int munze=0;
		boolean a=true;
		while(a) {
			try {
				System.out.println("풀 문제의 갯수를 입력하시오.");
				munze = scan.nextInt();
			}catch(InputMismatchException e){
				System.out.println("잘못 입력하였습니다.");
				System.out.println("");
				scan = new Scanner(System.in);
				continue;
			}
			a=false;
		}
		int firstNum = 0;
		int secondNum = 0;
		int answer = 0;
		int correct = 0;
		long firstTime = System.currentTimeMillis();
		for(int i = 0; i<munze; i++) {
			clear();
			System.out.println("맞은 갯수"+correct);
			firstNum = random.nextInt(41)-20;
			secondNum = random.nextInt(41)-20;
			System.out.println(firstNum);
			System.out.println(secondNum);
			
			try {
				answer = scan.nextInt();
			}catch(InputMismatchException e){
				scan = new Scanner(System.in);
				i--;
				
			}
			
			correct += (answer==firstNum+secondNum)?1:0;
			
		}
		long secondTime = System.currentTimeMillis();
		double takeTime = (double)(secondTime-firstTime)/1000;
		System.out.println("걸린 시간: "+takeTime+"초");
		System.out.println("맞은 갯수: "+correct);
	}
	public static void clear() {
		for(int i = 0;i<80;i++) {
			System.out.println(" ");
		}
	}

}
