import java.util.*;

public class p20210104test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("문자열을 입력하세요");
			String str = scan.next();
//			if(str.startsWith("www")) {
			try {
				if(str.substring(0, 3).equals("www")) {
					System.out.println("www로 시작했습니다");
				}else if(str.equals("quit")) {
					break;
				}
			}catch(StringIndexOutOfBoundsException e){
				scan = new Scanner(System.in);
				System.out.println("너무 짧게 입력했습니다.");
			}
			
		}
	}

}
