import java.util.*;

public class MinerSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int row = random.nextInt(10)+1;
		int col = random.nextInt(10)+1;
		int mineCount = (int)(row*col*0.4);
		
		int[] mine = new int[row*col];
		
		for(int i = 0; i<mine.length;i++) {
			boolean nansuCorrect = true;
			int nansu = random.nextInt(row*col)+1;
			for(int j = 0;j<i;j++) {
				if(nansu == mine[j]) {
					nansuCorrect = false;
					i--;
					break;
				}
			}
			if(nansuCorrect) {
				mine[i]=nansu;
			}
		}
		for(int i = 0; i<mine.length;i++) {
//			System.out.print((mine[i]<=mineCount)?"O":"X");
			
			
			if(mine[i]<=mineCount) {
				System.out.print("O");
			}else {
				System.out.print("X");
			}
			
			
//			System.out.print(mine[i]);
			if((i+1)%row==0) System.out.println();
		}
//		System.out.println(Arrays.toString(mine));
		System.out.println(mineCount);
		System.out.println((int)(row*col*0.4));
	}

}
