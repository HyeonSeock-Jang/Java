import java.util.*;

public class PlusR {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int munze=0;
		boolean a=true;
		while(a) {
			try {
				System.out.println("Ǯ ������ ������ �Է��Ͻÿ�.");
				munze = scan.nextInt();
			}catch(InputMismatchException e){
				System.out.println("�߸� �Է��Ͽ����ϴ�.");
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
			System.out.println("���� ����"+correct);
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
		System.out.println("�ɸ� �ð�: "+takeTime+"��");
		System.out.println("���� ����: "+correct);
	}
	public static void clear() {
		for(int i = 0;i<80;i++) {
			System.out.println(" ");
		}
	}

}
