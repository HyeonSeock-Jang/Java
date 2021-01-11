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
	
		// 빛의 속도는 1초에 30만 km를 이동합니다.
		// 빛이 1년동안 이동한 거리를 계산.
		// 빛의 초당속도 * 60 * 60 * 24 * 365 만큼 이동한다.
		
		int lightSpeed = 300000;
		
		int num = 65;
		
		short num2 = (short)num;
		
		System.out.println((char)num2);
		
		long distance = lightSpeed * 60 * 60 * 24 * 365;
				
		System.out.println("빛이 1년동안 이동하는 거리: " + distance);
	}

	private static void calCircleArea() {
		// 원의 면적: r * r * 3.141592
		
		int r = 5;
		
		double pi = 3.141592F;
		
		double area = r * r * pi;
		
		System.out.println("원의 면적은 :" + area);
	}
	
	private static void repFloastLiteral(){
		double d1 = 146.91;
		double d2 = 1.4691E+2;
		System.out.println(d1);
		System.out.println(d2);
	}
	private static void charTest() {
		char ch1 = '가';
		char ch2 = '\uac00';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("가나다\\n\n"
				+ "가나다\\t\t가나다"
				+ "\r캐리지 리턴\\r");

	
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
		
		int result = x++ + y; // result 는 7
		
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
		// ax^2+bx+c의 해를 구하기.
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
		// 문자열 "Hello World!"를 변수 S1에, 문자열 "I'm a new Java Programer!"를 변수s2에 저장하고
		// System.out.println() 메소드를 한 번만 호출에서 아래의 출력을 만들기.
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
		
		System.out.print("첫 번째 정수를 입력하세요. :");
		n1 = input.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요. :");
		n2 = input.nextInt();
		
		sum = SomethingForNothing.sum(n1, n2);
		
		System.out.print("합은 " + sum + "입니다.");
	}
	private static void testCirRec() {
		Scanner input = new Scanner(System.in);
		
		/*
		 * 원 반지름 면적 구하는 프로그램
		 * 반지름 5
		 * 넓이 78.5
		 * 원주 3.14
		 * 넓이 면적 r^2*3.14
		 */
		double r1, r2, m, d, n, pi = 3.14;
		
		System.out.print("반지름을 입력하세요. :");
		r1 = input.nextInt();
		
		n = r1*r1*pi;
		
		System.out.println("반지름은" + n + "입니다.");
		
		/*
		 * 직사각형 넓이와 둘레
		 */
		System.out.print("직사각형의 가로길이를 입력하세요. :");
		r1 = input.nextInt();
		System.out.print("직사각형의 세로길이를 입력하세요. :");
		r2 = input.nextInt();
		
		m = (r1*r2);
		
		d = 2*(r1+r2);
		
		System.out.println("직사각형의 넓이는 " +m+"직사각형 둘레는 "+d+"입니다.");
		
	}
	private static void testIfElse() {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		System.out.print("수를 입력하세요");
		num = input.nextInt();
		
		if (num>0) {
			System.out.println("양수입니다");
		}
		else {
			if (num==0) {
				System.out.println("0입니다");
			}
			else {
				System.out.println("음수입니다");
			}
		}
	}
	private static boolean testLeapYear() {
		
		boolean isLeapYear;
		int year = 2020;
		
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		
		/*
		System.out.print("년도를 입력하세요");
		year = input.nextInt();
		*/
		isLeapYear = year%400==0 || (year%4==0 && year%100!=0);
		/*
		if (isLeapYear) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("윤년이아닙니다.");
		}
		*/
		return isLeapYear;
			
	}
	private static void testOdd() {
		boolean oddsome;
		int num;
		
		System.out.print("정수를입력하시오: ");
		num = input.nextInt();
		
		oddsome = num%2==0;
		
		if (oddsome) {
			System.out.println(num+"은 짝수입니다.");
		} else {
			System.out.println(num+"은 홀수입니다.");
		}
		System.out.println("프로그램을 종료합니다");
	}
	private static void testLarger() {
		int num1;
		int num2;
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		num1 = input.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		num2 = input.nextInt();
		if (num1>num2) {
			System.out.print("더 큰 수: "+num1);
		} else if(num1<num2) {
			System.out.print("더 큰 수: "+num2);
		} else {
			System.out.print(num1+"과"+num2+"는 같습니다.");
		}
			
	}
	private static void testMoney() {
		int goal;
		int money;
		int bonus;
		int left;
		System.out.print("목표를 입력하세요");
		goal = input.nextInt();
		System.out.print("실적을 입력하세요");
		money = input.nextInt();
		
		left = money-goal;
		bonus = (left)/5;
		
		if (money>goal) {
			System.out.println("이번 보너스는"+bonus+"입니다.");
		}else {
			System.out.println("당신이 남겨야 할 실적은"+left+"입니다.");
		}
			
	}
	private static void testPoint() {
		int point;
		System.out.print("점수를 입력하세요");
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
		System.out.print(point+"점은 "+grade+"입니다.");
		
		System.out.println(60<=grade ? "합격":"불합격");
	}
	private static void greetingMessage() {
		/*LocalDateTime dateTime = LocalDateTime.now();
		Date date = new Date();
		
		int currentHour = dateTime.getHour();
		*/
		Calendar calendar=Calendar.getInstance();
		int currentHour = calendar.get(calendar.HOUR_OF_DAY);
		//int currentHour = date.getHours(); //deprecated
		/* 11시 전까지는 "Good morning"
		 * 15시 전까지는 "Good afternoon"
		 * 20시 전까지는 "Good evening"
		 * 24시 전까지는 "Good night" 
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
		System.out.print("점수를 입력하세요");
		int num = input.nextInt();
		char grade;
		/*
		System.out.print("하나의 정수를 입력하세요");
		int num = input.nextInt();
		// indentation
		switch(num) {
		case 1:
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");
			break;
		case 3:
			System.out.println("셋");
			break;
		default:
			System.out.println("너무 많아");
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
		System.out.println("등급은 "+grade+"입니다.");
	}
	private static void testSwitch3() {
		System.out.print("월 이름을 입력하세요");
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
		System.out.print("일수를 알고 싶은 월을 입력하세오: ");
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
		System.out.println(month +"월의 일수는"+day+"입니다.");
	}
	private static void testtest() {
		int a = 3;
		int b;
		if (a == 3) b = 1;
	
	}
	private static void testwhile() {
		//하단을 다섯번 반복
		int i = 0;
		//for.i.range();
		while(i<10) {
			System.out.print(i+" ");
			i++; //i++, ++i
		}
	}
	private static void testmulti() {
		int i = 1;
		// 구구단
		System.out.println("구구단을 외자, 구구단을 외자.");
		int gugu = input.nextInt();
		/* gugu 값이 2에서 19가 아니면 다음을 반복
		 * System.out.println("2~19사이의 값만 입력하세요);
		 * System.out.println("구구단을 외자, 구구단을 외자.");
		 * int gugu = input.nextInt();
		 */
		while((2>gugu)||(gugu>19)){
			System.out.println("2~19사이의 값만 입력하세요");
			 System.out.println("구구단을 외자, 구구단을 외자.");
			 gugu = input.nextInt();
		}
		while (i<20) {
			System.out.println(gugu+"," +i+"에"+ gugu * i
			+ "\n구구단을 외자, 구구단을 외자.");
			i++;
			
		}
	}
	private static void testacc() {
		/* acc += acc++
		 * acc ++
		 */
		int i = 1;
		System.out.println("등차수열");
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
			System.out.print("올바를 월을 입력하세요. [1~12]: ");
			i= input.nextInt();
		}while(i<1||i>12);
		System.out.println("입력한 달은 "+i+"입니다");
	}
	private static void gCD() {
		int x;
		int y;
		int r;
		System.out.println("두개의 정수를 입력하시오[x>y]");
		x = input.nextInt();
		y = input.nextInt();
		do {
			r=x%y;
			x=y;
			y=r;
		}while(r>0);
		System.out.println("두개의 최대 공약수는 "+x);
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
		
		System.out.print("정수를 입력하시오: ");
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
			System.out.print("양의 정수를 입력하시오: ");
			num=input.nextInt();
		} while (num<=0);
		System.out.println(num+"의 약수는");
		for(int i=1;(num/2)>=i;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		System.out.print(num);
	}
	private static void testNanSu() {
		System.out.print("난수의 개수: ");
		int n = input.nextInt();
		
		int ranNum = 0;
		int sum = 0;
		Random random = new Random();
		
		for (int i=0;i<n;i++) {
			ranNum = random.nextInt(100);//0~99사이 난수
			sum += ranNum;
			System.out.print(ranNum+" ");
		}
		System.out.print("\n난수의 합: "+sum);
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
			System.out.print("정수를 입력하세요: ");
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
		 * 무한반복 {
		 * 	정수를 입력
		 * 	점수가 0미만이나 100초과일 경우 반복을 빠져나감 = break;
		 * 	점수를 누적
		 * 	입력받은 점수의 갯수를 기억
		 * }
		 * 누적 점수/갯수   평균을 계산출력.
		 */
		Scanner scan = new Scanner(System.in);
		int point = 0;
		int total = 0;
		int times = 0;
		while(true) {
			System.out.println("점수를 입력하세요: ");
			point = scan.nextInt();
			if (point < 0 || point > 100) break;
			total += point;
			times++;
		}
		System.out.print("점수의 합은 " + total+" 평균은"+total/times+"입니다");
	}
	private static void testContinue() {
		/* "no news is good news"
		 * 주어진 문자열에서 문자 'n'이 몇 개 있는지 세어보자.
		 * 문자열의 문자 각각에 대해서 
		 *  그 문자가 'n'이면 카운트를 1 증가. 
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
			System.out.print("답을 입력하세요[1~1000]: ");
			/*
			 * 1. 사용자부터 정수를 입력받아 num에 저장
			 * 2. 조건 확인하고 num<nanNum이면 "답은 그것보다 큰 값"
			 * 3. num>nanNum "답은 그것보다 작은 값"
			 * 4. tryCount++;
			 * 5. 결과까지 시도한 횟수는 
			 */
			num = scan.nextInt();
			tryCount++;
			if (num<nanNum) {
				System.out.println("답은 그것보다 큰 값");
			}else if (num>nanNum) {
				System.out.println("답은 그것보다 작은 값");
			}
		} while(num != nanNum);
		System.out.println("시도한 횟수는 "+tryCount+" 입니다.");
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
		System.out.println("수를 입력하세요: ");
		num = scan.nextInt();
		System.out.println("수를 입력하세요: ");
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
