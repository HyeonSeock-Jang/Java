import java.util.*;

public class p20210104test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("���ڿ��� �Է��ϼ���");
			String str = scan.next();
//			if(str.startsWith("www")) {
			try {
				if(str.substring(0, 3).equals("www")) {
					System.out.println("www�� �����߽��ϴ�");
				}else if(str.equals("quit")) {
					break;
				}
			}catch(StringIndexOutOfBoundsException e){
				scan = new Scanner(System.in);
				System.out.println("�ʹ� ª�� �Է��߽��ϴ�.");
			}
			
		}
	}

}
