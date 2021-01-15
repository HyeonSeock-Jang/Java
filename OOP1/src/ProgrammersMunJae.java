import java.util.*;

public class ProgrammersMunJae {
	
	public static void main(String[] args) {
//		boolean[][] A = {{true,false},{true,true}};
		boolean[][] A = {
				{true,false,true,false,false,false,false,false},
				{true,true,true,false,false,false,false,false},
				{true,true,true,false,false,false,false,true},
				{false,true,true,true,true,true,true,false},
				{false,true,true,true,true,true,true,false},
				{false,false,true,false,true,false,true,false}};
		
		 int recLength = Math.min(A.length,A[0].length)/2;
//	        int[] start = {0,0};
	        int result = 0;
	        while(recLength>=1){
//	            start[0]=0;
//	            start[1]=0;
	            for(int i = 0;i<A.length-2*recLength+1;i++){
	                for(int j = 0;j<A[0].length-2*recLength+1;j++){
	                    if(A[i][j]){
	                        if(find(A,i,j,recLength)){
	                            result=recLength;
	                            recLength=1;
	                            break;
	                        }
	                    }
	                }
	                if(recLength==1) break;
	            }
	            recLength--;
	        }
	        System.out.println(result);
	}
	public static boolean find(boolean[][] arr, int i, int j, int recLength){
        
        for(int startI = i;startI<i+recLength*2;startI++){
            for(int startJ = j;startJ<i+recLength*2;startJ++){
                if(startI<i+recLength&&startJ>=j+recLength){
                    continue;
                }else if(arr[startI][startJ]==false)
                    return false;
            }
            
        }
        return true;
        /*
        arr¶û i,j½ÃÀÛ À§Ä¡¶û Å½»ö Å©±â °ª
        */
    }
}
