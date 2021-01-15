package EventAction;


public class RamdaExample {

	public static void main(String[] args) {
		int n = 15;
        // static 
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        

//        int answer = arr[arr.length-1];
        int answer = pibo(n);
        System.out.println(answer);
	}
     public static int pibo(int n){
	         if(n ==0){
	             return 0;
	         }else if(n==1){
	             return 1;
	         }
	
	         return pibo(n-1)+pibo(n-2);
	     }
	
}
