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
		        나누는 n값이 1이 되기 전 까지 반복
		        그러니까 1초과인 경우 반복
		        앞뒤로 바꾼게 필요한데
	        for문 돌려서 String 1번값부터 마지막 값 까지 char에 넣고
	        String 초기화 하고 char뒤부터 삽입할 필요가 없네
	        char 넣은거 int answer에다 거꾸로 삽입하면서*3 
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
