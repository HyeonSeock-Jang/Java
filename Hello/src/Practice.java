import java.time.*;
import java.util.*;


public class Practice {
	private static Scanner input = new Scanner(System.in);
	//private static Scanner random = new Random();
	public static void main(String[] args) {
		
		//calLightSpeed();
		//calCircleArea();
		//repFloastLiteral();
		//charTest();
		//testIncreaseDecreaseExptression();
		//testComparisonOperator();
		//testBitwiseOperator();
		//quatraticEquation(1,-10,23);
		//testStringType();
		//DrawRuler();
		//testScanner();
		//testCirRec();
		//testIfElse();
		//testLeapYear();
		//testOdd();
		//testLarger();
		//testMoney();
		//testPoint();
		//greetingMessage();
		//testSwitch();
		//testSwitch3();
		//testSwitchMonth();
		//testtest();
		//testwhile();
		//testmulti();
		//testacc();
		//testdowhile();
		//gCD();
		//testFor();
		//testFactorial();
		//testms();
		//testYak();
		//testNanSu();
		//testDupli();
		//testPrint();
		//testBreak();
		//testContinue();
		//testNum();
		//testFacto();
		testPie();
	}
		// TODO Auto-generated method stub
	private static void calLightSpeed() {
	
		// ���� �ӵ��� 1�ʿ� 30�� km�� �̵��մϴ�.
		// ���� 1�⵿�� �̵��� �Ÿ��� ���.
		// ���� �ʴ�ӵ� * 60 * 60 * 24 * 365 ��ŭ �̵��Ѵ�.
		
		int lightSpeed = 300000;
		
		int num = 65;
		
		short num2 = (short)num;
		
		System.out.println((char)num2);
		
		long distance = lightSpeed * 60 * 60 * 24 * 365;
				
		System.out.println("���� 1�⵿�� �̵��ϴ� �Ÿ�: " + distance);
	}

	private static void calCircleArea() {
		// ���� ����: r * r * 3.141592
		
		int r = 5;
		
		double pi = 3.141592F;
		
		double area = r * r * pi;
		
		System.out.println("���� ������ :" + area);
	}
	
	private static void repFloastLiteral(){
		double d1 = 146.91;
		double d2 = 1.4691E+2;
		System.out.println(d1);
		System.out.println(d2);
	}
	private static void charTest() {
		char ch1 = '��';
		char ch2 = '\uac00';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("������\\n\n"
				+ "������\\t\t������"
				+ "\rĳ���� ����\\r");

	
	}
	private static void testIncreaseDecreaseExptression(){
		int x = 3;
		/*
		System.out.println("x++: " + x++); // 3
		System.out.println(x); // 4
		System.out.println("++x: " + ++x); // 5
		System.out.println(x); // 5
		
		System.out.println("x--: " + x--); // 5
		System.out.println(x); // 4
		System.out.println("--x: " + --x); // 3
		System.out.println(x); // 3
		*/
		
		int y = 4;
		
		int result = x++ + y; // result �� 7
		
		System.out.println(result);
		System.out.println(x);
		
		x = 3;
		
		result = ++x + y; // result = 8
		
		System.out.println(result);
	}
	private static void testComparisonOperator() {
		int x = 3;
		int y = 4;
		
		/*
		System.out.println((x == y) + " "); // false
		System.out.println((x != y) + " "); // true
		System.out.println((x > y) + " "); // false
		System.out.println((x < y) + " "); // true
		System.out.println((x >= y) + " "); // false
		System.out.println((x <= y) + " "); // true
		*/
		
		System.out.println(x == 3 || y++ == 7);
		System.out.println(y);
	}
	private static void testBitwiseOperator() {
		int x = 0x0fff;
		int y = 0xfff0;
		int z = 0x0ff0;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.printf("(x&y): %x\n", x&y); // 0ff0
		System.out.printf("(x|y): %x\n", x|y); // ffff
	}
	public static void quatraticEquation(double a, double b, double c) {
		// ax^2+bx+c�� �ظ� ���ϱ�.
		// r1 = (-b + square_root(b^2 - 4ac)) / 2a
		// r2 = (-b - square_root(b^2 - 4ac)) / 2a
		/* 
		//a=1, b=-10a, c=25a-2
		double a = 1, b = -10 * a, c = 25 * a - 2;
		*/
		double r1 = (-b+Math.sqrt(b*b-4*a*c))/(2*a);
		double r2 = (-b-Math.sqrt(b*b-4*a*c))/(2*a);
		
		System.out.println(r1);
		System.out.println(r2);
		
		
		
	}
	
