import java.util.*;

public class threeJinbub {

	public static void main(String[] args) {
		int n = 50;
		// TODO Auto-generated method stub
		String threeJinbub = "";
		int answer = 0;
        /*
         * 50/3->16,2
         * 16/3->5,1
         * 5/3->1,2
         * 1212
         * 2121
         * 27,9,3,1
         * 54+9+6+1
         * 
	        45/3->15,0
	        15/3->5,0
	        5/3->1,2
		        ������ n���� 1�� �Ǳ� �� ���� �ݺ�
		        �׷��ϱ� 1�ʰ��� ��� �ݺ�
		        �յڷ� �ٲ۰� �ʿ��ѵ�
	        for�� ������ String 1�������� ������ �� ���� char�� �ְ�
	        String �ʱ�ȭ �ϰ� char�ں��� ������ �ʿ䰡 ����
	        char ������ int answer���� �Ųٷ� �����ϸ鼭*3 
        */
        while(n>1){
            threeJinbub=n%3+threeJinbub;
            
            n=n/3;
        }
        threeJinbub= 1+threeJinbub;
        
        for(int i = threeJinbub.length()-1;i>=0;i--) {
        	answer*=3;
        	answer+=threeJinbub.charAt(i)-'0';
        }
        
        System.out.println(threeJinbub);
        System.out.println(answer);
	}

}
