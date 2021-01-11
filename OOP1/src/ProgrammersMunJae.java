import java.util.*;

public class ProgrammersMunJae {

	public static void main(String[] args) {
		int n = 27;
		int[] lost = {10,16,19,20,24,26,27};
		int[] reserve = {4,7,8,10,13,14,16,17,18,19,21,22,23,24,25,26,27};
		
//		int[] lost = {-,-,-,20,-,-,-};
//		int[] reserve = {4,7,8,-,13,14,-,17,18,-,21,22,23,-,25,-,-};
		
		int answer = n-lost.length;

        for(int i = 0;i<lost.length;i++){
            for(int j = 0;j<reserve.length;j++){
                if(lost[i]==reserve[j]){
                    lost[i]=-2;
                    reserve[j]=-2;
                    answer++;
                }
            }
        }
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        for(int i = 0;i<lost.length;i++){
            for(int j = 0;j<reserve.length;j++){
                if(lost[i]==-2)
                    break;
                if(reserve[j]==-2)
                    continue;
                if(lost[i]==reserve[j]-1||lost[i]==reserve[j]+1&&lost[i]!=reserve[j]){
                    lost[i]=-2;
                    reserve[j]=-2;
                    answer++;
                }
            }
        }
        System.out.println(answer);
	}
}
