
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
		short sn = 4; //2byte 3������
		int in = 5; //4byte 21������
		long dn = -4; //8byte 2�� 63����
		
		sn = 016;
		System.out.println("8���� 016��: " +sn);
		sn = 0x11;
		System.out.println("16���� 0x11�� ��: "+sn);
		sn = 0b110110;
		System.out.println("2���� 0b110110�� ��: "+sn);
		
		float fv = (float)1.234567890123;//4byte, ��ȿ�ڸ� 6~7
		/* double Ÿ���� ���� �ڿ� float�� ��Ÿ���� f�� ���̰ų�
		 * 
		 * ���� �տ� ����ȯ(float) ��ȣ�ȿ� ������ Ÿ���� �Է����ش�.
		 */
		System.out.println("float�� ����"+fv);
		
		double dv = 12.3;//8byte, ��ȿ�ڸ� 15����
		dv = 2.2E-1;// E����, 10�� ��������
		System.out.println("double�� ����"+dv);
		
		char c ='a';
		in = c;
		System.out.println(in);
		System.out.println(c);
		System.out.printf("%x\n", in);
		c = '\u0061';
		System.out.println(c);
		
		/*
		 *  ���� �ڷ�����
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
		System.out.println("������: "+value);
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
		/*400���� �����������ų�
		 * 4�� �����������鼭 100���� ������������������ 
		 */
		if (year%400==0)isLeapYear=true;
		else if((year%4==0)&(year%100!=0))isLeapYear=true;
		
		if (isLeapYear==true)System.out.println(year+"�� �����Դϴ�.");
		else System.out.println(year+"�� �����Դϴ�.");
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
		/*n�� 1~10 ������ ���̸� result�� true�� �ǵ��� �Ϸ���*/
		boolean result = (n>=1) && (n<=10);
		System.out.println(result);
		
		//n�� 1~10 ������ ���� �ƴϸ� result�� true
		result = (n<1)||(n>10);
		System.out.println(result);
		
		result = !((n>=1) && (n<=10));
		System.out.println(result);
		
		double dvalue = 4.0;
		
		double dresult = dvalue + n;
		
		System.out.println(dresult);
		
		char c = '��';
		n = c;
		System.out.println(n);
	}
	public static void testMatah(double a,double b,double c) {
		//ax^2+bx+c
		//r1 = (-b+Math.sqrt(b^2-4ac))/2a
		//r2 = (-b+Math.sqrt(b^2+4ac))/2a
		//�ذ� ���� ��� (b-ac<0)
		double sqrt = Math.sqrt(b*b-4*a*c);
		double r1 = 0, r2= 0;		
		if(b-a*c<0) System.out.println("�ذ� �����ϴ�.");
		else {
			r1 = (-b+sqrt)/(2*a);
			r2 = (-b-sqrt)/(2*a);
		}
	}
}

