
public class SomethingForNothing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println("I'm a new Java programmer.");
		/*테스트용
		 * 
		 * */
		// 4바이트
		System.out.println("4바이트 정수의 최대값: " + Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		// 1바이트
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		// 2바이트
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		
		// 8바이트
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		String hong = "홍길동의 나이는 " + 20 ; // "홍길동의 나이는 " + "20"자동 변환
		System.out.println(hong);
	} 

	public static int sum(int a, int b) {
		return a + b;
	}
}