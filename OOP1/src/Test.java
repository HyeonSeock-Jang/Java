
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//testSomething();
		//testName();
		//testNum();
		//testBoolean();
		//lightSpeed();
		//testExpression();
		//testLeapYear();
		toBinaryString(53);
		//testLogical();
		//testMatah();
//		testNum();
	}
	private static void testSomething(){
		System.out.println("Lonely Lonely Day");
	}
	private static void testName() {
		byte bn = 3; //1byte
		short sn = 4; //2byte 3만즈음
		int in = 5; //4byte 21억즈음
		long dn = -4; //8byte 2의 63제곱
		
		sn = 016;
		System.out.println("8진수 016값: " +sn);
		sn = 0x11;
		System.out.println("16진수 0x11의 값: "+sn);
		sn = 0b110110;
		System.out.println("2진수 0b110110의 값: "+sn);
		
		float fv = (float)1.234567890123;//4byte, 유효자리 6~7
		/* double 타입의 숫자 뒤에 float을 나타내는 f를 붙이거나
		 * 
		 * 숫자 앞에 형변환(float) 괄호안에 데이터 타입을 입력해준다.
		 */
		System.out.println("float형 변수"+fv);
		
		double dv = 12.3;//8byte, 유효자리 15정도
		dv = 2.2E-1;// E숫자, 10의 숫자제곱
		System.out.println("double형 변수"+dv);
		
		char c ='a';
		in = c;
		System.out.println(in);
		System.out.println(c);
		System.out.printf("%x\n", in);
		c = '\u0061';
		System.out.println(c);
		
		/*
		 *  기초 자료유형
		 *  boolean < treu/false
		 */
		
		boolean flag = true;
		System.out.println(flag);
	}
	private static void testNum() {
		short sn = -4; //2byte
		
	}
	private static void testBoolean() {
		boolean bool = true;
		/*
		 * bool= false;
		 * System.out.println(bool);
		*/
		bool = 1 <2;
		System.out.println(bool);
		
		int index;
		index=0;
		
		index = index + 1;
	}
	private static void lightSpeed() {
		final double LIGHT_SPEED = 30E4;
		double distance = 40E12;
		double secs;
		
		secs = (distance/LIGHT_SPEED)/(60*60*24*365);
		System.out.print(secs);
	}
	
	public static void testExpression() {
		int num=3;
		
		printValue(10);
		printValue(num=7);
		add(2,3);
		sum(3,4);
		printValue(sum(3,4));
	}
	
	public static void printValue(int value) {
		System.out.println("점수값: "+value);
	}
	public static void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("result: "+result);
	}
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("result: "+result);
		return result;
	}
	public static void testLeapYear() {
		int year = 2020;
		boolean isLeapYear=false;
		/*400으로 나눠떨어지거나
		 * 4로 나눠떨어지면서 100으로 나눠떨어지지않으면 
		 */
		if (year%400==0)isLeapYear=true;
		else if((year%4==0)&(year%100!=0))isLeapYear=true;
		
		if (isLeapYear==true)System.out.println(year+"는 윤년입니다.");
		else System.out.println(year+"는 윤년입니다.");
	}
	public static void toBinaryString(int n) {
		String val = Integer.toBinaryString(n);
		//System.out.println(val);
		int numOfZeros = 32-val.length();
		char c = val.charAt(0);
		System.out.println(c);
		
		for (int i=0;i<numOfZeros;i++) {
			System.out.print("0");
		}
		System.out.println("\n"+val);
	}
	public static void testLogical() {
		int n = 4;
		/*n이 1~10 사이의 값이면 result가 true가 되도록 하려면*/
		boolean result = (n>=1) && (n<=10);
		System.out.println(result);
		
		//n이 1~10 사이의 값이 아니면 result가 true
		result = (n<1)||(n>10);
		System.out.println(result);
		
		result = !((n>=1) && (n<=10));
		System.out.println(result);
		
		double dvalue = 4.0;
		
		double dresult = dvalue + n;
		
		System.out.println(dresult);
		
		char c = '나';
		n = c;
		System.out.println(n);
	}
	public static void testMatah(double a,double b,double c) {
		//ax^2+bx+c
		//r1 = (-b+Math.sqrt(b^2-4ac))/2a
		//r2 = (-b+Math.sqrt(b^2+4ac))/2a
		//해가 없는 경우 (b-ac<0)
		double sqrt = Math.sqrt(b*b-4*a*c);
		double r1 = 0, r2= 0;		
		if(b-a*c<0) System.out.println("해가 없습니다.");
		else {
			r1 = (-b+sqrt)/(2*a);
			r2 = (-b-sqrt)/(2*a);
		}
	}
}

