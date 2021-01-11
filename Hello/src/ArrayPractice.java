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
		System.out.println("\nã�� ���ڸ� �Է��ϼ���. ");
		Scanner input = new Scanner(System.in);
		int searchValue = input.nextInt();
		//int index = -1;
		int i = 0;
		for (; i<num.length;i++) {
			if (searchValue == num[i]) {
				System.out.println(searchValue+"�� �ε��� "+ (i)+"�� �ֽ��ϴ�.");
				//index = i;
			}
		}
		/*if (index>=0) 
						
		 else 
			System.out.println("ã�� �� �����ϴ�.");
		*/
		if(i<num.length)System.out.println(searchValue+"�� �ε��� "+ (i)+"�� �ֽ��ϴ�.");
		else System.out.println("ã�� �� �����ϴ�.");
	}
    private static void testLottery() {
    	/* 1. ���� �迭 lotto ����(������ 6)
    	 * 2. 1~45������ ������ ���� �� 6���� ������ lotto�� ����
    	 * 3. �迭 lotto�� ����� ���� ���.
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
    	System.out.println("�ζǹ�ȣ:");
    	for(int i=0;i<lotto.length;i++) 
    		System.out.print(lotto[i]+" ");
    }
    private static void testDice() {
    	int[] freq = new int[6];
    	Random random= new Random();
    	/* Random ��ü�� ����ص� �ǰ�
    	 * Random random = new Random(); =random.nextInt(45)+;
    	 * 
    	 * Math.random()�� ����ص� �˴ϴ�.
    	 * 0.0(inclusive)~1.0(exclusive)
    	 * �Ǽ���, double float���.
    	 * 	Math.random()*6: 0.0�̻� ~6.0�̸�
    	 * (int)(Math.random()*6)
    	 */
    	for(int i=0;i<10000;i++) {
    		/* int diceNum = 0~5������ �� ����
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
    		/*1. �ڸ��� ���¸� �����ش�
    		 * 2. ����ڷκ��� ���ϴ� �¼���ȣ�� �޴´�. 
    		 * 3. �Է��� �¼���ȣ�� �̹� ����� �ڸ��� �ƴ϶�� 1�� �ٲٰ� ����
    		 * 4. �Է¹��� �¼���ȣ�� �̹� ����� �ڸ���� "�̹� ����� �ڸ��Դϴ�"���
    		 */
    		System.out.print("���ϴ� �¼� ��ȣ�� �Է��ϼ���(����� -1)");
    		int seatNumber = input.nextInt();
    		if (seatNumber <0)break;
    		if(seatNumber>SIZE) {
    			System.out.println("�߸��� �¼���ȣ�Դϴ�.");
    			continue;
    		}
    		if(seats[seatNumber-1]==0) 	seats[seatNumber -1] =1;
    		else System.out.println("�̹� ����� �ڸ��Դϴ�");
    	}
    	System.out.println("�����¼� ���� ���α׷��� �����մϴ�.");
    }
    private static void testAnnymousArray() {
    	int[] nums = {1,2,3,4,5,6,7,8,9,10};
    	int result = 0;
    	//void == ������ ������ ȣ���� ������ ���� ��ȯ���� ����.
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
    	/*nums2�� nums1�� �����ּҸ� �״�� �����Ͽ���
    	 * nums3�� nums1�� ������ ���� �����Ͽ� �ٸ����� ����� �����ּҸ� ������=���ο� �޸� ������ �Ҵ�
    	 * �׷��� nums1�� nums2�� �����ּҰ� ���� nums1�� �����ϸ� nums2�� ���� ����
    	 * ������ nums3�� ���ο� �ּҸ� �Ҵ�޾ұ⿡ nums1�� ����Ǿ ������ ����
    	 */
    }
}
	