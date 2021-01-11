import java.util.*;

public class FruitsJuice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * 모든 과일은 사람들에게 나눠질 때 사람마다 같은 수량을 받아야 함.
		 * 
		 * 표기형식
		 * 한 사람당 받은 과일 전체 갯수
		 * n과일 m개 *5줄
		 * 
		 * 1. 과일 다섯 종류, 각각 여러개가 있다.
		 * 이 과일을 사람에게 똑같은 수를 나눠주도록 알고리즘을 짜서
		 * 만들어 보시오.
		 * 
		 * 2. 과일 다섯 종류, 각각 여러개가 있다.
		 * 이 과일의 수를 모두 모아보니 5n개로 나누어 떨어진다. 
		 * 이 과일을 사람에게 똑같은 수를 나눠주도록 알고리즘을 짜서
		 * 만들어 보시오.
		 * 
		 * 3. 과일 다섯 종류, 각각 여러개가 있다.
		 * 선물용이기 때문에 과일이 조각나면 안된다.
		 * 또 한 사람 앞에 과일 하나이상 돌아가야 한다.
		 * 이 과일을 사람에게 똑같은 수를 나눠주도록 알고리즘을 짜서
		 * 만들어 보시오.
		 * 
		 * 4. 과일 다섯 종류, 각각 여러개가 있다.
		 * 과일이 이쁘게 깎아야 되기 때문에 과일이 모두 6조각이 나게된다.
		 * 또 한 사람 앞에 과일이 한조각 이상 돌아가야 한다.
		 * 이 과일을 사람에게 똑같은 수로 나눠줄 수 있다록 알고리즘을 짜서
		 * 만들어 보시오.
		 * 
		 * 5. 휴대폰 다섯 종류, 여러개가 있다.
		 * 각 휴대폰은 20%확률로 고장이 나 있을 수 있어 납품 전 폐기처분
		 * 하게 되며 새로 생산하지 않는다.
		 * 판매자가 똑같이 납품 받을 수 있도록 알고리즘을 짜서
		 * 만들어 보시오.
		 * 
		 */
		
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
        int[] answer = new int[commands.length];
        for(int i =0;i<commands.length;i++){
            int[] junlyul = new int[commands[i][1]-commands[i][0]+1];
            int k = 0;
            for(int j = commands[i][0]-1;j<commands[i][1];j++,k++){
                junlyul[k]=array[j];
            }
            Arrays.sort(junlyul);
            answer[i]=junlyul[commands[i][2]];
	        }

	}

}