	private static void testStringType() {
		// ���ڿ� "Hello World!"�� ���� S1��, ���ڿ� "I'm a new Java Programer!"�� ����s2�� �����ϰ�
		// System.out.println() �޼ҵ带 �� ���� ȣ�⿡�� �Ʒ��� ����� �����.
		/*
		 * Hellow World!
		 * I'm a new Java Programmer!
		 */
		
		String s1 = "Hellow World!", s2 = "I'm a new Java Programmer";
		
		System.out.println(s1 + "\n" + s2);
	}
	private static void DrawRuler() {
		String s1 = "..........", s2 = s1 + "|" + s1, s3 = s2 + "|" + s2;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	private static void testScanner() {
		Scanner input = new Scanner(System.in);
		
		int n1, n2, sum;
		
		System.out.print("ù ��° ������ �Է��ϼ���. :");
		n1 = input.nextInt();
		
		System.out.print("�� ��° ������ �Է��ϼ���. :");
		n2 = input.nextInt();
		
		sum = SomethingForNothing.sum(n1, n2);
		
		System.out.print("���� " + sum + "�Դϴ�.");
	}
	private static void testCirRec() {
		Scanner input = new Scanner(System.in);
		
		/*
		 * �� ������ ���� ���ϴ� ���α׷�
		 * ������ 5
		 * ���� 78.5
		 * ���� 3.14
		 * ���� ���� r^2*3.14
		 */
		double r1, r2, m, d, n, pi = 3.14;
		
		System.out.print("�������� �Է��ϼ���. :");
		r1 = input.nextInt();
		
		n = r1*r1*pi;
		
		System.out.println("��������" + n + "�Դϴ�.");
		
		/*
		 * ���簢�� ���̿� �ѷ�
		 */
		System.out.print("���簢���� ���α��̸� �Է��ϼ���. :");
		r1 = input.nextInt();
		System.out.print("���簢���� ���α��̸� �Է��ϼ���. :");
		r2 = input.nextInt();
		
		m = (r1*r2);
		
		d = 2*(r1+r2);
		
		System.out.println("���簢���� ���̴� " +m+"���簢�� �ѷ��� "+d+"�Դϴ�.");
		
	}
	private static void testIfElse() {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("���� �Է��ϼ���");
		num = input.nextInt();
		
		if (num>0) {
			System.out.println("����Դϴ�");
		}
		else {
			if (num==0) {
				System.out.println("0�Դϴ�");
			}
			else {
				System.out.println("�����Դϴ�");
			}
		}
	}
	private static boolean testLeapYear() {
		
		boolean isLeapYear;
		int year = 2020;
		
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		
		/*
		System.out.print("�⵵�� �Է��ϼ���");
		year = input.nextInt();
		*/
		isLeapYear = year%400==0 || (year%4==0 && year%100!=0);
		/*
		if (isLeapYear) {
			System.out.println("�����Դϴ�.");
		}
		else {
			System.out.println("�����̾ƴմϴ�.");
		}
		*/
		return isLeapYear;
			
	}
	private static void testOdd() {
		boolean oddsome;
		int num;
		
		System.out.print("�������Է��Ͻÿ�: ");
		num = input.nextInt();
		
		oddsome = num%2==0;
		
		if (oddsome) {
			System.out.println(num+"�� ¦���Դϴ�.");
		} else {
			System.out.println(num+"�� Ȧ���Դϴ�.");
		}
		System.out.println("���α׷��� �����մϴ�");
	}
	private static void testLarger() {
		int num1;
		int num2;
		
		System.out.print("ù ��° ���ڸ� �Է��ϼ���: ");
		num1 = input.nextInt();
		System.out.print("�� ��° ���ڸ� �Է��ϼ���: ");
		num2 = input.nextInt();
		if (num1>num2) {
			System.out.print("�� ū ��: "+num1);
		} else if(num1<num2) {
			System.out.print("�� ū ��: "+num2);
		} else {
			System.out.print(num1+"��"+num2+"�� �����ϴ�.");
		}
			
	}
	private static void testMoney() {
		int goal;
		int money;
		int bonus;
		int left;
		System.out.print("��ǥ�� �Է��ϼ���");
		goal = input.nextInt();
		System.out.print("������ �Է��ϼ���");
		money = input.nextInt();
		
		left = money-goal;
		bonus = (left)/5;
		
		if (money>goal) {
			System.out.println("�̹� ���ʽ���"+bonus+"�Դϴ�.");
		}else {
			System.out.println("����� ���ܾ� �� ������"+left+"�Դϴ�.");
		}
			
	}
	private static void testPoint() {
		int point;
		System.out.print("������ �Է��ϼ���");
		point = input.nextInt();
		char grade; 
		if (point>=90) {
			grade = 'A';
		}else if(point>=80) {
			grade = 'B';
		}else if(point>=70) {
			grade = 'C';
		}else if(point>=60) {
			grade = 'D';
		}else {
			grade = 'F';
		}
		System.out.print(point+"���� "+grade+"�Դϴ�.");
		
		System.out.println(60<=grade ? "�հ�":"���հ�");
	}
	private static void greetingMessage() {
		/*LocalDateTime dateTime = LocalDateTime.now();
		Date date = new Date();
		
		int currentHour = dateTime.getHour();
		*/
		Calendar calendar=Calendar.getInstance();
		int currentHour = calendar.get(calendar.HOUR_OF_DAY);
		//int currentHour = date.getHours(); //deprecated
		/* 11�� �������� "Good morning"
		 * 15�� �������� "Good afternoon"
		 * 20�� �������� "Good evening"
		 * 24�� �������� "Good night" 
		 */
		System.out.println(currentHour);
		if (currentHour<11) {
			System.out.println("Good morning");
		} else if (currentHour<15) {
			System.out.println("Good afternoon");
		} else if (currentHour<20) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}
		
			
	}
	private static void testSwitch() {
		System.out.print("������ �Է��ϼ���");
		int num = input.nextInt();
		char grade;
		/*
		System.out.print("�ϳ��� ������ �Է��ϼ���");
		int num = input.nextInt();
		// indentation
		switch(num) {
		case 1:
			System.out.println("�ϳ�");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		default:
			System.out.println("�ʹ� ����");
		*/
		switch (num/10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("����� "+grade+"�Դϴ�.");
	}
	private static void testSwitch3() {
		System.out.print("�� �̸��� �Է��ϼ���");
		String month = input.nextLine();
		
		/*
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("1");
			break;
		case "february":
			System.out.println("2");
			break;
		case "march":
			System.out.println("3");
			break;
		case "april":
			System.out.println("4");
			break;
		case "may":
			System.out.println("5");
			break;
		case "june":
			System.out.println("6");
			break;
		case "july":
			System.out.println("7");
			break;
		case "august":
			System.out.println("8");
			break;
		case "september":
			System.out.println("9");
			break;
		case "october":
			System.out.println("10");
			break;
		case "november":
			System.out.println("11");
			break;
		case "december":
			System.out.println("12");
			
		}
		*/
		if (month.toLowerCase().equals("january")) {
			System.out.println(1);
		}
	}
	
	private static void testSwitchMonth(){
		System.out.print("�ϼ��� �˰� ���� ���� �Է��ϼ���: ");
		int month=input.nextInt();
		
		int day=0;
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			day=30;
			break;
		case 2:
			//boolean isLeapYear = testLeapYear();
			if (testLeapYear()) day = 29;
			else day=28;
			break;
		default:
			day=31;
		}
		System.out.println(month +"���� �ϼ���"+day+"�Դϴ�.");
	}
	private static void testtest() {
		int a = 3;
		int b;
		if (a == 3) b = 1;
	
	}
	private static void testwhile() {
		//�ϴ��� �ټ��� �ݺ�
		int i = 0;
		//for.i.range();
		while(i<10) {
			System.out.print(i+" ");
			i++; //i++, ++i
		}
	}
	private static void testmulti() {
		int i = 1;
		// ������
		System.out.println("�������� ����, �������� ����.");
		int gugu = input.nextInt();
		/* gugu ���� 2���� 19�� �ƴϸ� ������ �ݺ�
		 * System.out.println("2~19������ ���� �Է��ϼ���);
		 * System.out.println("�������� ����, �������� ����.");
		 * int gugu = input.nextInt();
		 */
		while((2>gugu)||(gugu>19)){
			System.out.println("2~19������ ���� �Է��ϼ���");
			 System.out.println("�������� ����, �������� ����.");
			 gugu = input.nextInt();
		}
		while (i<20) {
			System.out.println(gugu+"," +i+"��"+ gugu * i
			+ "\n�������� ����, �������� ����.");
			i++;
			
		}
	}
	private static void testacc() {
		/* acc += acc++
		 * acc ++
		 */
		int i = 1;
		System.out.println("��������");
		int acc = input.nextInt();
		while (i<10) {
			acc = acc+i;
			i++;
		}
		System.out.println(acc);
	}
	private static void testdowhile() {
		int i = 0;
		int gugu;
		do {
			System.out.print("�ùٸ� ���� �Է��ϼ���. [1~12]: ");
			i= input.nextInt();
		}while(i<1||i>12);
		System.out.println("�Է��� ���� "+i+"�Դϴ�");
	}
	private static void gCD() {
		int x;
		int y;
		int r;
		System.out.println("�ΰ��� ������ �Է��Ͻÿ�[x>y]");
		x = input.nextInt();
		y = input.nextInt();
		do {
			r=x%y;
			x=y;
			y=r;
		}while(r>0);
		System.out.println("�ΰ��� �ִ� ������� "+x);
	}
	private static void testFor() {
		int i=0;
		/*
		 * for (i=0;i<5;i++) {
		 * 1+2+3+...+10
		 * n(n+1)/2
		 */
		int sum = 0;
		
		/*
		while (i<=10) {
			sum = sum +i;
			i++;
		
		}
		*/
		for (;i<=10;i++) {
			sum +=1;//sum = sum +1;
		}
		System.out.println(sum);			
	}
	private static void testFactorial() {
		/*
		 * 2! => 2x1
		 * 3! => 3x2x1
		 * 4! => 4x3x2x1
		 */
		
		System.out.print("������ �Է��Ͻÿ�: ");
		int a = input.nextInt();
		int num=1;
		for (;a>0;a--) {
			num = num * a;
			System.out.println(num);
		}
		System.out.print("Factorial: "+num);
		
	}
	private static void testms() {
		
		long start = System.currentTimeMillis();
		for (int i =0;i<100000;i++) {
			int ms;
			ms =+1;
		}
		long end = System.currentTimeMillis();
		System.out.print(end-start+" ms");
	}
	private static void testYak() {
		int num;
		
		do {
			System.out.print("���� ������ �Է��Ͻÿ�: ");
			num=input.nextInt();
		} while (num<=0);
		System.out.println(num+"�� �����");
		for(int i=1;(num/2)>=i;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.print(num);
	}
	private static void testNanSu() {
		System.out.print("������ ����: ");
		int n = input.nextInt();
		
		int ranNum = 0;
		int sum = 0;
		Random random = new Random();
		
		for (int i=0;i<n;i++) {
			ranNum = random.nextInt(100);//0~99���� ����
			sum += ranNum;
			System.out.print(ranNum+" ");
		}
		System.out.print("\n������ ��: "+sum);
	}
	private static void testDupli() {
		Random random = new Random();
		int nanNum = random.nextInt(10);
		System.out.println(nanNum);
		for(int i=0;i<nanNum;i++) {
			for(int k=0;k<nanNum;k++) {
				System.out.print("a");
				}
			System.out.print("\n");
		}
	}
	private static void testPrint() {
		/*
		 * 
		 * 
		 */
		/*for(int i=0;i<10;i++) {
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			*/
		/*
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (j>=i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("\n");
		}
			*/
		/*
		for (int i=1;i<n;i++) {
			for(int j=n;j>0;j--) {
				if (j<=i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("\n");
		}
		*/
		/*
		for (int i=0;i<n;i++) {
			for(int j=0;j<2*n-1;j++) {
				if ((j>=(n-1)-i) &&(j<=(n-1)+i)) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("\n");		
		}
		
		*/
		/*
		for (int i=0;i<n;i++) {
			for(int j=0;j<2*n-1;j++) {
				if ((j>=(i) &&(j<=2*(n-1)-i))) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("\n");		
		}
		*/
		/*
		 * n*3/2-i
		 * n-1
		 * n-2
		 * n-3
		 * 
		 * 
		 * n-i/2
		 */
		while(true) {
			System.out.print("������ �Է��ϼ���: ");
			int n = input.nextInt();
			
			if (n < 0) break;
			if (n % 2 ==0) continue;
			
			for (int i = 0; i < n; i++) {
				for(int j=0;j<n;j++) {
					if(i<n/2) {
						if (j>=n/2-i&&j<=n/2+i) System.out.print("*");
						else System.out.print(" ");
					} else {
						if (j>=i-n/2&&j<=n*3/2-1-i) System.out.print("*");
						else System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
	private static void testBreak() {
		/*
		 * ���ѹݺ� {
		 * 	������ �Է�
		 * 	������ 0�̸��̳� 100�ʰ��� ��� �ݺ��� �������� = break;
		 * 	������ ����
		 * 	�Է¹��� ������ ������ ���
		 * }
		 * ���� ����/����   ����� ������.
		 */
		Scanner scan = new Scanner(System.in);
		int point = 0;
		int total = 0;
		int times = 0;
		while(true) {
			System.out.println("������ �Է��ϼ���: ");
			point = scan.nextInt();
			if (point < 0 || point > 100) break;
			total += point;
			times++;
		}
		System.out.print("������ ���� " + total+" �����"+total/times+"�Դϴ�");
	}
	private static void testContinue() {
		/* "no news is good news"
		 * �־��� ���ڿ����� ���� 'n'�� �� �� �ִ��� �����.
		 * ���ڿ��� ���� ������ ���ؼ� 
		 *  �� ���ڰ� 'n'�̸� ī��Ʈ�� 1 ����. 
		 */
		String s = "no new is good news";
		int count = 0;
		/*
		char c =s.charAt(1);
		System.out.println(c);
		*/
		
		for (int i = 0; i<s.length(); i++) {
			/*
			System.out.print(s.charAt(i));
			if(s.charAt(i)=='n')count++;
			*/
			if(s.charAt(i)!='n') {
				continue;
			}
			count++;
		}
		System.out.println(count);
		
	}
	private static void testNum() {
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int num = -1;
		int tryCount = 0;
		int nanNum = random.nextInt(1000);
		System.out.println(nanNum);
		do {
			System.out.print("���� �Է��ϼ���[1~1000]: ");
			/*
			 * 1. ����ں��� ������ �Է¹޾� num�� ����
			 * 2. ���� Ȯ���ϰ� num<nanNum�̸� "���� �װͺ��� ū ��"
			 * 3. num>nanNum "���� �װͺ��� ���� ��"
			 * 4. tryCount++;
			 * 5. ������� �õ��� Ƚ���� 
			 */
			num = scan.nextInt();
			tryCount++;
			if (num<nanNum) {
				System.out.println("���� �װͺ��� ū ��");
			}else if (num>nanNum) {
				System.out.println("���� �װͺ��� ���� ��");
			}
		} while(num != nanNum);
		System.out.println("�õ��� Ƚ���� "+tryCount+" �Դϴ�.");
	}
	private static void testFacto() {
		Scanner scan = new Scanner(System.in);
		/*
		 * n! / k!(n-k)!
		 * n/1*((n-1)/2)*((n-2)/3) ...(n-(k-1))/k
		 */
		int num = 45;
		int k = 6;
		double total = 1;
		/*
		System.out.println("���� �Է��ϼ���: ");
		num = scan.nextInt();
		System.out.println("���� �Է��ϼ���: ");
		k = scan.nextInt();
		*/
		for (int i=1;i<=k;i++) {
			total *= (double)(num-i+1)/i;
			System.out.println(total);
		}
		
		System.out.println("1/"+total);
	}
	private static void testPie() {
		/* 
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		long start =System.currentTimeMillis();
		double dividend = 4.0;
		double divisor = 1.0;
		
		double pi = 0.0;
		
		int loopCount = 1000000000;
		
		for (int i=0;i<loopCount;i++) {
			pi += dividend/divisor;
			dividend *= -1;
			divisor += 2;
		}
		System.out.println(pi);
		long end =System.currentTimeMillis();
		System.out.print(end-start);
	}
}
