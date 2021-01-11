import java.time.*;
import java.util.*;
import java.math.*;

public class ArrayPractice {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		//testStringArray();
		//testBetter();
		//testSequential();
		//testLottery();
		//testDice();
		//testTheaterSeats();
		//testAnnymousArray();
		testArrayCopy();
	}
	private static void testStringArray(){
		String[] array = {"Pepperoni", "Mushrooms", "Onions", "Sausage", "Bacon"};
		
		//System.out.println(array);
		
		for (int i =0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
	private static void testBetter() {
		Random random = new Random(System. currentTimeMillis());
		int[] num = new int[10];
		for (int i = 0; i<num.length;i++) {
			num[i]=random.nextInt(100)+1;
			System.out.print(num[i] + " ");
		}
		int mini = num[0];
		int maxi = num[0];
		
		for (int i=0; i<num.length;i++) {
			if (mini>num[i]) mini = num[i];
			else if (maxi<num[i]) maxi = num[i];
		}
		System.out.println("\n"+mini);
		System.out.println(maxi);
	}
	private static void testSequential() {
		int[] num = new int[10];
		
		Random random = new Random(System.currentTimeMillis());
		for (int i = 0;i<num.length;i++) {
			num[i] = random.nextInt(10) +1;
			System.out.print((num[i])+" ");
		}
		System.out.println("\n찾을 숫자를 입력하세요. ");
		Scanner input = new Scanner(System.in);
		int searchValue = input.nextInt();
		//int index = -1;
		int i = 0;
		for (; i<num.length;i++) {
			if (searchValue == num[i]) {
				System.out.println(searchValue+"는 인덱스 "+ (i)+"에 있습니다.");
				//index = i;
			}
		}
		/*if (index>=0) 
						
		 else 
			System.out.println("찾을 수 없습니다.");
		*/
		if(i<num.length)System.out.println(searchValue+"는 인덱스 "+ (i)+"에 있습니다.");
		else System.out.println("찾을 수 없습니다.");
	}
    private static void testLottery() {
    	/* 1. 정수 배열 lotto 생성(사이즈 6)
    	 * 2. 1~45사이의 임의의 정수 값 6개를 생성해 lotto에 저장
    	 * 3. 배열 lotto에 저장된 값을 출력.
    	 */
    	int[] lotto = new int[6];
    	Random random = new Random(System.currentTimeMillis());
    	
    	//for (int i = 0; i <lotto.length; i++) {
    		//lotto[count++] = random.nextInt(45) +1;
    	int count = 0;
    	while (count<6) {
    		int num = random.nextInt(45)+1;
    		boolean found = false;
    		
    		for (int i = 0; i<count;i++) {
    			if (num==lotto[i]) {
    				found = true;
    				break;
    			}
    		}
    		if (found == false) lotto[count++] = num;
    		//if (num==lotto[count++])
    		//lotto[count++] = random.nextInt(45) +1;
    	}
    	System.out.println("로또번호:");
    	for(int i=0;i<lotto.length;i++) 
    		System.out.print(lotto[i]+" ");
    }
    private static void testDice() {
    	int[] freq = new int[6];
    	Random random= new Random();
    	/* Random 객체를 사용해도 되고
    	 * Random random = new Random(); =random.nextInt(45)+;
    	 * 
    	 * Math.random()를 사용해도 됩니다.
    	 * 0.0(inclusive)~1.0(exclusive)
    	 * 실수형, double float사용.
    	 * 	Math.random()*6: 0.0이상 ~6.0미만
    	 * (int)(Math.random()*6)
    	 */
    	for(int i=0;i<10000;i++) {
    		/* int diceNum = 0~5무작위 값 생성
    		 * freq[diceNum]= freq[diceNum]+1;
    		 */
    		//int diceNum = (int)(Math.random()*6);
    		//freq[diceNum]= freq[diceNum]+1;
    		//freq[diceNum]+=1;
    		//freq[diceNum]++;
    		freq[(int)(Math.random()*6)]++;
    	}
    	int total = 0;
    	for(int i=0;i<freq.length;i++) {
    		System.out.print(freq[i]+" ");
    		total += freq[i];
    	}
    	System.out.println(total+" ");
    }
    private static void testTheaterSeats() {
    	Scanner input = new Scanner(System.in);
    	final int SIZE = 10;
    	int[] seats = new int[SIZE];
    	
    	
    	
    	while (true){
    		System.out.println("----------------------------------------------");
    		System.out.println("1 2 3 4 5 6 7 8 9 10");
    		System.out.println("----------------------------------------------");
    		for (int i=0;i<SIZE;i++) System.out.print(seats[i]+" ");
    		System.out.print("\n");
    		/*1. 자리의 상태를 보여준다
    		 * 2. 사용자로부터 원하는 좌석번호를 받는다. 
    		 * 3. 입력한 좌석번호가 이미 예약된 자리가 아니라면 1로 바꾸고 예약
    		 * 4. 입력받은 좌석번호가 이미 예약된 자리라면 "이미 예약된 자리입니다"출력
    		 */
    		System.out.print("원하는 좌석 번호를 입력하세요(종료는 -1)");
    		int seatNumber = input.nextInt();
    		if (seatNumber <0)break;
    		if(seatNumber>SIZE) {
    			System.out.println("잘못된 좌석번호입니다.");
    			continue;
    		}
    		if(seats[seatNumber-1]==0) 	seats[seatNumber -1] =1;
    		else System.out.println("이미 예약된 자리입니다");
    	}
    	System.out.println("극장좌석 예약 프로그램을 종료합니다.");
    }
    private static void testAnnymousArray() {
    	int[] nums = {1,2,3,4,5,6,7,8,9,10};
    	int result = 0;
    	//void == 실행이 끝나고 호출한 쪽으로 값을 반환하지 않음.
    	/*
    	int n1=1,n2=2;
    	System.out.println("n1:"+n1);
    	/*int result = sum(1,2);
    	System.out.println("result: "+ result);
    	System.out.println("3+4="+ sum(3,4));
    	*/
    	for (int i = 0; i<nums.length;i++) result+=nums[i];
    	System.out.print(result+"\n");
    	result = sum(nums);
    	for (int i=0;i<nums.length;i++)
    		System.out.print(nums[i]+" ");
    }
    private static int sum(int a, int b) {
    	System.out.println("a:"+a+", b:"+b);
    	a = 5;
    	return a + b;
    	
    }
    private static int sum(int[] values) {
    	int result = 0;
    	for (int i=0;i<values.length; i++) result+=values[i];
    	values [0]=100;
    	return result;
    }
    private static void testArrayCopy() {
    	int[] nums1 = {10,20,30,40,50};
    	int[] nums2 = nums1;
    	/*int[] nums3 = new int [nums1.length];
    	for(int i=0;i<nums3.length;i++)
    	nums3[i] = nums1[i];
    	*/
    	
    	int[] nums3 = Arrays.copyOf(nums1, nums1.length);
    	
    	for (int n:nums1)
    		System.out.print(n+" ");
    	nums1[0] =100;
    	nums1[1] =200;
    	System.out.println();
    	for (int n:nums2)
    		System.out.print(n+" ");
    	System.out.println();
    	for (int n:nums3)
    		System.out.print(n+" ");
    	/*nums2는 nums1의 참조주소를 그대로 복사하였고
    	 * nums3는 nums1의 참조한 값을 복사하여 다른곳에 복사된 참조주소를 가져옴=새로운 메모리 공간을 할당
    	 * 그래서 nums1은 nums2와 참조주소가 같아 nums1을 변경하면 nums2도 같이 변경
    	 * 하지만 nums3는 새로운 주소를 할당받았기에 nums1이 변경되어도 변하지 않음
    	 */
    }
}
	